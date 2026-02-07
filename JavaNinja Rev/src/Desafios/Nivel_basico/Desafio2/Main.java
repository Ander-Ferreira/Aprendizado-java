package Desafios.Nivel_basico.Desafio2;


import java.util.Scanner;

public class Main {
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


//        CadastroNinja ninjaTeste = new CadastroNinja("Teste", "Vila da Folha", 17);
//        ListaGenerica<CadastroNinja> listaDeNinjas = new ListaGenerica<>();
//        listaDeNinjas.adicionarNinjas(ninjaTeste);
//        listaDeNinjas.mostrarNinjas();

        ListaGenerica<CadastroNinja> listaGenerica = new ListaGenerica<>();

       //Caixas de Inputs
        Scanner caixaDeInput = new Scanner(System.in);
        String caixaDeNome;
        String caixaDeVila;
        int caixaDeIdade;
        int opcoes = 0;

        while(opcoes != 4){

            System.out.println("Digite 1 para registrar");
            System.out.println("Digite 2 para listar");
            System.out.println("Digite 3 para sair");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Digite o nome");
                    caixaDeNome = caixaDeInput.nextLine();
                    caixaDeNome = caixaDeInput.nextLine();
                    System.out.println("Digite a vila");
                    caixaDeVila = caixaDeInput.nextLine();
                    System.out.println("Digite a idade");
                    caixaDeIdade = caixaDeInput.nextInt();
                    listaGenerica.adicionarNinjas(new CadastroNinja(caixaDeNome, caixaDeVila, caixaDeIdade));
                    System.out.println("Registrado com sucesso!");
                    break;

                case 2:
                    System.out.println("-----Lista de Ninjas------");
                    System.out.println(listaGenerica.getNinjas());
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;



            }

        }

        caixaDeInput.close();















    }
}
