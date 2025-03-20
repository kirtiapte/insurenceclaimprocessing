package com.claimprocessing.insurenceclaimprocessing;

import java.util.ArrayList;
import java.util.List;

public class PolicyQueries {
    private List<String> queries;

    // Default constructor
    public PolicyQueries() {
        this.queries = new ArrayList<>();
    }

    // Constructor with queries
    public PolicyQueries(List<String> queries) {
        this.queries = queries;
    }

    // Getters and Setters
    public List<String> getQueries() {
        return queries;
    }

    public void setQueries(List<String> queries) {
        this.queries = queries;
    }

    // Optional: Method to add a query
    public void addQuery(String query) {
        if (queries == null) {
            queries = new ArrayList<>();
        }
        queries.add(query);
    }

}
