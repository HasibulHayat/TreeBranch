package com.example.backend.service;

import com.example.backend.dto.CreateApartmentRequest;
import com.example.backend.dto.CreateApartmentResponse;
import com.example.backend.model.Apartment;
import com.example.backend.repo.ApartmentRepo;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

@Service
public class ApartmentService {
    private final ApartmentRepo apartmentRepo;

    public ApartmentService(ApartmentRepo apartmentRepo) {
        this.apartmentRepo = apartmentRepo;
    }

    public CreateApartmentResponse create(CreateApartmentRequest request) {
        if (apartmentRepo.existsByName(request.getName())) {
            throw new IllegalArgumentException("Apartment name already exists");
        }

        Apartment apartment = Apartment.builder()
                .name(request.getName())
                .description(request.getDescription())
                .build();

        apartmentRepo.save(apartment);

        return CreateApartmentResponse.builder()
                .id(apartment.getId())
                .name(apartment.getName())
                .description(apartment.getDescription())
                .build();
    }
}
