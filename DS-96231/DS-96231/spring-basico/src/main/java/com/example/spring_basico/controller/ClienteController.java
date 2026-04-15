package com.example.spring_basico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_basico.ClienteRepositoy.ClienteRepository;
import com.example.spring_basico.models.CLienteModel;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
 


    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<CLienteModel> litar() {
        return clienteRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<CLienteModel>salvar(@RequestBody CLienteModel cliente){
        clienteRepository.save(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
    }

}
