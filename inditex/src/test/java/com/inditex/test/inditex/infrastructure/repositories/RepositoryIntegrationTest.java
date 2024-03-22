package com.inditex.test.inditex.infrastructure.repositories;

import com.inditex.test.inditex.infrastructure.entities.BrandEntity;
import com.inditex.test.inditex.infrastructure.entities.PriceEntity;
import com.inditex.test.inditex.infrastructure.entities.ProductEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Optional;


@DataJpaTest
@ExtendWith(SpringExtension.class)
class RepositoryIntegrationTest {

    @Autowired
    private PriceRepository priceRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private BrandRepository brandRepository;

    @Test
    void testFindByProductIdAndBrandIdAndStartDate() {

        BrandEntity brand = new BrandEntity();
        brand.setId(1L);
        brand.setName("BrandName");
        brand.setAddress("BrandAddress");
        brandRepository.save(brand);

        ProductEntity product = new ProductEntity();
        product.setId(1L);
        product.setName("ProductName");
        product.setDescription("ProductDescription");
        productRepository.save(product);

        PriceEntity price = new PriceEntity();
        price.setStartDate(LocalDateTime.now());
        price.setEndDate(LocalDateTime.now().plusDays(1));
        price.setPriceList(1);
        price.setPriority(1);
        price.setAmount(BigDecimal.valueOf(100));
        price.setCurrency("USD");
        price.setBrand(brand);
        price.setProduct(product);
        priceRepository.save(price);

        Optional<PriceEntity> resultA = priceRepository.findById(price.getId());
        Optional<ProductEntity> resultB = productRepository.findById(product.getId());
        Optional<BrandEntity> resultC = brandRepository.findById(brand.getId());

        Assertions.assertTrue(resultA.isPresent());
        Assertions.assertTrue(resultB.isPresent());
        Assertions.assertTrue(resultC.isPresent());

        Assertions.assertEquals(BigDecimal.valueOf(100), resultA.get().getAmount());
        Assertions.assertEquals("ProductName", resultB.get().getName());
        Assertions.assertEquals("BrandName", resultC.get().getName());
    }
}