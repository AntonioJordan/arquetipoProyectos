package com.base.artefactobase.service.proxies.impl;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.mappers.ChairMapper;
import com.base.artefactobase.service.proxies.ChairProxy;
import com.base.artefactobase.service.services.ChairService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ChairProxyImpl implements ChairProxy {

    private final ChairService chairService;
    private final ChairMapper chairMapper;

    @Autowired
    public ChairProxyImpl(ChairService chairService, ChairMapper chairMapper) {
        this.chairService = chairService;
        this.chairMapper = chairMapper;
    }

    @Override
    public List<ChairDto> getAllChairs() {
        List<Chair> chairDtos = chairService.getAllChairs().orElse(
                Collections.emptyList()
        );
        return chairMapper.chairsToChairDtos(chairDtos);
    }

    @Override
    public Optional<String> deleteChair(Long id) {
        return chairService.deleteChair(id);
    }
}
