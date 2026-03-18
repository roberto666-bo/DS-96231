package com.example.Atividade1;

public class Direitor extends Cargodeconfiancar implements Contratacao{
private final double premerio=1.1;

public Direitor(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String datadenacimento,
        String dataadimisao, Bonificacao bonificacao) {
    super(nome, cpf, rg, sexo, salarioBase, datadenacimento, dataadimisao, bonificacao);
}

@Override
public void admitir(Fucionario fucionario) {
    // TODO Auto-generated method stub
    
}

@Override
public void denmentir(Fucionario fucionario) {
    // TODO Auto-generated method stub
    
}

@Override
public double Salariofinal() {
    double Salariodiretor=Bonificacao.DIRETOR.getValor()*salarioBase;
    double Salariofinal=Salariodiretor+(Salariodiretor*this.premerio);
    return Salariofinal;
}

public double getPremerio() {
    return premerio;
}
    

}
