package com.base.artefactobase.service.proxies.impl;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.mappers.ChairMapper;
import com.base.artefactobase.service.proxies.ChairProxy;
import com.base.artefactobase.service.services.ChairService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
        return chairMapper.chairsToChairDtos(chairService.getAllChairs());
    }
}
