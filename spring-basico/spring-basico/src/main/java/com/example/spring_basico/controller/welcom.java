package com.example.spring_basico.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class welcom {

    @GetMapping("/")
    public String mensagem() {
        return "bem-vindo!";
    }

    @GetMapping("/dev")
    public String nomedev(){
        return "feito por:rc97";
    }
}
