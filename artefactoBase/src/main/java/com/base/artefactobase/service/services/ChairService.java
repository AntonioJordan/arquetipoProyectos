package com.base.artefactobase.service.services;

import com.base.artefactobase.service.entities.Chair;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ChairService {
    List<Chair> getAllChairs();
}
