package com.base.artefactobase.service.mappers.impl;

import com.base.artefactobase.service.dtos.StudentDto;
import com.base.artefactobase.service.entities.Student;
import com.base.artefactobase.service.mappers.StudentMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapperImpl implements StudentMapper {

    @Override
    public StudentDto studentToStudentDto(Student student) {
        if (student == null) {
            return null;
        }

        return StudentDto.builder()
                .id(student.getId())
                .name(student.getName())
                .build();
    }
}