package com.example.cruddemo.response;

//1. create error response class
//2. create custom exception class
//3.Update service
//4.exception handler
public class EmployeeErrorResponse {
    private int status;
    private String message;
    private long timestamp;

    public EmployeeErrorResponse() {
    }

    public EmployeeErrorResponse(int status, String message, long timestamp) {
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }
}
