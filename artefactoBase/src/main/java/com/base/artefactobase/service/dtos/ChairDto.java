package com.base.artefactobase.service.dtos;

import lombok.Data;

import java.util.List;

@Data
public class ChairDto {
    private Long id;
    private String name;
    private List<StudentDto> students;
}