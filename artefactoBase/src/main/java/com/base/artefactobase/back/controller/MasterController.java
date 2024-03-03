package com.base.artefactobase.back.controller;

import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.proxies.ChairProxy;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<Chair> getChairs() {
        return chairProxy.getAllChairs();
    }

}
