package com.example.projeto;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping
    public String bemvindo () {
        return "bem-vindo";
    }
}
