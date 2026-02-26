package com.wdrmaintronic.dto.request;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record CreateComponentRequest(
        @NotBlank
        String name,

        @NotNull
        @DecimalMin(value = "0.00", inclusive = false)
        @Digits(integer = 10, fraction = 2)
        BigDecimal unitPrice,

        @NotNull
        int quantityInStock,

        String description
) { }