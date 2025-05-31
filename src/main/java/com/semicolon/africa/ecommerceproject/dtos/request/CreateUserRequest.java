package com.semicolon.africa.ecommerceproject.dtos.request;

import com.semicolon.africa.ecommerceproject.utility.Role;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class CreateUserRequest {
    @Id
    private int id;
    private String userName;
    private String email;
    private String password;
    private Enum Role;
    private LocalDateTime createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Enum getRole(Role roleCustomer) {
        return Role;
    }

    public void setRole(Enum role) {
        this.Role = role;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
