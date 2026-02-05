package Intermediario22;


import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender LinkedHashSet e TreeSet
        //LinkedHashSet chegou para resolver o problema de não ordenação do Set
        //O LinkedHashSet mantém os elementos na ordem em que foram inseridos
        //O TreeSet deixa os elementos inseridos em ordem natural (Alfabética ou Numérica crescente)

        LinkedHashSet<String> minhaLinkedHashSet = new LinkedHashSet<>();
        minhaLinkedHashSet.add("Naruto Uzumaki");
        minhaLinkedHashSet.add("Sakura Haruno");
        minhaLinkedHashSet.add("Kakashi Hatake");
        minhaLinkedHashSet.add("Itachi Uchiha");
        System.out.println("Imprimindo Meu LinkedHashSet");
        System.out.println(minhaLinkedHashSet);

        //Meu TreeSet
        TreeSet<String> minhaTreeSet = new TreeSet<>();
        minhaTreeSet.add("Naruto Uzumaki");
        minhaTreeSet.add("Atabi");
        minhaTreeSet.add("Kakashi Hatake");
        minhaTreeSet.add("Rock Lee");
        minhaTreeSet.add("Neji Hyuga");
        minhaTreeSet.add("Hinata Hyuga");
        System.out.println("Imprimindo minha TreeSet");
        System.out.println(minhaTreeSet);

        //Adicionando uma lista Linkada ao meu LinkedHashSet
        LinkedList<String> minhaListaLinkada = new LinkedList<>();
        minhaListaLinkada.add("Naruto Uzumaki");
        minhaListaLinkada.add("Atabi");
        minhaListaLinkada.add("Kakashi Hatake");
        minhaListaLinkada.add("Rock Lee");
        minhaListaLinkada.add("Neji Hyuga");
        minhaListaLinkada.add("Hinata Hyuga");

        LinkedHashSet<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(minhaLinkedHashSet);
        System.out.println("Imprimindo minha LinkedHashSet com uma LinkedList");
        System.out.println(ninjasLinkedHashSet);




    }
}
