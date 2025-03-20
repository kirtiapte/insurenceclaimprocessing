package com.claimprocessing.insurenceclaimprocessing;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/claims")
public class ClaimController {
    private final ClaimService claimService;

    // Constructor injection for ClaimService
    @Autowired
    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @GetMapping("/parse/{fileName}")
    public ClaimInfo getClaimInfo(@PathVariable String fileName) {
        try {
            String filePath = "claims-data/" + fileName + ".json";
            // Parse the claim from the file
            return claimService.parseClaim(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error parsing claim from file", e);
        }
    }

}
