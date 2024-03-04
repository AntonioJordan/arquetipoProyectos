package com.base.artefactobase.service.mappers;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.entities.Chair;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ChairMapper {

    List<ChairDto> chairsToChairDtos(List<Chair> chairs);
    List<Chair> chairDtosToChairs(List<ChairDto> chairDtos);

    ChairDto chairToChairDto(Chair chair);
    Chair chairDtoToChair(ChairDto chairDto);


}