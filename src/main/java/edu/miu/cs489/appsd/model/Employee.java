package edu.miu.cs489.appsd.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private Long employeeId;
    private String firstName;
    private String lastName;
    private LocalDate employmentDate;
    private Double yealySalary;
    private PensionPlan pensionPlan;

    public Employee(Long employeeId, String firstName, String lastName,
                    LocalDate employmentDate, Double yealySalary, PensionPlan pensionPlan) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yealySalary = yealySalary;
        this.pensionPlan = pensionPlan;
    }

    public PensionPlan getPensionPlan() {
        return pensionPlan;
    }
    public String getLastName() {
        return lastName;
    }

    public Double getYealySalary() {
        return yealySalary;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    // Convert Employee details to a JSON-like format
    public String toJson() {
        String pensionPlanJson = pensionPlan == null ? "null" : String.format(
                "\"planReferenceNumber\": \"%s\", \"enrollmentDate\": \"%s\", \"monthlyContribution\": %.2f",
                pensionPlan.getPlanReferenceNumber(),
                pensionPlan.getEnrollmentDate().format(DateTimeFormatter.ISO_LOCAL_DATE),
                pensionPlan.getMonthlyContribution()
        );

        return String.format("{ \"employeeId\": \"%d\", \"firstName\": \"%s\", \"lastName\": \"%s\", \"yealySalary\": \"%.2f\", \"employmentDate\": \"%s\", %s }",
                employeeId,
                firstName,
                lastName,
                yealySalary,
                employmentDate.format(DateTimeFormatter.ISO_LOCAL_DATE),
                pensionPlanJson
        );
    }

}
