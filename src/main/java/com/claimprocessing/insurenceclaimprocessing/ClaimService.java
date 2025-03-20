package com.claimprocessing.insurenceclaimprocessing;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ClaimService {

    public ClaimInfo parseClaim(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        // Read JSON file and convert it to ClaimInfo object
        return objectMapper.readValue(new File(filePath), ClaimInfo.class);
    }
}
