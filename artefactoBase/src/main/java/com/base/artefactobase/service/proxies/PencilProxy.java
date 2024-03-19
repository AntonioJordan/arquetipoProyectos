package com.base.artefactobase.service.proxies;

import com.base.artefactobase.service.dtos.responses.PencilRespDto;

import java.util.List;

public interface PencilProxy {
    List<PencilRespDto> getAllPencils();
    PencilRespDto getPencil(Long id);
}
