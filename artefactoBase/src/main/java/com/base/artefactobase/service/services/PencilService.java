package com.base.artefactobase.service.services;

import com.base.artefactobase.service.entities.Pencil;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PencilService {

    List<Pencil> getAllPencils();
    Pencil getPencil(Long id);

}
