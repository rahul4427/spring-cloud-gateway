package com.sr.core.response;

import lombok.Data;

@Data
public class ApiResponse {
    private String status;
    private Object message;
}
