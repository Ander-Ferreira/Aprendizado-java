package Condicoes;

public class Desafio {
    public static void main(String[] args) {
          // Desafio: Criar um programa que represente três ninjas da aldeia da folha de konoha
         // e suas respectivas missões.

        // Cada ninja tem um nome, uma idade, e uma missão atribuída a ele, com o nome da missão,
        // nível de dificuldade e o status de conclusão.

            String ninja1 = "Naruto Uzumaki";
                  String missao1 = "País das ondas";
                  char rankMissao1 = 'D';
                  short idadeNinja1 = 16;
                  String statusDaMissao = "Em andamento";

            String ninja2 = "Kakashi";
                  String missao2 = "Espionagem";
                  char rankMissao2 = 'S';
                  short idadeNinja2 = 25;
                  String statusDaMissao2 = "Concluída";



        String ninja3 = "Shikamaru";
               String missao3 = "Resgate";
               char rankMissao3 = 'C';
               short idadeNinja3 = 15;
               String statusDaMissao3 = "Concluída";


    //Segunda parte do problema

    /* Use condicionais para verificar se o ninja pode concluir a missão baseado na sua idade:

        Altere o status da missão para "concluída" ou "não concluída" de acordo com essa lógica e
        imprima o resultado.

        Ninjas menores de 15 anos só podem concluir missões de nível C ou D. Ninjas com 15 anos
        ou mais podem concluir missões de qualquer nível.   */


    if(idadeNinja1 < 15){
        if (rankMissao1 == 'C' || rankMissao1 == 'D') {
            statusDaMissao = "Concluída";

        } else{
            statusDaMissao = "Missão não concluída, você é novo demais!";
        }
    } else{
        statusDaMissao = "Concluída por ter maior idade!";
    }

    if(idadeNinja2 < 15){
        if(rankMissao2 == 'C' || rankMissao2 == 'D'){
            statusDaMissao2 = "Concluída";
        } else{
            statusDaMissao2 = "Missão não concluída, você é novo demais!";
        }
    } else{
        statusDaMissao2 = "Missão concluída por ser maior de idade";
    }

    if(idadeNinja3 < 15){
        if(rankMissao3 == 'C' || rankMissao3 == 'D'){
            statusDaMissao3 = "Concluída";
        } else{
            statusDaMissao3 = "Não concluída por ser novo demais";
        }
    } else{
        statusDaMissao3 = "Concluída";
    }



        //Prints

        System.out.println("Nome: " + ninja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Nome da Missão: " + missao1);
        System.out.println("Status da Missão: " + statusDaMissao);
        System.out.println("----------------------------------------");

        System.out.println("Nome:  " + ninja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Nome da Missão: " + missao2);
        System.out.println("Status da Missão:  " + statusDaMissao2);
        System.out.println("----------------------------------------");

        System.out.println("Nome: " + ninja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Nome da Missão: " + missao3);
        System.out.println("Status da Missão = " + statusDaMissao3);




    }
}
