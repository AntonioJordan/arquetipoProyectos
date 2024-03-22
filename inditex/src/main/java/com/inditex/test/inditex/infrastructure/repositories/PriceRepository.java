package com.inditex.test.inditex.infrastructure.repositories;

import com.inditex.test.inditex.infrastructure.entities.PriceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface PriceRepository extends CrudRepository<PriceEntity, Long> {
    Optional<PriceEntity> findByProductIdAndBrandIdAndStartDate(Long productId, Long brandId, LocalDateTime startDate);
}