package Desafio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //        Crie um programa em Java para gerenciar
//        informações de ninjas utilizando herança. Desenvolva
//        uma classe base chamada Ninja e uma subclasse
//        chamada Uchiha.
//        1. Na classe Ninja, defina os atributos nome
//                (String), idade (int), missao (String),
//                nivelDificuldade (String) e statusMissao (String).
//                Adicione um método chamado
//        mostrarInformacoes() que exibe todos esses
//        atributos.
//        2. Crie uma subclasse chamada Uchiha que herda
//        de Ninja. Adicione um atributo adicional
//        habilidadeEspecial (String) e um método
//        chamado mostrarHabilidadeEspecial() para exibir
//        a habilidade especial do ninja.
//        3. Sobrescreva o método mostrarInformacoes() na
//        classe Uchiha para incluir também a habilidade
//                especial

//   Como desafio adicional, implemente um menu interativo utilizando a classe Scanner para
//   permitir ao usuário escolher entre diferentes opções, como exibir informações de todos os
//   ninjas, adicionar novos ninjas ou atualizar as habilidades especiais. Isso ajudará a praticar o
//   uso de entrada do usuário e controle de fluxo no programa.


        //Lista linkada com meus ninjas
        List<Uchiha> meusNinjas = new ArrayList<>();

        //Criando meus inputs
        Scanner caixaDeInput = new Scanner(System.in);

        //Menu interativo
        int opcao = 0;
        int selecao;

        while (opcao != 4) {
            System.out.println("Digite 1 para Registrar um novo Ninja: ");
            System.out.println("Digite 2 para Listar Ninjas: ");
            System.out.println("Digite 3 para Modificar Habilidade Especial: ");
            System.out.println("Digite 4 para Sair: ");
            opcao = caixaDeInput.nextInt();

            switch (opcao) {
                //Registro
                case 1:

                    System.out.println("Digite o nome do ninja: ");
                    String inputNome = caixaDeInput.nextLine();
                    inputNome = caixaDeInput.nextLine();
                    System.out.println("Digite a missão do ninja: ");
                    String inputMissao = caixaDeInput.nextLine();
                    System.out.println("Digite dificuldade da Missão: ");
                    String inputDificuldade = caixaDeInput.nextLine();
                    System.out.println("Digite Status da Missão: ");
                    String inputStatus = caixaDeInput.nextLine();
                    System.out.println("Digite a idade do ninja: ");
                    int inputIdade = caixaDeInput.nextInt();
                    caixaDeInput.nextLine();
                    System.out.println("Digite a Habilidade Especial do ninja");
                    String inputHabilidade = caixaDeInput.nextLine();
                    meusNinjas.add(new Uchiha(inputNome, inputMissao, inputDificuldade, inputStatus, inputIdade, inputHabilidade));

                    break;

                //Listar Ninjas
                case 2:

                    if (meusNinjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado!");
                    } else {
                        for (Uchiha ninjas : meusNinjas) {
                            ninjas.mostrarInformacoes();
                            System.out.println("-------------------");

                        }

                    }
                    break;

                //Alterando Habilidade Especial
                case 3:

                    if(meusNinjas.isEmpty()){
                        System.out.println("Nenhum ninja na lista! Cadastre um ninja primeiro");

                    } else{
                        System.out.println("Selecione o slot do Ninja que deseja substituir a habilidade especial ");
                        selecao = caixaDeInput.nextInt();
                        caixaDeInput.nextLine();
                        System.out.println("Digite o nome da habilidade ");
                        inputHabilidade = caixaDeInput.nextLine();

                        meusNinjas.get(selecao).setHabilidadeEspecial(inputHabilidade);
                        System.out.println("Habilidade Especial Alterada Para: " + meusNinjas.get(selecao).getHabilidadeEspecial());

                    }

                    break;

                default:

                    if (opcao > meusNinjas.size()) {
                        System.out.println("Opção inválida!");

                    }


            }


        }

        caixaDeInput.close();

    }
}
