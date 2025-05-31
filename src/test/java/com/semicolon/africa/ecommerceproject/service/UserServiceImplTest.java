package com.semicolon.africa.ecommerceproject.service;

import com.semicolon.africa.ecommerceproject.dtos.request.LoginRequest;
import com.semicolon.africa.ecommerceproject.dtos.request.CreateUserRequest;
import com.semicolon.africa.ecommerceproject.models.User;
import com.semicolon.africa.ecommerceproject.repositories.UserRepository;
import com.semicolon.africa.ecommerceproject.utility.Role;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class UserServiceImplTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;

    @BeforeEach
    public void setUp() {
        userRepository.deleteAll();
    }

    @Test
    public void testThatUserCanCreateAccount() {
        CreateUserRequest createUser = new CreateUserRequest();
        createUser.setUserName("Stan");
        createUser.setEmail("Stanleyugoo5@gmail.com");
        createUser.setPassword("1234567890");
        createUser.setRole(Role.ROLE_CUSTOMER);

        String actualResponse = userService.CreateUser(createUser);

        assertNotNull(actualResponse);
        assertEquals("User Registered Successfully", actualResponse);

        User createdUser = userRepository.findUserByEmail(createUser.getEmail());
        assertNotNull(createdUser);
        assertEquals("Stanleyugoo5@gmail.com", createdUser.getEmail());
        assertEquals("Stan", createdUser.getUserName());
        assertEquals(Role.ROLE_CUSTOMER, createdUser.getRole());
    }


    @Test
    public void testThatUserCanLogin() {
        CreateUserRequest createUser = new CreateUserRequest();
        createUser.setUserName("Ugoo");
        createUser.setEmail("Stanley@gmail.com");
        createUser.setPassword("1234567890");
        createUser.setRole(Role.ROLE_CUSTOMER);

        String actualResponse = userService.CreateUser(createUser);

        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setEmail(createUser.getEmail());
        loginRequest.setPassword(createUser.getPassword());


        String loginResponse = userService.Login(loginRequest);
        assertNotNull(actualResponse);
        assertEquals("User Login Successfully", loginResponse);


    }
}

