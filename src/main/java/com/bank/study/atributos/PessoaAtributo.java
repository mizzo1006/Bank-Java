package com.bank.study.atributos;

public class PessoaAtributo {
    private String nomePrivado;
    public String nomePublico;
    protected String nomeProtegido;
    public static int contador = 0;
    public static final String NOME_FINAL = "Milca";

    public PessoaAtributo(){
        contador++;
    }

    public String getNomePrivado(){
        return this.nomePrivado;
    }

    public void setNomePrivado(String nomePrivado){
        this.nomePrivado = nomePrivado;
    }
}
