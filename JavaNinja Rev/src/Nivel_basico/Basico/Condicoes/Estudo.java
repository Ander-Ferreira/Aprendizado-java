package Condicoes;

import java.util.Scanner;

public class Estudo {
    public static void main(String[] args) {
        System.out.println("Escolha a Opção Correta:");
        System.out.println("1 - Anderson ");
        System.out.println("2 - Augusto");
        System.out.println("3 - Ronaldo");
        System.out.println("4 - Fátima");

        Scanner caixaDeTexto = new Scanner(System.in);

//        System.out.println("Escolha uma opção!");
//        int guardarText = caixaDeTexto.nextInt();
//
//        switch (guardarText){
//            case 1:
//                System.out.println("Você escolheu: Anderson!");
//                break;
//            case 2:
//                System.out.println("Você escolheu: Augusto!");
//                break;
//            case 3 :
//                System.out.println("Você escolheu Ronaldo!");
//                break;
//            case 4 :
//                System.out.println("Você escolheu Fátima!");
//                break;
//            default:
//                System.out.println("Nenhuma das opções são válidas!");
//
//        }


        //Arrays
            String [] meuArray = new String[5];
            meuArray[0] = "Minha primeira string!";
            meuArray[1] = "Minha segunda string!";
            meuArray[2] = "Minha terceira string!";
            meuArray[3] = "Minha quarta string!";
            meuArray[4] = "Minha quinta string!";


        System.out.println(meuArray[4]);

        //uma senha
        //se não for essa senha, exiba a mensagem de senha errada
        //máximo de três tentativas

        boolean logar = false;
        int senha = 12345;



       for(int i = 0; i <= 3; i++){
           System.out.println("Digite a senha");
           Scanner caixaDaSenha = new Scanner(System.in);
           senha = caixaDaSenha.nextInt();
            if(senha == 12345){
               System.out.println("Logado com sucesso!");
               logar = true;
               return;
           }
           System.out.println("Senha errada, tente novamente!");

       }

        System.out.println("Bloqueado por inúmeras tentativas, tente novamente mais tarde!");

        String [] carros = new String[3];
        carros [0] = "Gol";
        carros [1] = "Bmw";
        carros [2] = "Ranger";

        System.out.println(carros[2]);







    }
}
