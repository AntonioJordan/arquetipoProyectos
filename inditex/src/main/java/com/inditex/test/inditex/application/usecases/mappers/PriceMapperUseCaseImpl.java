package com.inditex.test.inditex.application.usecases.mappers;

import com.inditex.test.inditex.application.ports.input.PriceMapperUseCase;
import com.inditex.test.inditex.infrastructure.controllers.dto.responsedtos.PriceResponseDto;
import com.inditex.test.inditex.infrastructure.entities.PriceEntity;
import org.springframework.stereotype.Component;

@Component
public class PriceMapperUseCaseImpl implements PriceMapperUseCase {

    @Override
    public PriceResponseDto toDto(PriceEntity price) {
           return PriceResponseDto.builder()
                .brandId(price.getBrand().getId())
                .startDate(price.getStartDate())
                .endDate(price.getEndDate())
                .priceList(price.getPriceList())
                .productId(price.getProduct().getId())
                .finalPrice(price.getAmount())
                .build();
    }
}
