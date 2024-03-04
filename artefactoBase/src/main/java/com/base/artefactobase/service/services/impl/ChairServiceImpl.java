package com.base.artefactobase.service.services.impl;

import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.repositories.ChairRepository;
import com.base.artefactobase.service.services.ChairService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChairServiceImpl implements ChairService {

    private final ChairRepository chairRepository;

    public ChairServiceImpl(ChairRepository chairRepository) {
        this.chairRepository = chairRepository;
    }

    @Override
    public List<Chair> getAllChairs() {
        return chairRepository.findAll();
    }
}
