package Desafios.Desafios_Aleatorios.Desafio2;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Criar um programa que calcule a média de salários de uma empresa, pedindo ao usuário a grade de funcionários e os salários, e devolvendo a média salarial.

        //Iniciando minha lista de funcionários
        LinkedList<FuncionarioLoja> listaDeFuncionarios = new LinkedList<>();

        //Menu
        Scanner caixaDeInput = new Scanner(System.in);
        String caixaDeNome;
        String caixaDeCargo;
        int caixaDeSalario;
        int opcoes = 0;

        while(opcoes != 5){
            System.out.println("Digite 1 para cadastrar um novo funcionário");
            System.out.println("Digite 2 para listar funcionários");
            System.out.println("Digite 3 para alterar funcionário");
            System.out.println("Digite 4 para excluir funcionário");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){

                case 1:
                    System.out.println("Digite o nome do funcionário");
                    caixaDeNome = caixaDeInput.nextLine();
                    caixaDeNome = caixaDeInput.nextLine();
                    System.out.println("Digite o cargo do funcionário");
                    caixaDeCargo = caixaDeInput.nextLine();
                    System.out.println("Digite o salário do funcionário");
                    caixaDeSalario= caixaDeInput.nextInt();
                    listaDeFuncionarios.add(new FuncionarioLoja(caixaDeNome, caixaDeCargo, caixaDeSalario));
                    System.out.println("Funcionário adicionado com sucesso!");

                    break;

                case 2:

                    if(listaDeFuncionarios.isEmpty()){
                        System.out.println("Lista vazia!");
                        break;
                    }

                    int soma = 0;
                    int media = 0;

                    for(int i = 0; i < listaDeFuncionarios.size(); i++ ){
                        System.out.println(listaDeFuncionarios.get(i));
                        soma += listaDeFuncionarios.get(i).getSalario();

                    }

                    media = soma / listaDeFuncionarios.size();
                    System.out.println("Media salarial de " + FuncionarioLoja.contadorDeFuncionarios() + " funcionarios: "  + media);

                    break;

                case 3:
                    System.out.println("Digite o nome do funcionário");
                    caixaDeNome = caixaDeInput.nextLine();
                    caixaDeNome = caixaDeInput.nextLine();

                    for(FuncionarioLoja funcionario : listaDeFuncionarios){

                        if(funcionario.getNome().equals(caixaDeNome)){
                            System.out.println("Digite o nome do funcionário");
                            caixaDeNome = caixaDeInput.nextLine();
                            funcionario.setNome(caixaDeNome);
                            System.out.println("Digite o cargo do funcionário");
                            caixaDeCargo = caixaDeInput.nextLine();
                            funcionario.setCargo(caixaDeCargo);
                            System.out.println("Digite o salário do funcionário");
                            caixaDeSalario = caixaDeInput.nextInt();
                            funcionario.setSalario(caixaDeSalario);
                            System.out.println("Funcionário alterado com sucesso!");

                        } else if (listaDeFuncionarios.isEmpty()) {
                            System.out.println("Lista vazia!");

                        } else{
                            System.out.println("Funcionário não existe!");
                        }

                    }

                    break;

                case 4:
                    System.out.println("Digite o nome do funcionário que deseja excluir");
                    caixaDeNome = caixaDeInput.nextLine();
                    caixaDeNome = caixaDeInput.nextLine();

                    for(FuncionarioLoja funcionario: listaDeFuncionarios){

                        if(funcionario.getNome().equals(caixaDeNome)){
                            listaDeFuncionarios.remove();
                            System.out.println("Funcionário excluído com sucesso!");

                        } else if (listaDeFuncionarios.isEmpty()) {
                            System.out.println("Lista vazia!");

                        } else{
                            System.out.println("Funcionário não existe!");

                        }

                    }

                    break;

                default:
                    String ternario = (opcoes == 5)? "Saindo do programa..." : "Opção inválida!";
                    System.out.println(ternario);


            }

        }




    }
}
