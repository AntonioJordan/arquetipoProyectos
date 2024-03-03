package com.base.artefactobase.service.repositories;

import com.base.artefactobase.service.entities.Chair;
import org.springframework.data.repository.CrudRepository;

public interface ChairRepository extends CrudRepository<Chair, Long> {
}
