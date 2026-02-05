package Desafio3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Você foi encarregado de desenvolver um sistema em
//        Java para gerenciar uma lista de ninjas usando a
//        estrutura de dados LinkedList. Cada ninja terá nome,
//        idade e vila. Inicialmente, sete ninjas serão
//        adicionados à lista, e o sistema deverá permitir
//        operações como remover o primeiro ninja, adicionar
//        um novo ninja no início e exibir a lista completa.
//        Também será possível acessar um ninja em uma
//        posição específica da lista. O objetivo é praticar o uso
//        de LinkedList, incluindo os métodos de adicionar,
//        remover e acessar elementos, em uma estrutura
//        dinâmica.
//                Tópicos a serem utilizados:
//        LinkedList: Para armazenar e manipular a lista de
//        ninjas.
//                Classes e Objetos: Para representar os ninjas com
//        nome, idade e vila.
//        Métodos da LinkedList: Para realizar operações
//        como adicionar, remover e acessar elementos.
//                Laços de Repetição (Loops): Para iterar sobre os
//        elementos da lista.
//                Métodos Getters: Para acessar os atributos dos
//        objetos ninja.
//        Métodos da Classe Object (toString): Para exibir
//        de forma legível as informações de cada ninja.

//        Como desafio adicional, implemente uma função que permita ordenar a lista de ninjas por
//        diferentes critérios: idade, nome ou vila. O sistema deverá oferecer ao usuário a opção de
//        escolher o critério de ordenação, e a lista deverá ser reorganizada com base na escolha. Além
//        disso, implemente uma funcionalidade que busque e retorne informações de um ninja
//        específico na lista com base no nome, utilizando um algoritmo de busca eficiente.

        //Minha lista
        LinkedList<Ninja> listaNinjas = new LinkedList<>();
        //Minhas HashList
        Set<Ninja> listaAlfabetica = new TreeSet<>(Comparator.comparing(Ninja::getNome, String.CASE_INSENSITIVE_ORDER));
        Set<Ninja> listaEmOrdemDeChegada = new LinkedHashSet<>();

        //Menu
        int opcao = 0;
        String inputNome;
        String inputVila;
        int inputIdade = 0;
        int inputSelecao = 0;

        Scanner caixaDeInput = new Scanner(System.in);
        while (opcao != 5) {
            System.out.println("-------Sistema de Ninjas-------");
            System.out.println("Tecle Opção 1 para Cadastrar Um Novo Ninja");
            System.out.println("Tecle Opção 2 para Remover Um Ninja");
            System.out.println("Tecle Opção 3 para Listar Todos os Ninjas");
            System.out.println("Tecle Opção 4 para Buscar Um Ninja em Específico");
            System.out.println("Tecle Opção 5 para Sair");
            opcao = caixaDeInput.nextInt();

            switch (opcao) {

                //Cadastro de Ninjas
                case 1:
                    System.out.println("Digite o nome ");
                    inputNome = caixaDeInput.nextLine();
                    inputNome = caixaDeInput.nextLine();
                    System.out.println("Digite a vila ");
                    inputVila = caixaDeInput.nextLine();
                    System.out.println("Digite a idade ");
                    inputIdade = caixaDeInput.nextInt();
                    listaNinjas.add(0, new Ninja(inputNome, inputVila, inputIdade));
                    System.out.println("Ninja Cadastrado com Sucesso! " + listaNinjas.getFirst());
                    break;

                //Remoção de Ninjas
                case 2:
                    System.out.println("Digite o slot do Ninja que Deseja Remover");
                    inputSelecao = caixaDeInput.nextInt();
                    System.out.println(listaNinjas.get(inputSelecao) + " Removido com Sucesso!");
                    listaNinjas.remove(inputSelecao);
                    break;

                //Listar Ninjas
                case 3:
                    System.out.println("Tecle 1 para organizar a lista em ordem alfabética ou 2 para a ordem em que foram adicionados");
                    inputSelecao = caixaDeInput.nextInt();

                    if (inputSelecao == 1) {

                        if (listaNinjas.isEmpty()) {
                            System.out.println("A lista está vazia!");
                            break;

                        }

                        listaAlfabetica.addAll(listaNinjas);
                        System.out.println(listaAlfabetica);


                    } else if (inputSelecao == 2) {

                        if (listaNinjas.isEmpty()) {
                            System.out.println("A lista está vazia!");
                            break;

                        }

                        listaEmOrdemDeChegada.addAll(listaNinjas);
                        System.out.println(listaEmOrdemDeChegada);

                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                //Buscar Ninjas
                case 4:
                    System.out.println("Digite 1 para o slot do ninja que deseja procurar ou 2 para Buscar pelo nome");
                    inputSelecao = caixaDeInput.nextInt();

                    if (inputSelecao == 1) {
                        inputSelecao = caixaDeInput.nextInt();
                        System.out.println(listaNinjas.get(inputSelecao));
                    } else if (inputSelecao == 2) {
                        System.out.println("Digite o nome do ninja:");
                        inputNome = caixaDeInput.nextLine();
                        inputNome = caixaDeInput.nextLine();
                        Ninja achei;

                        for (Ninja ninja : listaNinjas) {
                            if (ninja.getNome().equals(inputNome)) {
                                achei = ninja;
                                System.out.println(achei);

                            }

                        }

                    }


                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;


            }

        }


    }
}
