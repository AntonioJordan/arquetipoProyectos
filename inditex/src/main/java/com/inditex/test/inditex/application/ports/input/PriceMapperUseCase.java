package com.inditex.test.inditex.application.ports.input;

import com.inditex.test.inditex.infrastructure.controllers.dto.responsedtos.PriceResponseDto;
import com.inditex.test.inditex.infrastructure.entities.PriceEntity;

public interface PriceMapperUseCase {
    PriceResponseDto toDto(PriceEntity price);
}
