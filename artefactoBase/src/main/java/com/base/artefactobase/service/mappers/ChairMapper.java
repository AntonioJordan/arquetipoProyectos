package com.base.artefactobase.service.mappers;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.entities.Chair;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ChairMapper {
    ChairMapper INSTANCE = Mappers.getMapper(ChairMapper.class);

    @Mapping(target = "students", ignore = true)
    ChairDto chairToChairDto(Chair chair);

    Chair chairDtoToChair(ChairDto chairDto);

    List<ChairDto> chairsToChairDtos(List<Chair> chairs);

    List<Chair> chairDtosToChairs(List<ChairDto> chairDtos);
}