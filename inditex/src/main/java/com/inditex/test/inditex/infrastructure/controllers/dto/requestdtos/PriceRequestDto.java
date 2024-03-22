package com.inditex.test.inditex.infrastructure.controllers.dto.requestdtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class PriceRequestDto {

    @NotNull(message = "Date cannot be null")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime date;

    @NotNull(message = "Product ID cannot be null")
    private Long productId;

    @NotNull(message = "Brand ID cannot be null")
    private Long brandId;
}