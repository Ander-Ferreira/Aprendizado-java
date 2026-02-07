package Desafios.Nivel_intermediario.Desafio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Você vai criar um programa que gerencia diferentes
//        tipos de ninjas, cada um com suas habilidades e
//        informações. O objetivo é utilizar interfaces e
//        polimorfismo para lidar com diferentes tipos de ninjas
//        e suas habilidades.
//        1. Crie uma interface chamada Ninja com dois
//                métodos: mostrarInformacoes() para mostrar
//        detalhes do ninja e executarHabilidade() para
//        fazer o ninja usar sua habilidade.
//        2. Crie uma classe chamada NinjaBásico que
//        implementa a interface Ninja.
//        3. Crie uma classe chamada NinjaAvançado que
//        também implementa a interface Ninja. Além dos
//        atributos nome, idade e habilidade, esta classe
//        deve ter um atributo adicional chamado
//        especialidade (uma habilidade especial do ninja).
//        4. Mostre as informações e execute as habilidades
//        de cada ninja usando os métodos que você
//        implementou.

//        Como desafio extra, defina um enum chamado TipoHabilidade com diferentes tipos de
//                habilidades como TAIJUTSU, NINJUTSU, GENJUTSU, KATON, e RINNENGAN. Utilize esse
//        enum nas classes NinjaBásico e NinjaAvançado para representar o tipo de habilidade de cada
//                ninja.

        //Iniciando minha lista de ninjas básicos
        ListaGenerica<NinjaBasico> ninjasBasicos = new ListaGenerica<>();

        //Iniciando minha lista de ninjas avançados
        ListaGenerica<NinjaAvancado> ninjasAvancados = new ListaGenerica<>();

        //Meus inputs
        Scanner caixaDeInput = new Scanner(System.in);
        String caixaDeNome;
        String caixaDeHabilidade;
        int caixaDeIdade;
        String caixaDeEspecialidade;
        int opcao = 0;

        //Menu
        while(opcao != 3){
            System.out.println("Tecle 1 para registrar um novo ninja");
            System.out.println("Tecle 2 para listar os ninjas");
            System.out.println("Tecle 3 para sair");
            opcao = caixaDeInput.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Tecle 1 para registrar um ninja básico ou 2 para registrar um ninja avançado ");
                    opcao = caixaDeInput.nextInt();
                    if(opcao == 1){
                        System.out.println("Digite o nome do Ninja: ");
                        caixaDeNome = caixaDeInput.nextLine();
                        caixaDeNome = caixaDeInput.nextLine();
                        System.out.println("Digite o tipo da habilidade do ninja: TAIJUTSU, NINJUTSU, GENJUTSU, KATON, RINNENGAN ");
                        caixaDeHabilidade = caixaDeInput.nextLine().toUpperCase();
                        System.out.println("Digite a idade: ");
                        caixaDeIdade = caixaDeInput.nextInt();

                        if(! (caixaDeHabilidade.equals("TAIJUTSU") || caixaDeHabilidade.equals("NINJUTSU") || caixaDeHabilidade.equals("GENJUTSU") ||
                                caixaDeHabilidade.equals("KATON") || caixaDeHabilidade.equals("RINNENGAN")) ){
                            System.out.println("Tipo de Habilidade inválida!");

                        }else {
                            ninjasBasicos.adicionarNinja(new NinjaBasico(caixaDeNome, TipoHabilidade.valueOf(caixaDeHabilidade), caixaDeIdade));
                        }


                    } else if (opcao == 2) {
                        System.out.println("Digite o nome do Ninja: ");
                        caixaDeNome = caixaDeInput.nextLine();
                        caixaDeNome = caixaDeInput.nextLine();
                        System.out.println("Digite o tipo da habilidade do ninja: TAIJUTSU, NINJUTSU, GENJUTSU, KATON, RINNENGAN ");
                        caixaDeHabilidade = caixaDeInput.nextLine().toUpperCase();
                        System.out.println("Digite a idade: ");
                        caixaDeIdade = caixaDeInput.nextInt();
                        System.out.println("Digite a especialidade: ");
                        caixaDeEspecialidade = caixaDeInput.nextLine();
                        caixaDeEspecialidade = caixaDeInput.nextLine();

                        if(! (caixaDeHabilidade.equals("TAIJUTSU") || caixaDeHabilidade.equals("NINJUTSU") || caixaDeHabilidade.equals("GENJUTSU") ||
                                caixaDeHabilidade.equals("KATON") || caixaDeHabilidade.equals("RINNENGAN")) ){
                            System.out.println("Tipo de Habilidade inválida!");

                        }else {
                            ninjasAvancados.adicionarNinja(new NinjaAvancado(caixaDeNome, TipoHabilidade.valueOf(caixaDeHabilidade), caixaDeIdade, caixaDeEspecialidade));
                        }


                    }
                    break;

                case 2:
                    System.out.println("Digite 1 para listar ninjas básicos ou 2 para listar ninjas avançados");
                    opcao = caixaDeInput.nextInt();
                    if(opcao == 1){
                        System.out.println(ninjasBasicos.getListaDeNinjas());

                    } else if (opcao == 2) {
                        System.out.println(ninjasAvancados.getListaDeNinjas());

                    }
                    break;

                default:
                    String ternario = (opcao == 3) ? "Saindo..." : "Opção inválida!";
                    System.out.println(ternario);
                    break;


            }

        }




    }
}
