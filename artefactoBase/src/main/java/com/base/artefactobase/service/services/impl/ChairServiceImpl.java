package com.base.artefactobase.service.services.impl;

import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.repositories.ChairRepository;
import com.base.artefactobase.service.services.ChairService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
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

    @Override
    public String deleteChair(Long id) {
        try {
            chairRepository.deleteById(id);
        } catch (Exception e) {
            log.info("The Chair could not be removed.");
            return "";
        }
        return "The chair has been removed";
    }
}
