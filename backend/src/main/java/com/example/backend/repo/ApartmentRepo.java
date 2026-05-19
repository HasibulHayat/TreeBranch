package com.example.backend.repo;

import com.example.backend.model.Apartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ApartmentRepo extends JpaRepository<Apartment, UUID> {
    boolean existsByName(String name);
}
