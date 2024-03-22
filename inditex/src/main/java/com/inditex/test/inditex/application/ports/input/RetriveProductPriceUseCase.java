package com.inditex.test.inditex.application.ports.input;

import com.inditex.test.inditex.infrastructure.controllers.dto.responsedtos.PriceResponseDto;

import java.time.LocalDateTime;
import java.util.Optional;

public interface RetriveProductPriceUseCase {
    Optional<PriceResponseDto> getPrice(Long productId, Long brandId, LocalDateTime date);
}
