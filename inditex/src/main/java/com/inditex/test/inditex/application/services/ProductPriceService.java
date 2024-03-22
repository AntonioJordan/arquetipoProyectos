package com.inditex.test.inditex.application.services;

import com.inditex.test.inditex.application.ports.input.RetriveProductPriceUseCase;
import com.inditex.test.inditex.infrastructure.controllers.dto.responsedtos.PriceResponseDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class ProductPriceService implements RetriveProductPriceUseCase {

    private final RetriveProductPriceUseCase retriveProductPrice;

    public ProductPriceService(RetriveProductPriceUseCase retriveProductPrice) {
        this.retriveProductPrice = retriveProductPrice;
    }

    @Override
    public Optional<PriceResponseDto> getPrice(Long productId, Long brandId, LocalDateTime date) {
        return retriveProductPrice.getPrice(productId, brandId, date);
    }
}