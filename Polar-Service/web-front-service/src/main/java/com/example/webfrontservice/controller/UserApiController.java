package com.example.webfrontservice.controller;

import com.example.webfrontservice.dto.*;
import com.example.webfrontservice.service.UserService;
import com.example.webfrontservice.utill.CookieUtil;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    @PostMapping("/join")
    public JoinResponseDTO join(@RequestBody JoinRequestDTO joinRequestDTO) {
        return userService.join(joinRequestDTO)
                .toJoinResponseDTO();
    }

    @PostMapping("/login")
    public LoginResponseDTO loin(
            HttpServletResponse response,
            @RequestMapping LoginRequestDTO loginRequestDTO
    ){
        LoginClientResponseDTO logined = userService.login(loginRequestDTO);

        if (logined != null && logined.isLoggedId()) {
            CookieUtil.addCookie(response "refreshToken",logined.getRefreshToken(), 7*24*60*60);
        }

        assert logined != null;
        return logined.toLoginResponseDTO();

    }

}
