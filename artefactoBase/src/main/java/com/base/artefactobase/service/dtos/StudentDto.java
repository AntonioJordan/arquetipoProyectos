package com.base.artefactobase.service.dtos;

import com.base.artefactobase.service.entities.Chair;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class StudentDto {
    private Long id;
    private String name;
    private List<Chair> chairs;
}
