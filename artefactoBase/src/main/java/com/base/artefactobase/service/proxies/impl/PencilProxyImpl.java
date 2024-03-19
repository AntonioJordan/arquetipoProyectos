package com.base.artefactobase.service.proxies.impl;

import com.base.artefactobase.service.dtos.responses.PencilRespDto;
import com.base.artefactobase.service.mappers.PencilMapper;
import com.base.artefactobase.service.proxies.PencilProxy;
import com.base.artefactobase.service.services.PencilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PencilProxyImpl implements PencilProxy {

    private final PencilMapper pencilMapper;
    private final PencilService pencilService;

    @Autowired
    public PencilProxyImpl(PencilMapper pencilMapper, PencilService pencilService) {
        this.pencilMapper = pencilMapper;
        this.pencilService = pencilService;
    }

    @Override
    public List<PencilRespDto> getAllPencils() {
        return pencilMapper.pencilsToPencilRespDtos(this.pencilService.getAllPencils());
    }


    @Override
    public PencilRespDto getPencil(Long id) {
        return pencilMapper.pencilToPencilRespDto(this.pencilService.getPencil(id));
    }
}
