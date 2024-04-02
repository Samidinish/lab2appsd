package edu.miu.cs489.appsd.model;

import java.time.LocalDate;

public class PensionPlan {
    Long planReferenceNumber;
    LocalDate  enrollmentDate;
    Double monthlyContribution;
    public PensionPlan(Long planReferenceNumber, LocalDate enrollmentDate, Double monthlyContribution) {
        this.planReferenceNumber = planReferenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.monthlyContribution = monthlyContribution;
    }

    public Long getPlanReferenceNumber() {
        return planReferenceNumber;
    }

    public void setPlanReferenceNumber(Long planReferenceNumber) {
        this.planReferenceNumber = planReferenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public Double getMonthlyContribution() {
        return monthlyContribution;
    }

    public void setMonthlyContribution(Double monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }
}
