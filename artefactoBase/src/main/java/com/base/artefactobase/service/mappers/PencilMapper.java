package com.base.artefactobase.service.mappers;

import com.base.artefactobase.service.dtos.responses.PencilRespDto;
import com.base.artefactobase.service.entities.Pencil;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface PencilMapper {

    PencilRespDto pencilToPencilRespDto(Pencil pencil);
    List<PencilRespDto> pencilsToPencilRespDtos(List<Pencil> pencils);
    Pencil pencilRespDtoToPencil(PencilRespDto pencilRespDto);
    List<Pencil> pencilRespDtosToPencils(List<PencilRespDto> pencilRespDtos);

}