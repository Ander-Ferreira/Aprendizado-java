package Desafios.Nivel_basico.Desafio1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Crie um programa que represente três ninjas da Vila
//        da Folha (Konoha) de "Naruto" e suas respectivas
//        missões.
//                Cada ninja tem um nome, uma idade e uma missão
//        atribuída a ele, com o nome da missão, nível de
//        dificuldade e status de conclusão

//        Use condicionais para verificar se o ninja pode concluir a missão baseado na sua idade:
//
//        Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica e
//        imprima o resultado.
//                Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica
//        e imprima o resultado.
//        Ninjas menores de 15 anos só podem concluir missões de nível C ou D. Ninjas com 15 anos
//        ou mais podem concluir missões de qualquer nível.

        //Iniciando minha lista
        LinkedList<cadastrarNinjas> listaDeNinjas = new LinkedList<>();

        //Menu
        Scanner caixaDeInput = new Scanner(System.in);
        String caixaDeNome;
        String caixaDeMissao;
        int caixaDeIdade;
        String nivelMissao;
        int opcao = 0;

        while(opcao != 4){
            System.out.println("Opção 1 para cadastrar");
            System.out.println("Opção 2 para listar ninjas");
            System.out.println("Opção 3 para checar se está apto para a missão");
            System.out.println("Opção 4 para sair");
            opcao = caixaDeInput.nextInt();

            switch (opcao){

                case 1:
                    System.out.println("Digite o nome do ninja");
                    caixaDeNome = caixaDeInput.nextLine();
                    caixaDeNome = caixaDeInput.nextLine();
                    System.out.println("Digite a missão do ninja");
                    caixaDeMissao = caixaDeInput.nextLine();
                    System.out.println("Digite a idade do ninja");
                    caixaDeIdade = caixaDeInput.nextInt();
                    System.out.println("Digite o nível de dificuldade da missão: DIFICIL, MEDIO, FACIL");
                    nivelMissao = caixaDeInput.nextLine();
                    nivelMissao = caixaDeInput.nextLine().toUpperCase();

                    if(!(nivelMissao.equals("DIFICIL") || nivelMissao.equals("MEDIO") || nivelMissao.equals("FACIL"))){
                        System.out.println("Dificuldade inválida!");
                    } else{
                        listaDeNinjas.add(new cadastrarNinjas(caixaDeNome, caixaDeMissao, caixaDeIdade, Dificuldade.valueOf(nivelMissao)));
                    }

                    break;

                case 2:
                    if(listaDeNinjas.isEmpty()){
                        System.out.println("A lista está vazia!");
                    } else{
                        System.out.println(listaDeNinjas);
                    }
                    break;

                case 3:
                    for(int ninja = 0; ninja < listaDeNinjas.size() ; ninja++){
                        if( listaDeNinjas.get(ninja).dificuldade == Dificuldade.DIFICIL ){

                            if( listaDeNinjas.get(ninja).getIdade() >= 18){
                                System.out.println("Ninja apto para a missão! " + listaDeNinjas.get(ninja).getMissao() + ", " + " Nome " + listaDeNinjas.get(ninja).getNome());
                            } else{
                                System.out.println("Ninja não está apto para a missão!" + listaDeNinjas.get(ninja).getMissao() + ", " + " Nome " + listaDeNinjas.get(ninja).getNome());
                            }

                        }  else if ( listaDeNinjas.get(ninja).dificuldade == Dificuldade.MEDIO ) {
                            if(listaDeNinjas.get(ninja).getIdade() >= 15){
                                System.out.println("Ninja apto para a missão! " + listaDeNinjas.get(ninja).getMissao() + ", " + " Nome " + listaDeNinjas.get(ninja).getNome());
                            } else {
                                System.out.println("Ninja não está apto para a missão!" + listaDeNinjas.get(ninja).getMissao() + ", " + " Nome " + listaDeNinjas.get(ninja).getNome());
                            }


                        }  else if ( listaDeNinjas.get(ninja).dificuldade == Dificuldade.FACIL ) {
                            if(listaDeNinjas.get(ninja).getIdade() > 5){
                                System.out.println("Ninja está apto para a missão! " + listaDeNinjas.get(ninja).getMissao() + ", " + " Nome " + listaDeNinjas.get(ninja).getNome());
                            } else {
                                System.out.println("O ninja não está apto para a missão!" + listaDeNinjas.get(ninja).getMissao() + ", " + "Nome" + listaDeNinjas.get(ninja).getNome());
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
