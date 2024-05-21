package com.salesintel.model.response;

import com.salesintel.model.User;

import java.util.UUID;

public class UserResponse {

    private final UUID id;

    private final String fullName;

    private final String email;

    public UserResponse(User user) {
        this.id = user.getId();
        this.fullName = user.getFullName();
        this.email = user.getEmail();
    }

    public UUID getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
