//define schemas for our claim data and final recommendation. 
//Similar to the patient workflow, we’ll have:
//ClaimInfo: Captures details from the claim document. 
//PolicyCondition: Represents extracted or relevant policy conditions. 
//ClaimEvaluation: Represents the outcome after evaluating the claim against the policy.

package com.claimprocessing.insurenceclaimprocessing;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;

public class ClaimInfo {
    @NotNull
    @JsonProperty("claim_number")
    private String claimNumber;

    @NotNull
    @JsonProperty("policy_number")
    private String policyNumber;

    @NotNull
    @JsonProperty("claimant_name")
    private String claimantName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("date_of_loss")
    private LocalDate dateOfLoss;

    @NotNull
    @JsonProperty("loss_description")
    private String lossDescription;
    @JsonProperty("estimated_repair_cost")
    private double estimatedRepairCost;
    @JsonProperty("vehicle_details")
    private String vehicleDetails;

    // Getters and Setters
    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getClaimantName() {
        return claimantName;
    }

    public void setClaimantName(String claimantName) {
        this.claimantName = claimantName;
    }

    public LocalDate getDateOfLoss() {
        return dateOfLoss;
    }

    public void setDateOfLoss(LocalDate dateOfLoss) {
        this.dateOfLoss = dateOfLoss;
    }

    public String getLossDescription() {
        return lossDescription;
    }

    public void setLossDescription(String lossDescription) {
        this.lossDescription = lossDescription;
    }

    public double getEstimatedRepairCost() {
        return estimatedRepairCost;
    }

    public void setEstimatedRepairCost(double estimatedRepairCost) {
        this.estimatedRepairCost = estimatedRepairCost;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }

    // Constructor
    public ClaimInfo(String claimNumber, String policyNumber, String claimantName, 
                     LocalDate dateOfLoss, String lossDescription, 
                     double estimatedRepairCost, String vehicleDetails) {
        this.claimNumber = claimNumber;
        this.policyNumber = policyNumber;
        this.claimantName = claimantName;
        this.dateOfLoss = dateOfLoss;
        this.lossDescription = lossDescription;
        this.estimatedRepairCost = estimatedRepairCost;
        this.vehicleDetails = vehicleDetails;
    }

    // Default Constructor
    public ClaimInfo() {}

}
