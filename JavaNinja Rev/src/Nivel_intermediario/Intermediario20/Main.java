package Intermediario20;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender LinkedList
        //LinkedList trabalha com ponteiros, onde o primeiro item da lista apontará para o segundo
        //O segundo item apontará para o terceiro, e assim por diante, até o último item da lista apontar para um valor null

        Ninja naruto = new Ninja("Naruto Uzumaki", "Vila da Folha");
        Ninja gaara = new Ninja("Gaara da Areia", "Vila da Areia");
        Ninja orochimaru = new Ninja("Orochimaru", "Vila do Som");

        //Agora vou criar minha lista linkada com o ponteiro da minha classe
        naruto.proximo = gaara;
        gaara.proximo = orochimaru;
        orochimaru.proximo = null;

        Ninja atual = naruto; //Este é o meu marcador atual, começará pelo primeiro item da minha lista linkada

        //Agora para ler minha lista linkada
        while(atual != null ){
            System.out.println("Nome: " + atual.nome + " vila: " + atual.vila);
            atual = atual.proximo; //aqui passo para o próximo item
        }

    }
}
