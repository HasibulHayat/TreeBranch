package com.example.backend.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateApartmentResponse {
    private UUID id;

    private String name;

    private String description;
}
