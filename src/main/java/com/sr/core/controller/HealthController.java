package com.sr.core.controller;

import com.sr.core.helper.ResponseHelper;
import com.sr.core.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/p/health")
public class HealthController {

    private Date applicationStartTime;

    @Autowired
    private void setup() {
        applicationStartTime = new Date();
    }

    @GetMapping
    private ResponseEntity<ApiResponse> getHealth() {
        Map<String, String> response = new HashMap<>();
        response.put("status","Up and Running");
        response.put("startTime", applicationStartTime.toString());
        return ResponseHelper.createSuccessResponse(response);
    }
}
