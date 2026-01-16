package com.example.securitydemo.loginDTO;


import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class LoginResponse {

    private String username;
    private List<String> roles;
    private String jwtToken;
}
