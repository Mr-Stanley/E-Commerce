package com.semicolon.africa.ecommerceproject.dtos.response;

public class LoginResponse {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message; // Return the message field instead of the default toString
    }
}