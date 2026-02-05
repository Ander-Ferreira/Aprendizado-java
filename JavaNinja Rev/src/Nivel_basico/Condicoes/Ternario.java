package Condicoes;

public class Ternario {
    public static void main(String[] args) {

        int numeroDeMissoes = 10;
        String duasPossibilidades = (numeroDeMissoes >=  10) ? "O ninja tem dez missões ou mais!" : "O ninja tem menos de dez missões!";
        System.out.println(duasPossibilidades);

        int idade = 15;
        String aptoOuNao = (idade > 15)? "O ninja está apto a fazer missões fora da aldeia"  : "O ninja não está apto a fazer missões fora";
        System.out.println(aptoOuNao);

        String nomeDoNinja = "Naruto Uzumaki";

        String preenchidoOuNao = (nomeDoNinja != "")? "O nome do ninja é: " + nomeDoNinja : "O nome do ninja não foi preenchido!" ;
        System.out.println(preenchidoOuNao);




    }
}
