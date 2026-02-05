package Condicoes;

public class ifElse {
    public static void main(String[] args) {

        // Condições if e else

        // Objetivos da aula: Criar condições de evolução para o ninja

            String nome = "Naruto Uzumaki";

            short idade = 16; //short é para declarar variáveis com números pequenos, vai até 32
            int missoes = 14;

    // Condições

            if(missoes >= 10 && idade > 14) {
                System.out.println("Requisitos concluídos: " + nome + " é nível Chunnin");
            }

            else if (missoes >= 20 && idade > 16) {
                System.out.println("Requisitos concluídos: " + nome + " é nível Jounnin");
            }

            else {
                System.out.println("Requisitos não cumpridos: " + nome + " continua nível Gennin");
            }



    }
}
