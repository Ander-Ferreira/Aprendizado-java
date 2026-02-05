package Treino8;

public class Main {
    public static void main(String[] args) {
         //Objetivo: Criar uma lista linkada manualmente

        Ninja naruto = new Ninja("Naruto Uzumaki", "Aldeia da Folha", 16);
        Ninja sakura = new Ninja("Sakura Haruno", "Aldeia da Folha", 17);
        Ninja sasuke = new Ninja("Sasuke Uchiha", "Aldeia da Folha", 16);

        //Linkando minha lista
        naruto.proximo = sakura;
        sakura.proximo = sasuke;
        sasuke.proximo = null;

        //Ponteiro do primeiro slot de memória
        Ninja atual = naruto;

        //Lendo meu array
        while(atual != null){
            System.out.println("Nome do Ninja: " + atual.nome + " Vila do Ninja: " + atual.aldeia + " Idade do Ninja: " + atual.idade);
            atual = atual.proximo;

        }

        //Ou
        System.out.println("Imprimindo com laço for");
        for(atual = naruto; atual != null; atual = atual.proximo){
            System.out.println("Nome do Ninja: " + atual.nome + " Vila do Ninja: " + atual.aldeia + " Idade do Ninja: " + atual.idade);

        }



    }
}
