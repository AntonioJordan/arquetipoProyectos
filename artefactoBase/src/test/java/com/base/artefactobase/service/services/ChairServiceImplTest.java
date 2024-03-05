package com.base.artefactobase.service.services;

import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.repositories.ChairRepository;
import com.base.artefactobase.service.services.impl.ChairServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.mockito.Mock;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ChairServiceImplTest {

    @Mock
    ChairRepository chairRepository;
    @InjectMocks
    ChairServiceImpl chairService;

    @Test
    void testGetAllChairs(){

        // GIVEN
        List<Chair> mockChairs = new ArrayList<>();
        mockChairs.add(new Chair(1L, "aaa", null));
        mockChairs.add(new Chair(2L, "bbb", null));

        when(chairRepository.findAll()).thenReturn(mockChairs);

        //WHEN
        Optional<List<Chair>> result = chairService.getAllChairs();

        //THEN
        assertEquals(2, result.get().size());
        assertEquals( "aaa", result.get().get(0).getName());
        assertEquals( "bbb", result.get().get(1).getName());

    }


}
