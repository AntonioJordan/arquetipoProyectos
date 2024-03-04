package com.base.artefactobase.service.services.impl;

import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.repositories.ChairRepository;
import com.base.artefactobase.service.services.ChairService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Slf4j
@Component
public class ChairServiceImpl implements ChairService {

    private final ChairRepository chairRepository;

    public ChairServiceImpl(ChairRepository chairRepository) {
        this.chairRepository = chairRepository;
    }

    @Override
    public Optional<List<Chair>> getAllChairs() {
        return Optional.ofNullable(chairRepository.findAll());
    }

    @Override
    public Optional<String> deleteChair(Long id) {
        try {
            chairRepository.deleteById(id);
        } catch (Exception e) {
            log.info("The Chair could not be removed.");
            return Optional.empty();
        }
        return Optional.of("The chair has been removed");
    }
}
