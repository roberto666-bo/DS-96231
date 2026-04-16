package com.example.funcionario.controller;

import com.example.funcionario.model.FuncionarioModel;
import com.example.funcionario.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService service;

    @PostMapping
    public FuncionarioModel criar(@RequestBody FuncionarioModel funcionario){
        return service.salvar(funcionario);
    }

    @GetMapping
    public List<FuncionarioModel> listar(){
        return service.listarTodos();
    }
}
