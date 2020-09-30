package com.fk.training.zuulgateway.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ABCController
{

  @GetMapping("/fk")
    public String fk(){
    return "Furqan Khan";
    }
}
