package com.base.artefactobase.service.repositories;

import com.base.artefactobase.service.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
