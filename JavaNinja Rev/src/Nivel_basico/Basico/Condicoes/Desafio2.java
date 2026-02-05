package Condicoes;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
//        Você foi encarregado pelo Hokage para gerenciar o
//        cadastro de ninjas na Vila da Folha. Sua missão é criar
//        um sistema simples em Java para cadastrar novos
//        ninjas e listar todos os ninjas cadastrados.
//                Tópicos a serem utilizados:
//        Arrays: Para armazenar os nomes dos ninjas.
//        Switch Cases: Para implementar um menu
//        interativo.
//                Loops: Para navegar pelas opções do menu e
//        iterar sobre os ninjas cadastrados.
//                Condicionais: Para controlar a execução das
//        opções do menu e validar o número de ninjas
//        cadastrados.

       //Início do desafio

        //Caixa da escolha dos números
        Scanner caixaDeNumero = new Scanner(System.in);
        //Meu guardar número
        int guardarNumero = 0;
        //Meu numero máximo de ninjas para controlar o número de nomes do array
        int numeroMaximoDeNinjas = 0;

        //Caixa de digitação dos nomes
        Scanner caixaDeNome = new Scanner(System.in);
       //Meu array para guardar os nomes digitados
        String [] guardarNome = new String[3];

        // Loop para repetir minhas opções enquanto não for 3

       while(guardarNumero != 3){

           System.out.println("\n===== Menu Ninja =====");
           System.out.println("1. Cadastrar Ninja");
           System.out.println("2. Listar Ninjas");
           System.out.println("3. Sair");
           System.out.print("Escolha uma opção: ");

          guardarNumero = caixaDeNumero.nextInt();

       //Condições das opções disponíveis


        switch (guardarNumero){
            case 1:


                for (int i = 0; i < 3; i++) {
                    guardarNome[i] = caixaDeNome.nextLine();
                    System.out.println("Ninja Gravado!");






                }











                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    System.out.println(guardarNome[i]);

                }
                break;

            case 3:
                System.out.println("Você saiu!");
                break;

            default:
                System.out.println("Opção inválida!");

        }


      }
        caixaDeNumero.close();
        caixaDeNome.close();

    }
}
