package com.claimprocessing.insurenceclaimprocessing;

public class ClaimDecision {
    private String claimNumber;
    private boolean covered;
    private double deductible;
    private double recommendedPayout;
    private String notes; // Optional field, can be null

    // Default constructor
    public ClaimDecision() {}

    // Constructor with all fields
    public ClaimDecision(String claimNumber, boolean covered, double deductible, 
                         double recommendedPayout, String notes) {
        this.claimNumber = claimNumber;
        this.covered = covered;
        this.deductible = deductible;
        this.recommendedPayout = recommendedPayout;
        this.notes = notes;
    }

    // Getters and Setters
    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public boolean isCovered() {
        return covered;
    }

    public void setCovered(boolean covered) {
        this.covered = covered;
    }

    public double getDeductible() {
        return deductible;
    }

    public void setDeductible(double deductible) {
        this.deductible = deductible;
    }

    public double getRecommendedPayout() {
        return recommendedPayout;
    }

    public void setRecommendedPayout(double recommendedPayout) {
        this.recommendedPayout = recommendedPayout;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
