package com.example.webfrontservice.dto;

import lombok.Getter;

@Getter
public class LoginClientResponseDTO {
    private boolean loggedId;
    private String userName;
    private String userId;
    private String accessToken;
    private String refreshToken;
}
