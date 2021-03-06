package com.company.shoping.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateUserCommand {
    private String name;
    private String surname;
    private Date birthDate;
    private Long balance;
    private String email;
    private String password;
    private String phone;
}
