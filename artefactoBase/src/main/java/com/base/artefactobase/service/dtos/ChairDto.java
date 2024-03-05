package com.base.artefactobase.service.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChairDto {
    private Long id;
    private String name;
    private List<StudentDto> students;
}