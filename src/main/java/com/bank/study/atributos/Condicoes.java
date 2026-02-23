package com.bank.study.atributos;

import java.util.Scanner;

public class Condicoes {

    public static void main(String[] args) {

        Scanner recebeDados = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        String nome = recebeDados.next();

        System.out.println("Informe a sua idade");
        int idade = recebeDados.nextInt();

        switch (idade){
            case 21:
                System.out.println(nome + " Vc pode ser resposável por outras pessoas");
                break;
            case 18:
                System.out.println(nome + " Vc é maior de idade");
                break;
            default:
                System.out.println(nome + " Vc é menor de idade");

        }
//        if (idade >= 21){
//            System.out.println(nome + " Vc pode ser resposável por outras pessoas");
//        }else if (idade > 18 && idade < 21){
//            System.out.println(nome + " Vc é maior de idade");
//        } else {
//            System.out.println("Vc é menor de idade");
//        }

//        System.out.printf(idade >= 18? nome + " Vc é maior de idade" : nome + " Vc é menor de idade"); //ternário usado para verdadeiro e falso

    }
}
