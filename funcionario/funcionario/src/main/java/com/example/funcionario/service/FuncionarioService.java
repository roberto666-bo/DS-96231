package com.example.funcionario.service;

import com.example.funcionario.model.FuncionarioModel;
import com.example.funcionario.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public FuncionarioModel salvar(FuncionarioModel funcionario) {
        return repository.save(funcionario);
    }

    public List<FuncionarioModel> listarTodos(){
        return repository.findAll();
    }
}
