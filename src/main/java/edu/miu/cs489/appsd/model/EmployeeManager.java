package edu.miu.cs489.appsd.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        LocalDate nextMonthLocalDate = LocalDate.now().plusMonths(1);//4, May 2024
//        LocalDate qualifiedLocalDate = localDateStart.plusMonths(1).minusDays(1);

        List<Employee> upcomingEnrollees = employees.stream()
                .filter(employee -> employee.getPensionPlan() == null)
                .filter(employee -> (employee.getEmploymentDate().plusYears(5).getMonth().equals(nextMonthLocalDate.getMonth())
                        &&
                        employee.getEmploymentDate().plusYears(5).getYear() == nextMonthLocalDate.getYear())
                        )
                .sorted(Comparator.comparing(Employee::getEmploymentDate))
                .toList();

        for (Employee employee : upcomingEnrollees) {
            System.out.println(employee.toJson());
        }


    }

}


