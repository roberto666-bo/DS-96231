package com.example.Atividade1;

public abstract class Cargodeconfiancar extends Fucionario {
    protected Bonificacao bonificacao;

    public Cargodeconfiancar(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String datadenacimento,
            String dataadimisao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, datadenacimento, dataadimisao);
        this.bonificacao = bonificacao;
    }
    



}
