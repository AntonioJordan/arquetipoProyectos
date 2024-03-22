package com.inditex.test.inditex.infrastructure.controllers.exception;

import com.inditex.test.inditex.infrastructure.controllers.dto.responsedtos.PriceResponseDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<PriceResponseDto> handlePriceNotFoundException(IllegalArgumentException exception) {
        return ResponseEntity.notFound().build();
    }
}