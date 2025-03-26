package com.example.webfrontservice.controller;

import com.example.webfrontservice.dto.CreateCatalogRequestDTO;
import com.example.webfrontservice.dto.CreateCatalogResponseDTO;
import com.example.webfrontservice.service.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@RestController
@RequiredArgsConstructor
@RequestMapping("/webs/api/catalog")
public class HomeApiController {

    private final CatalogService catalogService;

    @PostMapping
    public CreateCatalogResponseDTO createCatalog(
            @RequestHeader(value = AUTHORIZATION, required = false) String accessToken,
            @RequestBody CreateCatalogRequestDTO createCatalogRequestDTO
    ) {
        return catalogService.createCatalog(accessToken, createCatalogRequestDTO);
    }

}
