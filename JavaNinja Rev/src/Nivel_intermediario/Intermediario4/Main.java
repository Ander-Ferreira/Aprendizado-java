package Intermediario4;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Criar uma classe de Ninja abstrata com métodos de uma interface
        //Lembrando que não posso criar objetos a partir da minha classe abstrata Ninja

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.estrategiaNinja();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 16;
        Sasuke.estrategiaNinja();





    }
}
