package com.example.webfrontservice.service;

import com.example.webfrontservice.client.AuthClient;
import com.example.webfrontservice.dto.JoinClientResponseDTO;
import com.example.webfrontservice.dto.JoinRequestDTO;
import com.example.webfrontservice.dto.LoginClientResponseDTO;
import com.example.webfrontservice.dto.LoginRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final AuthClient authClient;

    public JoinClientResponseDTO join(JoinRequestDTO joinRequestDTO) {
        return authClient.join(joinRequestDTO);
    }

    public LoginClientResponseDTO login(LoginRequestDTO loginRequestDTO) {
        return authClient.login(loginRequestDTO);
    }

}
