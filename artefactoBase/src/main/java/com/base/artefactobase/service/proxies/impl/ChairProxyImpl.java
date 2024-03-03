package com.base.artefactobase.service.proxies.impl;

import com.base.artefactobase.service.entities.Chair;
import com.base.artefactobase.service.proxies.ChairProxy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChairProxyImpl implements ChairProxy {

    //TODO
    @Override
    public List<Chair> getAllChairs() {
        Chair chair = Chair.builder().id(1L).name("aaa").build();
        return List.of(chair);
    }
}
