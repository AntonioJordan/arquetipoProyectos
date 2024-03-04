package com.base.artefactobase.service.repositories;

import com.base.artefactobase.service.entities.Chair;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChairRepository extends CrudRepository<Chair, Long> {
    List<Chair> findAll();
}
