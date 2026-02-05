package Intermediario7;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: aprender sobrecarga de construtores
        //A sobrecarga de construtores é feita quando precisamos inserir novos atributos em objetos já iniciados

        //Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 16);
        sasuke.mostrarDados();
        sasuke.mostrarSharingan();

        //TODO: Insira mais dois atributos - rank, numeroDeMissoes

        //Objeto com novos atributos
        Uchiha madara = new Uchiha("Uchiha Madara", "Aldeia da Folha", 55, 2500, Rank.GENNIN);
        madara.mostrarDados();
        madara.mostrarSharingan();




    }
}
