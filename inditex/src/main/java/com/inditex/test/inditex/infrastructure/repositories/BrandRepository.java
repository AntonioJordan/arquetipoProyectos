package com.inditex.test.inditex.infrastructure.repositories;

import com.inditex.test.inditex.infrastructure.entities.BrandEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends CrudRepository<BrandEntity, Long> {
}
