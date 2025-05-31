package com.semicolon.africa.ecommerceproject.service;

import com.semicolon.africa.ecommerceproject.dtos.request.LoginRequest;
import com.semicolon.africa.ecommerceproject.dtos.request.CreateUserRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    String CreateUser(CreateUserRequest createUser);

    String Login(LoginRequest loginRequest);
}
