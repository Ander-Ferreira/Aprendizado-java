package Desafios.Desafios_Aleatorios.Desafio7;

import java.util.ArrayList;
import java.util.List;
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


        //Minha lista de contas bancárias
        List<ContaBancaria> listaDeContas = new ArrayList<>();

        //Minhas variáveis de inputs
        Scanner caixaDeInput = new Scanner(System.in);
        String caixaDeNome;
        int opcoes = 0;
        int caixaDeId = 0;
        int caixaDeId2 = 0;
        double caixaDeValor;



        //Meu menu
        while(opcoes != 6){

            System.out.println("Digite 1 para cadastrar uma nova conta");
            System.out.println("Digite 2 para depositar");
            System.out.println("Digite 3 para sacar");
            System.out.println("Digite 4 para transferir");
            System.out.println("Digite 5 para consultar saldo");
            System.out.println("Digite 6 para sair");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){

                case 1:

                    //Registro de conta
                    System.out.println("Digite 1 para poupança ou 2 para corrente");
                    opcoes = caixaDeInput.nextInt();

                    if(opcoes < 1 || opcoes > 2){
                        System.out.println("Opção inválida!");
                    }
                    System.out.println("Digite seu nome");
                    caixaDeInput.next();
                    caixaDeNome = caixaDeInput.nextLine();

                    if(opcoes == 1){
                        listaDeContas.add(new ContaPoupanca(caixaDeNome));
                        System.out.println("Conta poupança criada com sucesso");


                    } else if (opcoes == 2) {
                        listaDeContas.add(new ContaCorrente(caixaDeNome));
                        System.out.println("Conta corrente criada com sucesso");
                    }

                    break;

                case 2: { //Os cases a partir daqui terão escopo adicionado porque estou trabalhando com variável final
                    //Depósito
                    System.out.println("Digite o número de sua conta");
                    caixaDeId = caixaDeInput.nextInt();
                    final int id = caixaDeId;


                //Encontrando a conta
                ContaBancaria contaAchada =   listaDeContas.stream()
                           .filter(conta -> conta.getId() == id)
                           .findFirst()
                           .orElse(null);

                if(contaAchada == null){
                    System.out.println("Conta não encontrada!");
                    break;
                }

                System.out.println("Digite o valor a ser depositado");
                caixaDeValor = caixaDeInput.nextInt();
                contaAchada.depositar(caixaDeValor);

                break; }

                case 3: {
                    System.out.println("Digite o número de sua conta");
                    caixaDeId = caixaDeInput.nextInt();
                    final int id = caixaDeId;

                    ContaBancaria suaConta = listaDeContas.stream()
                            .filter(conta -> conta.getId() == id)
                            .findFirst().orElse(null);

                    if(suaConta == null){
                        System.out.println("Conta não encontrada!");
                        break;
                    }

                    System.out.println("Digite o valor que deseja sacar");
                    caixaDeValor = caixaDeInput.nextInt();
                    suaConta.sacar(caixaDeValor);

                    break; }

                case 4: {
                    System.out.println("Digite o número de sua conta");
                    caixaDeId = caixaDeInput.nextInt();
                    final int id = caixaDeId;

                    ContaBancaria suaConta = listaDeContas.stream()
                            .filter(conta -> conta.getId() == id)
                            .findFirst()
                            .orElse(null);

                    if(suaConta == null){
                        System.out.println("Conta não encontrada!");
                        break;
                    }

                    System.out.println("Digite o valor que deseja transferir");
                    caixaDeValor = caixaDeInput.nextInt();
                    suaConta.sacar(caixaDeValor);

                    System.out.println("Digite o número da conta que deseja transferir");
                    caixaDeId2 = caixaDeInput.nextInt();
                    final int id2 = caixaDeId2;

                    ContaBancaria outraConta = listaDeContas.stream()
                            .filter(conta -> conta.getId() == id2)
                            .findFirst()
                            .orElse(null);

                    if(outraConta == null){
                        System.out.println("Conta para transferência não encontrada!");
                        break;
                    }

                    outraConta.depositar(caixaDeValor);

                    break; }


                case 5: {
                    System.out.println("Digite o número de sua conta");
                    caixaDeId = caixaDeInput.nextInt();
                    final int id = caixaDeId;

                    ContaBancaria suaConta = listaDeContas.stream()
                            .filter(conta -> conta.getId() == id)
                            .findFirst()
                            .orElse(null);

                    if(suaConta == null){
                        System.out.println("Conta não encontrada");
                        break;
                    }

                    suaConta.consultarSaldo();

                break; }

                default:
                    String ternario = (opcoes == 6) ? "Saindo do programa..." : "Opção inválida!";
                    System.out.println(ternario);


            }

        }








    }
}
