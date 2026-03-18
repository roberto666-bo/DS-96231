package com.example.Atividade1;

public class Gerente extends Cargodeconfiancar{

    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String datadenacimento,
            String dataadimisao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, datadenacimento, dataadimisao, bonificacao);
    }

    @Override
    public double Salariofinal() {
        
        return Bonificacao.GERENTE.getValor()*salarioBase;
    }
    

}
