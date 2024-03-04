package com.base.artefactobase.service.mappers;

import com.base.artefactobase.service.dtos.StudentDto;
import com.base.artefactobase.service.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);

    StudentDto studentToStudentDto(Student student);
}