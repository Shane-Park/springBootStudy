package com.shane.boot.service;

import java.util.List;

import com.shane.boot.Alba;
import com.shane.boot.repositories.AlbaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbaService {

    @Autowired
    AlbaRepository albaRepository;

    public List<Alba> findAll(){
        List<Alba> list = albaRepository.findAll();
        System.out.println(list);
        return list;
    }

    public Alba findOne(String al_id){
        Alba alba = albaRepository.getById(al_id);
        System.out.println(alba);
        return alba;
    }
    
}
