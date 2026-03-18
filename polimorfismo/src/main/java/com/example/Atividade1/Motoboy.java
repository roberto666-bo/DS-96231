package com.example.Atividade1;
public class Motoboy extends Fucionario {

    private  String placadamoto;

    public Motoboy(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String datadenacimento,
            String dataadimisao, String placadamoto) {
        super(nome, cpf, rg, sexo, salarioBase, datadenacimento, dataadimisao);
        this.placadamoto = placadamoto;
    }

    public String getPlacadamoto() {
        return placadamoto;
    }

    public void setPlacadamoto(String placadamoto) {
        this.placadamoto = placadamoto;
    }

    @Override
    public double Salariofinal() {
        
        return super.salarioBase;
    }

    @Override
    public String toString() {
        return "Motoboy [placadamoto=" + placadamoto + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo="
                + sexo + ", salarioBase=" + salarioBase + ", datadenacimento=" + datadenacimento + ", dataadimisao="
                + dataadimisao + "]";
    }
    


    
}