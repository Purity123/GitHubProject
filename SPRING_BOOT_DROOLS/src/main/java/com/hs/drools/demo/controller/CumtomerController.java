package com.hs.drools.demo.controller;

import com.hs.drools.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CumtomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/changeLevByPayAmount")
    public void changeLevByPayAmount(){
        customerService.changeLevByPayAmount();
    }


}
