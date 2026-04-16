package com.example.funcionario.model.enuns;

public enum Sexo {
    Masculino('M', "Masculino"),
    Feminino('F', "Feminino");

    private char caractere;
    private String texto;

    Sexo(char caractere, String texto) {
        this.caractere = caractere;
        this.texto = texto;
    }

    public char getCaractere() { return caractere; }
    public String getTexto() { return texto; }
}
