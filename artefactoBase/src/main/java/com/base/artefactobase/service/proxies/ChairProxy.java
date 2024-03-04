package com.base.artefactobase.service.proxies;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.entities.Chair;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ChairProxy {
    List<ChairDto> getAllChairs();
    String deleteChair(Long id);
}
