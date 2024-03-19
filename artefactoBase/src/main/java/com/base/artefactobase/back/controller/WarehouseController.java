package com.base.artefactobase.back.controller;

import com.base.artefactobase.service.dtos.responses.PencilRespDto;
import com.base.artefactobase.service.proxies.PencilProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WarehouseController {

    private final PencilProxy pencilProxy;

    @Autowired
    public WarehouseController(PencilProxy pencilDto) {
        this.pencilProxy = pencilDto;
    }

    @GetMapping("/all")
    public List<PencilRespDto> getPencilDtoList(){
        return pencilProxy.getAllPencils();
    }

    @GetMapping("/{id}")
    public PencilRespDto getPencil(@PathVariable Long id){
        return pencilProxy.getPencil(id);
    }
}
