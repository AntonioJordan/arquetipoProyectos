package com.inditex.test.inditex.application.usecases;

import com.inditex.test.inditex.application.ports.input.PriceMapperUseCase;
import com.inditex.test.inditex.application.ports.input.RetriveProductPriceUseCase;
import com.inditex.test.inditex.infrastructure.controllers.dto.responsedtos.PriceResponseDto;
import com.inditex.test.inditex.infrastructure.entities.PriceEntity;
import com.inditex.test.inditex.infrastructure.repositories.PriceRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Optional;

@Primary
@Component
public class RetriveProductPriceUseCaseImpl implements RetriveProductPriceUseCase {

    private final PriceRepository priceRepository;
    private final PriceMapperUseCase priceMapper;

    public RetriveProductPriceUseCaseImpl(PriceRepository priceRepository, PriceMapperUseCase priceMapper) {
        this.priceRepository = priceRepository;
        this.priceMapper = priceMapper;
    }

    @Override
    public Optional<PriceResponseDto> getPrice(Long productId, Long brandId, LocalDateTime date) {
        Optional<PriceEntity> priceOptional = priceRepository.findByProductIdAndBrandIdAndStartDate(productId, brandId, date);
        return priceOptional.map(priceMapper::toDto);
    }
}