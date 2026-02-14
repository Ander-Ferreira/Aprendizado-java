package Desafios.Desafios_Aleatorios.Desafio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês,
//        dia e ano de nascimento). Sua classe deve ter um construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get.
//        A classe também deve incluir um método que calcule e retorne a idade (em anos),
//         um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a
//         frequência cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa,
//         instancie um objeto da classe HeartRates e imprima as informações a partir desse objeto — incluindo nome,
//        sobrenome e data de nascimento da pessoa — calcule e imprima a idade da pessoa (em anos),
//                seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.
//
//        P.S. 1: A frequência cardíaca máxima é 220 - a idade atual de quem será medido.
//
//        P.S. 2: (Calculadora de frequência cardíaca alvo) Ao fazer exercícios físicos, você pode
//        utilizar um monitor de frequência cardíaca para ver se sua frequência permanece dentro de um
//        intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a
//        American Heart Association (AHA) www.americanheart.org/presenter.jhtml?identifier=4736),
//        a fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos.
//                Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.
//        [Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com base na saúde,
//        capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar ou modificar um programa de exercícios
//        físicos.

        //Inciando minha lista
        ArrayList<HeartRates> listaDePacientes = new ArrayList<>();

        //Menu
        Scanner caixaDeInput = new Scanner(System.in);
        String caixaDeNome;
        String caixaDeSobrenome;
        int caixaDiaNascimento;
        int caixaMesNascimento;
        int caixaAnoNascimento;
        int caixaDeId;
        int opcoes = 0;

        while(opcoes != 4){
            System.out.println("Digite 1 para cadastrar seus dados");
            System.out.println("Digite 2 para consultar sua frequência cardiaca");
            System.out.println("Digite 3 para sair");
            opcoes = caixaDeInput.nextInt();

            switch (opcoes){
                case 1:
                    System.out.println("Digite seu nome");
                    caixaDeNome = caixaDeInput.nextLine();
                    caixaDeNome = caixaDeInput.nextLine();
                    System.out.println("Digite seu sobrenome");
                    caixaDeSobrenome = caixaDeInput.nextLine();
                    System.out.println("Digite o dia em que nasceu");
                    caixaDiaNascimento = caixaDeInput.nextInt();
                    System.out.println("Digite o mês de nascimento");
                    caixaMesNascimento = caixaDeInput.nextInt();
                    System.out.println("Digite o ano de nascimento");
                    caixaAnoNascimento = caixaDeInput.nextInt();
                    listaDePacientes.add(new HeartRates(caixaDeNome, caixaDeSobrenome, caixaDiaNascimento, caixaMesNascimento, caixaAnoNascimento));
                    break;

                case 2:
                    System.out.println("Digite o id do pasciente ");
                    caixaDeId = caixaDeInput.nextInt();

                    for(int i = 0; i < listaDePacientes.size(); i++){

                        if(caixaDeId != listaDePacientes.get(i).getId()){
                            System.out.println("Pasciente não cadastrado!");
                        } else {
                            System.out.println(listaDePacientes.get(i));
                            System.out.println("Sua idade atual é: " + listaDePacientes.get(i).calcularIdade());
                            listaDePacientes.get(i).calcularFrequencia();
                        }

                    }
                break;

                default:
                    String ternario = (opcoes == 3)? "Saindo do programa..." : "Opção inválida!";
                    System.out.println(ternario);

            }

        }



   }
}
