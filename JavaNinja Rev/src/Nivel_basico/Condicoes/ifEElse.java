package Condicoes;

public class ifEElse {
    public static void main(String[] args) {
        //Objetivo da aula - Subir de rank baseado no número de missões e idade

        String nome = "Naruto Uzumaki";
        int idade = 16;
        int numeroDeMissoes = 10;

        //Condição para gennin subir para chunin precisa ter no mínimo 10 missões e 15 anos.
        //Condição para chunin subir para jounin é ter no mínimo 20 missões e 16 anos ou mais.

        if(numeroDeMissoes >= 10 && idade >= 15){
            System.out.println("Rank: chunin!");
        }
        else if(numeroDeMissoes >= 20 && idade >= 16){
            System.out.println("Rank: jounin!");
        }
        else{
            System.out.println("Não tem os requisitos necessários para subir de nível!");
        }




    }
}
