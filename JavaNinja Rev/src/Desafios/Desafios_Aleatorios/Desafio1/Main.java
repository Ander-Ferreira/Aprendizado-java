package Desafios.Desafios_Aleatorios.Desafio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       //Faça uma calculadora com java


        //Classes de Operações
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        //Menu
        Scanner caixaDeInput = new Scanner(System.in);
        int opcoes = 0;
        int caixaDeNumero1;
        int caixaDeNumero2;

        while(opcoes != 5){
            System.out.println("Digite 1 para somar");
            System.out.println("Digite 2 para subtrair");
            System.out.println("Digite 3 para multiplicar");
            System.out.println("Digite 4 para dividir");
            System.out.println("Digite 5 para sair");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Digite o primeiro número");
                    caixaDeNumero1 = caixaDeInput.nextInt();
                    System.out.println("+");
                    System.out.println("Digite o segundo número");
                    caixaDeNumero2 = caixaDeInput.nextInt();
                    soma.soma(caixaDeNumero1, caixaDeNumero2);

                    break;

                case 2:
                    System.out.println("Digite o primeiro número");
                    caixaDeNumero1 = caixaDeInput.nextInt();
                    System.out.println("-");
                    System.out.println("Digite o segundo número");
                    caixaDeNumero2 = caixaDeInput.nextInt();
                    subtracao.subtracao(caixaDeNumero1, caixaDeNumero2);

                    break;

                case 3:
                    System.out.println("Digite o primeiro número");
                    caixaDeNumero1 = caixaDeInput.nextInt();
                    System.out.println("*");
                    System.out.println("Digite o segundo número");
                    caixaDeNumero2 = caixaDeInput.nextInt();
                    multiplicacao.multiplicacao(caixaDeNumero1, caixaDeNumero2);

                    break;

                case 4:
                    System.out.println("Digite o primeiro número");
                    caixaDeNumero1 = caixaDeInput.nextInt();
                    System.out.println("/");
                    System.out.println("Digite o segundo número");
                    caixaDeNumero2 = caixaDeInput.nextInt();
                    divisao.divisao(caixaDeNumero1, caixaDeNumero2);

                    break;

                default:
                    String ternario = (opcoes == 5)? "Desligando a calculadora..." : "Operação inválida";
                    System.out.println(ternario);
                    break;

            }
        }

    caixaDeInput.close();





    }
}
