package com.example.funcionario.model;

import com.example.funcionario.model.enuns.Setor;
import com.example.funcionario.model.enuns.Sexo;
import jakarta.persistence.*;

@Entity
@Table(name = "tab_funcionarios")
public class FuncionarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private int idade;
    private double salario;

    @Enumerated (EnumType.STRING)
    private Setor setor;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    public FuncionarioModel(){
    }

    public FuncionarioModel(Long id, String nome, int idade, double salario, Setor setor, Sexo sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.setor = setor;
        this.sexo = sexo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

}
