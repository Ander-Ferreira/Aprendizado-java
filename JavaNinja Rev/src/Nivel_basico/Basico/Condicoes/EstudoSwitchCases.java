package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        //Switch Cases -> Usado para quando temos condições limitadas, que eu tenho o início e fim em mente

        //Objetivo da aula: entender o uso do switch case escolhendo um ninja

            Scanner caixaDeTexto = new Scanner(System.in);

       //Usuário poderá escolher somente um dos ninjas
            System.out.println(" 1 - Naruto Uzumaki");
            System.out.println(" 2 - Sasuke Uchiha");
            System.out.println(" 3 - Sakura Haruno");

            System.out.println("Escolha um ninja: ");
            int escolhaDoUsuario = caixaDeTexto.nextInt();


        //Cases com as escolhas que o usuário pode fazer
            switch (escolhaDoUsuario){
                case 1:
                    System.out.println("Você escolheu Naruto Uzumaki, o ninja mais gente boa.");
                    break;
                case 2:
                    System.out.println("Você escolheu Sasuke Uchiha, o ninja trevoso.");
                    break;
                case 3:
                    System.out.println("Você escolheu Sakura Haruno, uma ninja legal.");
                    break;
                default:
                    System.out.println("Você não escolheu uma opção válida!");

            }

            caixaDeTexto.close();







    }
}
