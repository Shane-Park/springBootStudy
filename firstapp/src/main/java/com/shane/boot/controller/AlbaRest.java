package com.shane.boot.controller;

import java.util.List;

import com.shane.boot.Alba;
import com.shane.boot.service.AlbaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi/alba")
public class AlbaRest {

    @Autowired
    AlbaService albaService;

    @GetMapping
    public List<Alba> getAlbaList(){
        return albaService.findAll();
    }

    @GetMapping("/{al_id}")
    public Alba getAlba(@PathVariable("al_id") String al_id){
        return albaService.findOne(al_id);
    }
    
}
