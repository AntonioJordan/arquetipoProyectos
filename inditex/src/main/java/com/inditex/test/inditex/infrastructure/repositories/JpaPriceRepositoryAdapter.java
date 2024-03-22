package com.inditex.test.inditex.infrastructure.repositories;

import com.inditex.test.inditex.application.ports.output.PriceRepositoryAdapter;
import org.springframework.stereotype.Component;

@Component
public class JpaPriceRepositoryAdapter implements PriceRepositoryAdapter {

    PriceRepository priceRepository;

    public JpaPriceRepositoryAdapter(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }

}
