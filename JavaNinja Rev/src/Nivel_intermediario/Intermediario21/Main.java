package Intermediario21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: aprender Set
        //O set é uma estrutura de dados que irei usar quando não quero que um elemento da minha lista se repita
        //O set não possui ordenação por índice

        Set<String> meuSet = new HashSet<>();
        meuSet.add("Naruto Uzumaki");
        meuSet.add("Sasuke Uchiha");
        meuSet.add("Sakura Haruno");
        meuSet.add("Shikamaru Nara");
        meuSet.add("Naruto Uzumaki");

        System.out.println("Imprimindo meu Set");
        System.out.println(meuSet);

        //Passando uma lista para dentro do meu set
        List<String> listaNinja = new ArrayList<>();
        listaNinja.add("Kakashi Hatake");
        listaNinja.add("Kurenai");
        listaNinja.add("Itachi Uchiha");
        listaNinja.add("Yamato");
        listaNinja.add("Kakashi Hatake");

        Set<String> grupoNinja = new HashSet<>();
        grupoNinja.addAll(listaNinja);

        System.out.println("Imprimindo meu Set com uma lista");
        System.out.println(grupoNinja);



    }
}
