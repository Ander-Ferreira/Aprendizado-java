package Intermediario2;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Criar classes construtoras com argumento e sem argumento

       Hokage Tobirama = new Hokage();

        Hokage Hashirama = new Hokage("Hashirama",  32,  false);
        System.out.println("Nome: " + Hashirama.nome + " Idade: " + Hashirama.idade + " Vivo ou Morto: " + Hashirama.vivoOuMorto);




    }
}
