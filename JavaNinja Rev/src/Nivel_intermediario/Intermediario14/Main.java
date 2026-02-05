package Intermediario14;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender List
        //List são arrays dimensionáveis

        List<String> nomes = new ArrayList<>();
        nomes.add("Naruto Uzumaki");
        nomes.add("Sakura Haruno");
        nomes.add("Sasuke Uchiha");
        nomes.add("Kakashi Hatake");
        System.out.println("Nomes da minha Lista: " + nomes);

        //Removendo um nome da minha lista:
        nomes.remove("Sasuke Uchiha");
        System.out.println("Nomes da minha Lista: " + nomes);

        //Outra forma de remover
        nomes.remove( 0);
        System.out.println("Nomes da minha Lista: " + nomes);

        //Alterando um nome da minha lista
        nomes.set(1, "Hinata Hyuga");
        System.out.println("Nomes da minha Lista: " + nomes);

        //Tamanho da lista
        System.out.println(nomes.size());



    }
}
