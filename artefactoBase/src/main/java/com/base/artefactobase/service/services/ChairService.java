package com.base.artefactobase.service.services;

import com.base.artefactobase.service.entities.Chair;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ChairService {
    Optional<List<Chair>> getAllChairs();
    Optional<String> deleteChair(Long id);
}
