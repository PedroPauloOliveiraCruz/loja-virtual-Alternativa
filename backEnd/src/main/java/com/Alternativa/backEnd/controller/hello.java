package com.Alternativa.backEnd.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class hello {

    @GetMapping("/")
    public String heloo(){
        return "ola mundo" +new Date();
    }
}
