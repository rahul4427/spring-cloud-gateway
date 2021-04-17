package com.sr.core.helper;

import com.sr.core.response.ApiResponse;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@UtilityClass
public class ResponseHelper {

    public ResponseEntity<ApiResponse> createSuccessResponse(Object object) {
        return createSuccessResponse(object, HttpStatus.OK);
    }

    public ResponseEntity<ApiResponse> createSuccessResponse(Object object, HttpStatus httpStatus) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setStatus("success");
        apiResponse.setMessage(object);
        return new ResponseEntity<>(apiResponse, httpStatus);
    }
}
