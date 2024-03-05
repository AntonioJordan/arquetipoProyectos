package com.base.artefactobase.back.controllers;

import com.base.artefactobase.back.controller.MasterController;
import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.proxies.ChairProxy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;


class MasterControllerTest {

    @Mock
    private ChairProxy chairProxy;

    private MasterController masterController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        masterController = new MasterController(chairProxy);
    }

    @Test
    void testGetChairs() {
        // GIVEN
        List<ChairDto> expectedChairs = Collections.singletonList(new ChairDto(1L, "Chair 1", null));
        when(chairProxy.getAllChairs()).thenReturn(expectedChairs);

        // WHEN
        List<ChairDto> actualChairs = masterController.getChairs();

        // THEN
        assertEquals(expectedChairs, actualChairs);
    }

    @Test
    void testDeleteChairSuccess() {
        // GIVEN
        Long chairId = 1L;
        Optional<String> expectedResult = Optional.of("The chair has been removed");
        when(chairProxy.deleteChair(anyLong())).thenReturn(expectedResult);

        // WHEN
        String actualResult = masterController.deleteChair(chairId);

        // THEN
        assertEquals(expectedResult.get(), actualResult);
    }

    @Test
    void testDeleteChairFailure() {
        // GIVEN
        Long chairId = 1L;
        Optional<String> expectedResult = Optional.empty();
        when(chairProxy.deleteChair(anyLong())).thenReturn(expectedResult);

        // WHEN
        String actualResult = masterController.deleteChair(chairId);

        // THEN
        assertEquals("IT HAS BEEN AN ERROR", actualResult);
        verify(chairProxy, times(1)).deleteChair(chairId);
    }
}