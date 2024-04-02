package edu.miu.cs489.appsd;
import edu.miu.cs489.appsd.model.Employee;
import edu.miu.cs489.appsd.model.EmployeeManager;
import edu.miu.cs489.appsd.model.PensionPlan;

import java.time.LocalDate;

public class EmployeeCLI {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        PensionPlan pensionPlan1 = new PensionPlan("EX1089", LocalDate.parse("2023-01-17"), 100.00);
        Employee employee1 = new Employee(1L, "Daniel", "Agar", LocalDate.parse("2018-01-17"), 105945.50, pensionPlan1);
        Employee employee2 = new Employee(2L, "Benard", "Shaw", LocalDate.parse("2019-04-03"), 197750.00, null);
        PensionPlan pensionPlan2 = new PensionPlan("SM2307", LocalDate.parse("2019-11-04"), 1555.50);
        Employee employee3 = new Employee(3L, "Carly", "Agar", LocalDate.parse("2014-05-16"), 842000.75, pensionPlan2);
        Employee employee4 = new Employee(4L, "Wesley", "Schneider", LocalDate.parse("2019-05-02"), 74500.00, null);

        employeeManager.addEmployee(employee1);
        employeeManager.addEmployee(employee2);
        employeeManager.addEmployee(employee3);
        employeeManager.addEmployee(employee4);

        System.out.println("//////////////////////////////");
        System.out.println("All Employees:");
        employeeManager.printAllEmployees();

        System.out.println("//////////////////////////////");

        System.out.println("\nUpcoming Pension Enrollees:");
        employeeManager.printUpcomingEnrollees();
    }
}

