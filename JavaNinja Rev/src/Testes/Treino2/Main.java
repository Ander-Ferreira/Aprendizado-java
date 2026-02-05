package Treino2;

public class Main {
    public static void main(String[] args) {
        //Objetivo do treino é exercitar tudo que foi passado no nível intermediário até agora
        //TODO:SUPER CLASSE ABSTRATA NINJA, SUBCLASSES DE NINJA, INTERFACES, ENUM, SOBRECARGA DE CONSTRUTORES

        //Uchiha
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 14);
        sasuke.mostrarDados();
        sasuke.ativarSharinga();

        //TODO: ADICIONAR MAIS DOS ATRIBUTOS AO UCHIHA, numeroDeMissões, Rank

        Uchiha madara = new Uchiha("Uchiha Madara", "Aldeia da Folha", 55, 3000, RankNinja.KAGE);
        madara.mostrarDados();
        madara.ativarSharinga();




    }
}
