package com.base.artefactobase.service.mappers.impl;

import com.base.artefactobase.service.dtos.responses.PencilRespDto;
import com.base.artefactobase.service.entities.Pencil;
import com.base.artefactobase.service.mappers.PencilMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PencilMapperImpl implements PencilMapper {

    @Override
    public PencilRespDto pencilToPencilRespDto(Pencil pencil) {
        if (pencil == null) {
            return null;
        }

        PencilRespDto pencilRespDto = new PencilRespDto();
        pencilRespDto.setId(pencil.getId());
        pencilRespDto.setName(pencil.getName());

        return pencilRespDto;
    }

    @Override
    public List<PencilRespDto> pencilsToPencilRespDtos(List<Pencil> pencils) {
        if (pencils == null) {
            return null;
        }

        List<PencilRespDto> pencilRespDtos = new ArrayList<>();
        for (Pencil pencil : pencils) {
            pencilRespDtos.add(pencilToPencilRespDto(pencil));
        }
        return pencilRespDtos;
    }

    @Override
    public Pencil pencilRespDtoToPencil(PencilRespDto pencilRespDto) {
        if (pencilRespDto == null) {
            return null;
        }

        Pencil pencil = new Pencil();
        pencil.setId(pencilRespDto.getId());
        pencil.setName(pencilRespDto.getName());

        return pencil;
    }

    @Override
    public List<Pencil> pencilRespDtosToPencils(List<PencilRespDto> pencilRespDtos) {
        if (pencilRespDtos == null) {
            return null;
        }

        List<Pencil> pencils = new ArrayList<>();
        for (PencilRespDto pencilRespDto : pencilRespDtos) {
            pencils.add(pencilRespDtoToPencil(pencilRespDto));
        }
        return pencils;
    }
}