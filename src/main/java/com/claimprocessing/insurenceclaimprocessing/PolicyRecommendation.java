package com.claimprocessing.insurenceclaimprocessing;

public class PolicyRecommendation {
    private String policySection;
    private String recommendationSummary;
    private Double deductible; // Optional field, can be null
    private Double settlementAmount; // Optional field, can be null

    // Default constructor
    public PolicyRecommendation() {}

    // Constructor with required fields
    public PolicyRecommendation(String policySection, String recommendationSummary) {
        this.policySection = policySection;
        this.recommendationSummary = recommendationSummary;
    }

    // Constructor with all fields
    public PolicyRecommendation(String policySection, String recommendationSummary, 
                                Double deductible, Double settlementAmount) {
        this.policySection = policySection;
        this.recommendationSummary = recommendationSummary;
        this.deductible = deductible;
        this.settlementAmount = settlementAmount;
    }

    // Getters and Setters
    public String getPolicySection() {
        return policySection;
    }

    public void setPolicySection(String policySection) {
        this.policySection = policySection;
    }

    public String getRecommendationSummary() {
        return recommendationSummary;
    }

    public void setRecommendationSummary(String recommendationSummary) {
        this.recommendationSummary = recommendationSummary;
    }

    public Double getDeductible() {
        return deductible;
    }

    public void setDeductible(Double deductible) {
        this.deductible = deductible;
    }

    public Double getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(Double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

}
