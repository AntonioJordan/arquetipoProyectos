package com.base.artefactobase.back.controller;

import com.base.artefactobase.service.dtos.ChairDto;
import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.proxies.ChairProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/master")
public class MasterController {

    private final ChairProxy chairProxy;
    public MasterController(ChairProxy chairProxy) {
        this.chairProxy = chairProxy;
    }

    @GetMapping("/chair")
    public List<ChairDto> getChairs() {
        return chairProxy.getAllChairs();
    }

    @GetMapping("/chair/delete/{id}")
    public String deleteChair(@PathVariable Long id) {
        return chairProxy.deleteChair(id);
    }

}
