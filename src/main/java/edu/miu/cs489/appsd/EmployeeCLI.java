package edu.miu.cs489.appsd;

import com.google.gson.Gson;
import edu.miu.cs489.appsd.model.Employee;
import edu.miu.cs489.appsd.model.PensionPlan;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.lang.StringTemplate.STR;

public class EmployeeCLI {
    public static void main(String[] args) {


        var empList = new java.util.ArrayList<>(List.of(
                new Employee(1L, "John", "Doe", LocalDate.of(2020, 1, 1), 100000.0,
                        new PensionPlan(1L, LocalDate.of(2020, 1, 1), 1000.0)),
                new Employee(2L, "Jane", "Doe", LocalDate.of(2020, 1, 1), 100000.0,
                        new PensionPlan(2L, LocalDate.of(2020, 1, 1), 1000.0)),
                new Employee(3L, "Jim", "Doe", LocalDate.of(2020, 1, 1), 100000.0,
                        new PensionPlan(3L, LocalDate.of(2020, 1, 1), 1000.0)),
                new Employee(4L, "Jill", "Doe", LocalDate.of(2020, 1, 1), 100000.0,
                        new PensionPlan(4L, LocalDate.of(2020, 1, 1), 1000.0))
        ));
        empList.sort(Comparator.comparing(Employee::lastName)
                .thenComparing(Employee::yealySalary, Comparator.reverseOrder()));
        empList.forEach(emp -> System.out.println(emp.toJson()));
    }

}
