package com.inditex.test.inditex.infrastructure.controllers;

import com.inditex.test.inditex.application.services.ProductPriceService;
import com.inditex.test.inditex.infrastructure.controllers.dto.requestdtos.PriceRequestDto;
import com.inditex.test.inditex.infrastructure.controllers.dto.responsedtos.PriceResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/prices")
public class PriceController {

    private final ProductPriceService productPriceService;

    public PriceController(ProductPriceService productPriceService) {
        this.productPriceService = productPriceService;
    }

    @GetMapping
    public ResponseEntity<PriceResponseDto> getProductPrice(@Validated PriceRequestDto requestDto) {

        Optional<PriceResponseDto> priceDto = productPriceService.getPrice(requestDto.getProductId(), requestDto.getBrandId(), requestDto.getDate());

        return priceDto.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
