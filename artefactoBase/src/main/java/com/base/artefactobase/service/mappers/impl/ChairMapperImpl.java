package com.base.artefactobase.service.mappers.impl;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.dtos.StudentDto;
import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.entities.Student;
import com.base.artefactobase.service.mappers.ChairMapper;
import com.base.artefactobase.service.mappers.StudentMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ChairMapperImpl implements ChairMapper {

    @Override
    public ChairDto chairToChairDto(Chair chair) {
        if (chair == null) {
            return null;
        }

        ChairDto chairDto = new ChairDto();
        chairDto.setId(chair.getId());
        chairDto.setName(chair.getName());
        return chairDto;
    }

    @Override
    public Chair chairDtoToChair(ChairDto chairDto) {
        if (chairDto == null) {
            return null;
        }

        Chair chair = new Chair();
        chair.setId(chairDto.getId());
        chair.setName(chairDto.getName());
        return chair;
    }

    @Override
    public List<ChairDto> chairsToChairDtos(List<Chair> chairs) {
        if (chairs == null) {
            return null;
        }

        List<ChairDto> chairDtos = new ArrayList<>();
        for (Chair chair : chairs) {
            ChairDto chairDto = chairToChairDto(chair);
            List<StudentDto> studentDtos = new ArrayList<>();
            for (Student student : chair.getStudents()) {
                studentDtos.add(StudentMapper.INSTANCE.studentToStudentDto(student));
            }
            chairDto.setStudents(studentDtos);
            chairDtos.add(chairDto);
        }
        return chairDtos;
    }

    @Override
    public List<Chair> chairDtosToChairs(List<ChairDto> chairDtos) {
        if (chairDtos == null) {
            return null;
        }

        List<Chair> chairs = new ArrayList<>();
        for (ChairDto chairDto : chairDtos) {
            chairs.add(chairDtoToChair(chairDto));
        }
        return chairs;
    }
}