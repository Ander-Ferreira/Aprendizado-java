package Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        //Caixa de input
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        System.out.println("Digite o nível da missão: ");
        String dificuldadeMissao = caixaDeTexto.nextLine();
        System.out.println("O nível da missão é: " + dificuldadeMissao);

        System.out.println("Digite a idade do ninja");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja);




    //Exercício:
//        Lógica que você deve implementar
//
//        Se o ninja tiver menos de 15 anos:
//
//        Missões D ou C → concluída
//
//        Missões B, A ou S → falha
//
//        Se o ninja tiver 15 anos ou mais:
//
//        Qualquer missão → concluída

    String statusMissao = "Em andamento";

    if(idadeDoNinja < 15){
        if(dificuldadeMissao.equals("C") || dificuldadeMissao.equals("D")){
            statusMissao = "concluida!";



        } else{
            statusMissao = "falha!";
        }

    } else{
        statusMissao = "concluída!";
    }

        System.out.println("A missão está: " + statusMissao);






















    }

}
