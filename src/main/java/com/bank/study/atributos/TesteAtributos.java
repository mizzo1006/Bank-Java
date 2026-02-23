package com.bank.study.atributos;

public class TesteAtributos {

    public static void main(String[] args) {
        PessoaAtributo pessoa = new PessoaAtributo();
        pessoa.setNomePrivado("Milca");
        PessoaAtributo pessoa1 = new PessoaAtributo();
        pessoa1.setNomePrivado("Antonio");
        System.out.println(PessoaAtributo.contador);
        // PessoaAtributo.NOME_FINAL = "teste"; // não é possível alterar o conteudo do nome final

    }
}
