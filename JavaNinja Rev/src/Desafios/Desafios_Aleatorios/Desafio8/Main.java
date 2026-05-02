package CadastroDePessoas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //TODO: Faça um cadastro de pessoas, com nome, idade, e país
    //Depois ordene por idade, por país e por nome

    public static void main(String[] args) {

        List<Pessoa> listaDePessoas = new ArrayList<>();

        Scanner caixaDeInput = new Scanner(System.in);
        int opcoes = 0;
        int caixaDeIdade;
        String caixaDeNome;
        String caixaDePais;


        while(opcoes < 7){
            System.out.println("Digite 1 para cadastrar uma pessoa");
            System.out.println("Digite 2 para atualizar pessoa");
            System.out.println("Digite 3 para excluir pessoa");
            System.out.println("Digite 4 para ordenar pessoa pelo nome");
            System.out.println("Digite 5 para ordenar pessoa por idade");
            System.out.println("Digite 6 para ordenar pessoa pelo país");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    caixaDeNome = caixaDeInput.nextLine();
                    caixaDeNome = caixaDeInput.nextLine();
                    System.out.println("Digite o país da pessoa: ");
                    caixaDePais = caixaDeInput.nextLine();
                    System.out.println("Digite a idade da pessoa");
                    caixaDeIdade = caixaDeInput.nextInt();

                    listaDePessoas.add(new Pessoa(caixaDeNome, caixaDePais, caixaDeIdade));
                    break;

                case 2: {
                    System.out.println("Digite o nome da pessoa que deseja alterar: ");
                    caixaDeNome = caixaDeInput.nextLine();
                    final String caixaDePesquisa = caixaDeInput.nextLine();
                    Pessoa pessoaAchada = listaDePessoas.stream()
                            .filter(pessoa -> pessoa.getNome().equals(caixaDePesquisa))
                            .findFirst().orElse(null);

                    if(pessoaAchada.equals(null)){
                        System.out.println("Pessoa não encontrada!");

                    }

                    System.out.println("Digite o novo nome: ");
                    caixaDeNome = caixaDeInput.nextLine();
                    pessoaAchada.setNome(caixaDeNome);
                    System.out.println("Digite o novo país: ");
                    caixaDePais = caixaDeInput.nextLine();
                    pessoaAchada.setPais(caixaDePais);
                    System.out.println("Digite a nova idade: ");
                    caixaDeIdade = caixaDeInput.nextInt();
                    pessoaAchada.setIdade(caixaDeIdade);
                    System.out.println("Pessoa atualizada com sucesso!");
                    break;

                }

                case 3:{
                    System.out.println("Digite o nome da pessoa que deseja excluir: ");
                    caixaDeNome = caixaDeInput.nextLine();
                    final String caixaDePesquisa = caixaDeInput.nextLine();
                   Pessoa pessoaAchada =  listaDePessoas.stream()
                           .filter(pessoa -> pessoa.getNome().equals(caixaDePesquisa))
                           .findFirst().orElse(null);

                   if(pessoaAchada.equals(null)){
                       System.out.println("Pessoa não encontrada!");

                   }

                    listaDePessoas.remove(pessoaAchada);
                    System.out.println("Pessoa removida com sucesso!");

                   break;

                }

                case 4:
                    listaDePessoas.stream()
                            .sorted((nome1, nome2) -> String.CASE_INSENSITIVE_ORDER.compare(nome1.getNome(), nome2.getNome()))
                            .forEach(System.out::println);

                    break;

                case 5:
                    listaDePessoas.stream()
                            .sorted((idade1, idade2) -> Integer.compare(idade1.getIdade(), idade2.getIdade()))
                            .forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Digite o país que deseja procurar");
                    caixaDePais = caixaDeInput.nextLine();
                    final String caixaDePesquisa = caixaDeInput.nextLine();

                   Pessoa paisAchado = listaDePessoas.stream()
                            .filter(pais -> pais.getPais().equals(caixaDePesquisa))
                            .findFirst().orElse(null);

                   if(paisAchado.equals(null)){
                       System.out.println("País não encontrado");
                   }

                   listaDePessoas.stream().filter(pais -> pais.getPais().equals(caixaDePesquisa)).forEach(System.out::println);


                    break;

                default:
                    System.out.println("Saindo do programa...");























            }



        }


    }

}
