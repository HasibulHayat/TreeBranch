package com.example.backend.controller;

import com.example.backend.dto.CreateApartmentRequest;
import com.example.backend.dto.CreateApartmentResponse;
import com.example.backend.service.ApartmentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/apartment")
public class ApartmentController {
    private final ApartmentService apartmentService;

    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @PostMapping
    public ResponseEntity<CreateApartmentResponse> create(@Valid @RequestBody CreateApartmentRequest request) {
        return ResponseEntity.ok(apartmentService.create(request));
    }
}
