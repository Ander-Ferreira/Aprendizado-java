package Desafio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Você vai criar um programa para gerenciar diferentes
//        tipos de contas bancárias no Banco de Konoha. O
//        objetivo é usar classes abstratas e interfaces para
//        definir comportamentos comuns e específicos para
//        diferentes tipos de contas.
//        1. Crie uma interface chamada Conta com os
//                métodos consultarSaldo() e depositar(double
//        valor).
//        2. Crie uma classe abstrata chamada
//        ContaBancaria que implementa a interface
//        Conta.
//        3. Crie uma classe chamada ContaCorrente que
//        estende a classe ContaBancaria.
//        4. Implemente o método depositar(double valor)
//        para adicionar o valor ao saldo.
//        5. Crie uma classe chamada ContaPoupanca que
//        também estende a classe ContaBancaria.
//        6. Implemente o método depositar(double valor)
//        para adicionar o valor ao saldo com uma pequena
//        taxa de depósito (por exemplo, deduzir 1% do
//            valor depositado).

//        Como desafio adicional, adicione um enum chamado TipoConta para representar diferentes
//                tipos de contas, como CORRENTE e POUPANCA. Modifique as classes ContaCorrente e
//        ContaPoupanca para usar esse enum e adicione um método sobrecarregado na classe
//                BancoKonoha para realizar transferências entre contas.

        System.out.println("Poupança");
        ContaPoupanca novaPoupanca = new ContaPoupanca();
        novaPoupanca.depositarValor(100);
        novaPoupanca.consultarSaldo();
        System.out.println("Corrente");
        ContaCorrente novaCorrente = new ContaCorrente();
        novaCorrente.depositarValor(300);
        novaCorrente.consultarSaldo();


        int opcoes = 0;
        Scanner caixaDeInput = new Scanner(System.in);
        int caixaDeValor;

        while(opcoes != 6){
            System.out.println("Digite 1 para depositar em poupança");
            System.out.println("Digite 2 para depositar em corrente");
            System.out.println("Digite 3 para transferir de poupança para corrente");
            System.out.println("Digite 4 para transferir de corrente para poupança");
            System.out.println("Digite 5 para consultar saldo");
            System.out.println("Digite 6 para sair");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Digite o valor para depósito");
                    caixaDeValor = caixaDeInput.nextInt();
                    novaPoupanca.depositarValor(caixaDeValor);
                    break;
                case 2:
                    System.out.println("Digite o valor para depósito");
                    caixaDeValor = caixaDeInput.nextInt();
                    novaCorrente.depositarValor(caixaDeValor);
                    break;
                case 3:
                    System.out.println("Digite o valor para transferir");
                    caixaDeValor = caixaDeInput.nextInt();
                    novaPoupanca.sacar(caixaDeValor);
                    novaCorrente.depositarValor(caixaDeValor);
                    break;
                case 4:
                    System.out.println("Digite o valor para transferir");
                    caixaDeValor = caixaDeInput.nextInt();
                    novaCorrente.sacar(caixaDeValor);
                    novaPoupanca.depositarValor(caixaDeValor);
                    break;
                case 5:
                    System.out.println("Digite 1 para poupança ou 2 para corrente");
                    caixaDeValor = caixaDeInput.nextInt();
                    if(caixaDeValor == 1){
                        novaPoupanca.consultarSaldo();

                    } else if (caixaDeValor == 2) {
                        novaCorrente.consultarSaldo();

                    } else{
                        System.out.println("Opção inválida!");
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;


            }


        }







    }
}
