package com.base.artefactobase.service.proxies;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.entities.Chair;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ChairProxy {
    List<ChairDto> getAllChairs();
    Optional<String> deleteChair(Long id);
}
