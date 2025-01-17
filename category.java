package com.example.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    private String description;

    // Getters and Setters
}
