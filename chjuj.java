package com.example.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Positive
    private BigDecimal amount;

    @NotBlank
    private String category;

    private String description;

    @NotNull
    @PastOrPresent
    private LocalDate date;

    // Getters and Setters
}

