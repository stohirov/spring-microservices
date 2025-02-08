package com.example.product_service.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<?> generateResponse(String message, HttpStatus status, Object resObj) {
        Map<String, Object> map = new HashMap<>();

        map.put("message", message);
        map.put("status", status.value());
        map.put("data", resObj);

        return new ResponseEntity<>(map, status);
    }
}
