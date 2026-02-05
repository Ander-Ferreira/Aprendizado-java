package Condicoes;

import java.util.Scanner;

public class ScannerDeUsuario {
    public static void main(String[] args) {

        //Scanner é uma forma de trazer o usuário para dentro da aplicação
        //Objetivo: O usuário vai criar um ninja e eu irei validar os dados

        //Minha caixa de texto
            Scanner caixaDeTexto = new Scanner(System.in);

        //Minha variável que irá abrigar uma caixa de texto, não preciso criar outra caixa de texto
            System.out.println("Escreva o nome do ninja: ");
            String nomeDoNinja = caixaDeTexto.nextLine();

        //Receber números do usuário
            System.out.println("Digite a idade do ninja: ");
            int idadeDoNinja = caixaDeTexto.nextInt();

        //Preciso sempre fechar a caixa de texto após utilizá-la
            caixaDeTexto.close();

        //Tratando os dados
            if(idadeDoNinja < 18){
                System.out.println("Você é menor de idade! " + nomeDoNinja + " sua idade é " + idadeDoNinja);
            } else{
                System.out.println("Você é maior de idade! " + nomeDoNinja + " sua idade é " + idadeDoNinja);
            }


    }
}
