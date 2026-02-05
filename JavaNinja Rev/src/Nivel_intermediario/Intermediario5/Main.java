package Intermediario5;

public class Main {
    public static void main(String[] args) {

        //Objetivo da aula: criar uma Super classe abstrata Ninja com construtor e uma sub classe que também herde os dados do construtor

        //Sub classe Uchiha herdando a classe Ninja
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 16);
        sasuke.mostrarDados();
        sasuke.mostrarHabilidade();

        //Sub classe Uzumaki herdando a classe Ninja
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16);
        naruto.mostrarDados();
        naruto.mostrarHabilidade();




































    }




}
