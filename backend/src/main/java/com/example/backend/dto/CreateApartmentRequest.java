package com.example.backend.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateApartmentRequest {
    @NotBlank(message = "Apartment name is required")
    private String name;

    private String description;
}
