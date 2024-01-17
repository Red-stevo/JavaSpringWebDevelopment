package com.redstevo.code.springsecurity.Models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class UserModel {

    private String name;

    private String roll;

    private String password;

}
