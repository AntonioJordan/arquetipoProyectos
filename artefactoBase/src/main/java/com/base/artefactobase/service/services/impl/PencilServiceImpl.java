package com.base.artefactobase.service.services.impl;

import com.base.artefactobase.service.entities.Pencil;
import com.base.artefactobase.service.repositories.PencilRepository;
import com.base.artefactobase.service.services.PencilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PencilServiceImpl implements PencilService {

    private final PencilRepository pencilRepository;

    @Autowired
    public PencilServiceImpl(PencilRepository pencilRepository) {
        this.pencilRepository = pencilRepository;
    }

    @Override
    public List<Pencil> getAllPencils() {
        return (List<Pencil>) pencilRepository.findAll();
    }

    @Override
    public Pencil getPencil(Long id) {
        return pencilRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
