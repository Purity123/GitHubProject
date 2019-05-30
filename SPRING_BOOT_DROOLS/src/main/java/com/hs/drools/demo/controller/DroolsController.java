package com.hs.drools.demo.controller;

import com.hs.drools.demo.service.DroolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/drools")
public class DroolsController {

    @Autowired
    private DroolsService droolsService;

    @GetMapping("/showRults")
    public String showRults(){
        return droolsService.fireRule();
    }

}
