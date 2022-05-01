package com.mysite.sbb.user;

import lombok.Getter;

@Getter
public enum UserRole {
    Admin("ROLE_ADMIN"),
    User("ROLE_USER");

    UserRole(String value) {
        this.value = value;
    }

    private String value;
}
