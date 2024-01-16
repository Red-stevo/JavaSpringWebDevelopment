package com.redstevo.code.springsecurity.models;

import lombok.AllArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@Component
public class userModel {

    private String name;

    private String roll;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
