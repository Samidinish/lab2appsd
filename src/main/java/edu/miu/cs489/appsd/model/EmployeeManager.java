package edu.miu.cs489.appsd.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
    public void printAllEmployees() {
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparing(Employee::getLastName)
                        .thenComparing(Employee::getYealySalary, Comparator.reverseOrder()))
                .toList();

        for (Employee employee : sortedEmployees) {
            System.out.println(employee.toJson());
        }
    }
    public void printUpcomingEnrollees() {
        LocalDate nextMonthStart = LocalDate.now().plusMonths(1).withDayOfMonth(1);
        LocalDate nextMonthEnd = nextMonthStart.plusMonths(1).minusDays(1);

        List<Employee> upcomingEnrollees = employees.stream()
                .filter(e -> e.getPensionPlan() == null || e.getPensionPlan().getPlanReferenceNumber() == null)
                .filter(e -> (e.getEmploymentDate().isEqual(nextMonthStart) ||
                        e.getEmploymentDate().isEqual(nextMonthEnd) ||
                        (e.getEmploymentDate().isAfter(nextMonthStart) && e.getEmploymentDate().isBefore(nextMonthEnd))))
                .sorted(Comparator.comparing(Employee::getEmploymentDate))
                .toList();

        for (Employee employee : upcomingEnrollees) {
            System.out.println(employee.toJson());
        }
    }

}


