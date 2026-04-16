package com.example.funcionario.model.enuns;

public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANO("Recursos Humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

    private String nome;

    Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
