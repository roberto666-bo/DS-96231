package com.example.Atividade1;

public abstract class Fucionario implements Salariofinal{
    protected String nome;
    protected String cpf;
    protected String rg;
    protected Sexo sexo;
    protected double salarioBase;
    protected String datadenacimento;
    protected String dataadimisao;
    public Fucionario(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String datadenacimento,
            String dataadimisao) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.sexo = sexo;
        this.salarioBase = salarioBase;
        this.datadenacimento = datadenacimento;
        this.dataadimisao = dataadimisao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public Sexo getSexo() {
        return sexo;
    }
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public String getDatadenacimento() {
        return datadenacimento;
    }
    public void setDatadenacimento(String datadenacimento) {
        this.datadenacimento = datadenacimento;
    }
    public String getDataadimisao() {
        return dataadimisao;
    }
    public void setDataadimisao(String dataadimisao) {
        this.dataadimisao = dataadimisao;
    }
    
    

}
