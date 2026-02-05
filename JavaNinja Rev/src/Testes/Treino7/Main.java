package Treino7;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Objetivo do treino: criar uma lista linkada com ferramentas ninjas

        FerramentasNinja kunai = new FerramentasNinja("Kunai Afiada", "A", 100);
        FerramentasNinja katana = new FerramentasNinja("Espada Afiada", "S", 50);
        FerramentasNinja shuriken = new FerramentasNinja("Shuriken de Ferro", "SS", 30);

        //Linkando minha linked list
        kunai.proximo = katana;
        katana.proximo = shuriken;
        shuriken.proximo = null;

        FerramentasNinja atual = kunai; //ponteiro atual, sempre começo pelo item que quero que seja o primeiro da minha lista


        //Percorrendo minha lista linkada
        while(atual != null){
            System.out.println(" Nome da ferramenta: " + atual.getNome() + " Dano: " + atual.getDano() + " Quantidade: " + atual.getQuantidade());
           atual = atual.proximo;

        }

        //Forma simplificada de criar uma LinkedList usando as Collections do Java
        System.out.println("Forma simplificada de fazer uma LinkedList");
        LinkedList<FerramentasNinja> minhaLinkedList = new LinkedList<>();
        minhaLinkedList.add(kunai);
        minhaLinkedList.add(katana);
        minhaLinkedList.add(shuriken);
        System.out.println(minhaLinkedList);

    }
}
