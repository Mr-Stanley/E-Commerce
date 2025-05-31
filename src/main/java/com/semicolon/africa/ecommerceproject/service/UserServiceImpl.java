package com.semicolon.africa.ecommerceproject.service;

import com.semicolon.africa.ecommerceproject.dtos.request.LoginRequest;
import com.semicolon.africa.ecommerceproject.dtos.request.CreateUserRequest;
import com.semicolon.africa.ecommerceproject.dtos.response.LoginResponse;
import com.semicolon.africa.ecommerceproject.models.User;
import com.semicolon.africa.ecommerceproject.repositories.UserRepository;
import com.semicolon.africa.ecommerceproject.utility.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Override
    public String CreateUser(CreateUserRequest createUser) {
        User newUser = new User();
        newUser.setUserName(createUser.getUserName());
        newUser.setEmail(createUser.getEmail());
        newUser.setRole(createUser.getRole(Role.ROLE_CUSTOMER));
        newUser.setCreatedAt(createUser.getCreatedAt());
        newUser.setPassword(createUser.getPassword());
        String hashedPassword = BCrypt.hashpw(createUser.getPassword(), BCrypt.gensalt());
        newUser.setPassword(hashedPassword);
        userRepository.save(newUser);


        return "User Registered Successfully";
    }

    @Override
    public String Login(LoginRequest loginRequest) {

        User registeredUser = userRepository.findUserByEmail(loginRequest.getEmail());

        if(registeredUser == null) {
            throw new IllegalArgumentException("User not found");
        }
        if (!BCrypt.checkpw(loginRequest.getPassword(), registeredUser.getPassword())) {
            throw new IllegalArgumentException("Wrong password");
        }

    LoginResponse response = new LoginResponse();
    response.setMessage("User Login Successfully");

    return response.toString();

        }

}
