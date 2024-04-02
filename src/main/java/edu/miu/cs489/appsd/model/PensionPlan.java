package edu.miu.cs489.appsd.model;
import java.time.LocalDate;


public class PensionPlan {
    private String planReferenceNumber;
    private LocalDate enrollmentDate;
    private Double monthlyContribution;
    public PensionPlan(String planReferenceNumber, LocalDate enrollmentDate, Double monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
    }

    public String getPlanReferenceNumber() {
        return planReferenceNumber;
    }
    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }
    public Double getMonthlyContribution() {
        return monthlyContribution;
    }
}
