package com.example.webfrontservice.dto;

import lombok.Getter;

@Getter
public class LoginClientResponseDTO {
    private boolean loggedId;
    private String userName;
    private String userId;
    private String accessToken;
    private String refreshToken;

    public LoginResponseDTO toLoginResponseDTO() {
        return LoginResponseDTO.builder()
                .userName(userName)
                .userId(userId)
                .accessToken(accessToken)
                .url(loggedId ? "/webs" : "/webs/login")
                .message()
                .build()
    }
}
