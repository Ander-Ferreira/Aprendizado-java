package Desafio2;

import java.util.LinkedList;
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

//        System.out.println("Poupança");
//        ContaPoupanca novaPoupanca = new ContaPoupanca();
//        novaPoupanca.depositarValor(100);
//        novaPoupanca.consultarSaldo();
//        System.out.println("Corrente");
//        ContaCorrente novaCorrente = new ContaCorrente();
//        novaCorrente.depositarValor(300);
//        novaCorrente.consultarSaldo();


        //Variáveis do meu menu
        int opcoes = 0;
        Scanner caixaDeInput = new Scanner(System.in);
        int caixaDeValor;
        int caixaDeIdPoupanca;
        int caixaDeIdCorrente;
        String caixaDeNome;

        //Flags para verificação
        boolean poupancaEncontrada = false;
        boolean correnteEncontrada = false;


        //Minha lista de poupanças
        LinkedList<ContaPoupanca> listaPoupanca = new LinkedList<>();

        //Minha lista de correntes
        LinkedList<ContaCorrente> listaCorrente = new LinkedList<>();

        while(opcoes != 5){
            System.out.println("Digite 1 para criar conta");
            System.out.println("Digite 2 para depositar");
            System.out.println("Digite 3 para transferir entre contas");
            System.out.println("Digite 4 para consultar saldo");
            System.out.println("Digite 5 para sair");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){

                //Criação de contas
                case 1:
                    System.out.println("Digite 1 para poupança ou 2 para corrente");
                    opcoes = caixaDeInput.nextInt();
                    if(opcoes == 1){
                        System.out.println("Digite seu nome");
                        caixaDeNome = caixaDeInput.nextLine();
                        caixaDeNome = caixaDeInput.nextLine();
                        listaPoupanca.add(0, new ContaPoupanca(caixaDeNome, TipoConta.POUPANCA));
                        System.out.println("Conta poupança criada com sucesso!");
                        System.out.println( "Nome: " + listaPoupanca.getFirst().nome + " Nº Conta: " + listaPoupanca.getFirst().getId() );

                    } else if (opcoes == 2) {
                        System.out.println("Digite seu nome");
                        caixaDeNome = caixaDeInput.nextLine();
                        caixaDeNome = caixaDeInput.nextLine();
                        listaCorrente.add(0, new ContaCorrente(caixaDeNome, TipoConta.CORRENTE));
                        System.out.println("Conta corrente criada com sucesso!");
                        System.out.println( "Nome: " + listaCorrente.getFirst().nome + " Nº Conta: " + listaCorrente.getFirst().getId() );

                    } else {
                        System.out.println("Opção inválida!");
                    }

                    break;

                //Depósito
                case 2:

                    //Resetando as minhas flags para false para realizar uma nova busca se o usuário desejar
                    poupancaEncontrada = false;
                    correnteEncontrada = false;

                    System.out.println("Digite 1 para depositar em poupança ou 2 para depositar em corrente");
                    opcoes = caixaDeInput.nextInt();

                    if(opcoes == 1){
                        System.out.println("Digite o número da sua conta");
                        caixaDeIdPoupanca = caixaDeInput.nextInt();


                            System.out.println("Digite o valor");
                            caixaDeValor = caixaDeInput.nextInt();

                           //Meu loop de busca e verificação
                            for(ContaPoupanca poupanca: listaPoupanca){
                                if(poupanca.getId() == caixaDeIdPoupanca){
                                    poupanca.depositarValor(caixaDeValor);
                                    poupancaEncontrada = true;
                                    break;

                                }

                            }

                            if(!poupancaEncontrada){
                                System.out.println("Conta poupança não encontrada!");
                            }

                    } else if (opcoes == 2) {
                        System.out.println("Digite o número da conta");
                        caixaDeIdCorrente = caixaDeInput.nextInt();


                            System.out.println("Digite o valor ");
                            caixaDeValor = caixaDeInput.nextInt();

                            for(ContaCorrente corrente: listaCorrente){
                                if(corrente.getId() == caixaDeIdCorrente){
                                    corrente.depositarValor(caixaDeValor);
                                    correnteEncontrada = true;
                                    break;
                                }

                            }

                            if(!correnteEncontrada){
                                System.out.println("Conta corrente não encontrada!!");
                            }


                    } else{
                        System.out.println("Opção inválida!");
                    }

                    break;

                case 3:
                    poupancaEncontrada = false;
                    correnteEncontrada = false;

                    System.out.println("Digite 1 para transferir de poupança para corrente");
                    System.out.println("Digite 2 para transferir de corrente para poupança");
                    opcoes = caixaDeInput.nextInt();
                    if(opcoes == 1){

                        System.out.println("Digite o número da poupança");
                        caixaDeIdPoupanca = caixaDeInput.nextInt();


                            System.out.println("Digite o valor que deseja transferir");
                            caixaDeValor = caixaDeInput.nextInt();

                            for(ContaPoupanca poupanca : listaPoupanca){
                                if(poupanca.getId() == caixaDeIdPoupanca){
                                    poupanca.sacar(caixaDeValor);
                                    poupancaEncontrada = true;
                                    break;
                                }

                            }

                        if(!poupancaEncontrada){
                            System.out.println("Conta poupança não encontrada!");

                        }


                        System.out.println("Digite o número da conta corrente");
                            caixaDeIdCorrente = caixaDeInput.nextInt();


                                for(ContaCorrente corrente : listaCorrente){
                                    if(corrente.getId() == caixaDeIdCorrente){
                                        corrente.depositarValor(caixaDeValor);
                                        correnteEncontrada = true;
                                        break;
                                    }

                                }

                                if(!correnteEncontrada){
                                    System.out.println("Conta corrente não encontrada!");

                                }


                    } else if (opcoes == 2) {
                        System.out.println("Digite o numero da corrente");
                        caixaDeIdCorrente = caixaDeInput.nextInt();

                        System.out.println("Digite o valor que deseja transferir");
                        caixaDeValor = caixaDeInput.nextInt();

                        for(ContaCorrente corrente : listaCorrente){
                            if(corrente.getId() == caixaDeIdCorrente){
                                corrente.sacar(caixaDeValor);
                                correnteEncontrada = true;
                                break;
                            }

                        }

                        if(!correnteEncontrada){
                            System.out.println("Conta corrente não encontrada!");
                        }

                        System.out.println("Digite o número da poupança");
                        caixaDeIdPoupanca = caixaDeInput.nextInt();

                        for(ContaPoupanca poupanca : listaPoupanca){
                            if(poupanca.getId() == caixaDeIdPoupanca){
                                poupanca.depositarValor(caixaDeValor);
                                poupancaEncontrada = true;
                                break;
                            }
                        }

                        if(!poupancaEncontrada){
                            System.out.println("Conta poupança não encontrada!");
                        }

                    }

                    break;

                case 4:
                    System.out.println("Digite 1 para poupança ou 2 para corrente");
                    opcoes = caixaDeInput.nextInt();
                    if(opcoes == 1){
                        System.out.println("Digite o número da poupança");
                        caixaDeIdPoupanca = caixaDeInput.nextInt();

                        for(ContaPoupanca poupanca : listaPoupanca){
                            if(poupanca.getId() == caixaDeIdPoupanca){
                                poupanca.consultarSaldo();
                                poupancaEncontrada = true;
                                break;

                            }

                        }

                        if(!poupancaEncontrada){
                            System.out.println("Conta poupança não encontrada!");
                        }

                    } else if (opcoes == 2) {
                        System.out.println("Digite o numero da corrente");
                        caixaDeIdCorrente = caixaDeInput.nextInt();

                        for(ContaCorrente corrente : listaCorrente){
                            if(corrente.getId() == caixaDeIdCorrente){
                                corrente.consultarSaldo();
                                correnteEncontrada = true;
                                break;
                            }

                        }

                        if(!correnteEncontrada){
                            System.out.println("Conta corrente não encontrada!");
                        }

                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;


            }


        }





    caixaDeInput.close();

    }
}
