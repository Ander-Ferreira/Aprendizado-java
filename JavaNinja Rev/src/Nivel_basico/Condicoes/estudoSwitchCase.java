package Condicoes;

import java.util.Scanner;

public class estudoSwitchCase {
    public static void main(String[] args) {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        Scanner caixaDeTexto = new Scanner(System.in);
        int escolhaDoUsuario = caixaDeTexto.nextInt();

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("Você escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu Sakura Haruno");
                break;
            default:
                System.out.println("Opção inválida!");
        }




    }
}
