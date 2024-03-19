package com.base.artefactobase.service.repositories;

import com.base.artefactobase.service.entities.Pencil;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PencilRepository extends CrudRepository<Pencil, Long>{
}
