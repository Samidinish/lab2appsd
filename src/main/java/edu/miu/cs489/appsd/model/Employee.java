package edu.miu.cs489.appsd.model;


import java.time.LocalDate;
import java.util.List;

public record Employee(Long employeeId, String firstName, String lastName,
                       LocalDate employmentDate, Double yealySalary, PensionPlan pensionPlan) {
    public Employee {
        if (employeeId == null) {
            throw new IllegalArgumentException("Employee ID cannot be null");
        }
        if (firstName == null || firstName.isBlank()) {
            throw new IllegalArgumentException("First name cannot be null or empty");
        }
        if (lastName == null || lastName.isBlank()) {
            throw new IllegalArgumentException("Last name cannot be null or empty");
        }
        if (employmentDate == null) {
            throw new IllegalArgumentException("Employment date cannot be null");
        }
        if (yealySalary == null || yealySalary < 0) {
            throw new IllegalArgumentException("Yearly salary cannot be null or negative");
        }
        if (pensionPlan == null) {
            throw new IllegalArgumentException("Pension plan cannot be null");
        }
    }
    //String Json block
    public String toJson() {
        return STR."{\n  \"employeeId\": \{employeeId},\n  \"firstName\": \"\{firstName}\",\n  \"lastName\": \"\{lastName}\",\n  \"employmentDate\": \"\{employmentDate}\",\n  \"yealySalary\": \{yealySalary},\n  \"pensionPlan\": {\n    \"planReferenceNumber\": \{pensionPlan.getPlanReferenceNumber()},\n    \"enrollmentDate\": \"\{pensionPlan.getEnrollmentDate()}\",\n    \"monthlyContribution\": \{pensionPlan.getMonthlyContribution()}\n  }\n}";
    }

}
