package Treino9;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ninja ninja = new Ninja();
        Ninja ninja2 = new Ninja();
        Ninja ninja3 = new Ninja();
        Ninja ninja4 = new Ninja();
        Ninja ninja5 = new Ninja();
        Ninja ninja6 = new Ninja();
        Ninja ninja7 = new Ninja();

        //Ponteiro inicial e atual
        Ninja atual = ninja;

        //Meus apontamentos
        ninja.proximo = ninja2;
        ninja2.proximo = ninja3;
        ninja3.proximo = ninja4;
        ninja4.proximo = ninja5;
        ninja5.proximo = ninja6;
        ninja6.proximo = ninja7;
        ninja7.proximo = null;

        //Meus inputs
        Scanner caixaDeInput = new Scanner(System.in);
        String guardarNome;
        String guardarVila;
        int guardarNumero;

        //Dando início a minha lista linkada
        LinkedList<Ninja> minhaLista = new LinkedList<>();

        //Opcao para sair
        int opcao = 0;

        //Opcao para pesquisar ninja
        int buscarNinja = 0;


        //Escolhas
        while (opcao != 4) {

            System.out.println("Tecle 1 para adicionar um Ninja: ");
            System.out.println("Tecle 2 para pesquisar o slot de um ninja: ");
            System.out.println("Tecle 3 para Remover o primeiro Ninja: ");
            System.out.println("Tecle 4 para sair!");
            opcao = caixaDeInput.nextInt();

            switch (opcao) {
                case 1:

                  while (atual != null) {

                        System.out.println("Digite o nome do ninja: ");
                        guardarNome = caixaDeInput.nextLine();
                        atual.setNome(guardarNome = caixaDeInput.nextLine());
                        System.out.println("Digite a vila do ninja: ");
                        atual.setAldeia(guardarVila = caixaDeInput.nextLine());
                        System.out.println("Digite a idade do ninja: ");
                        atual.setIdade(guardarNumero = caixaDeInput.nextInt());
                        guardarNome = caixaDeInput.nextLine();
                        minhaLista.add(0, atual);
                        System.out.println("Sua lista de Ninjas: " + minhaLista);
                        atual = atual.proximo;

                    }

                    break;

                case 2:

                    System.out.println("Digite o slot do ninja que deseja buscar: ");
                    buscarNinja = caixaDeInput.nextInt();
                    System.out.println(minhaLista.get(buscarNinja));

                    break;

                case 3:

                    System.out.println(minhaLista.getFirst() + " foi removido com sucesso!");
                    minhaLista.removeFirst();

                    break;


            default:

                   String ternario = (opcao > 3 || opcao < 0)?  "Opção inválida! Encerrando o programa..." :  "Encerrando o programa";

            }


        }

        System.out.println("Saindo do Programa...");

    }
}
