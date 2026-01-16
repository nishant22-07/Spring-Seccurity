package com.example.securitydemo.loginDTO;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter


public class LoginRequest {

    private String username;
    private String password;
}
