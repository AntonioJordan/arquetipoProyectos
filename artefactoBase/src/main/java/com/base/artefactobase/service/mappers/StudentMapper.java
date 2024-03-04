package com.base.artefactobase.service.mappers;

import com.base.artefactobase.service.dtos.StudentDto;
import com.base.artefactobase.service.entities.Student;
import org.mapstruct.Mapper;

@Mapper
public interface StudentMapper {

    StudentDto studentToStudentDto(Student student);
    Student studentDtoToStudent(StudentDto studentDto);

}