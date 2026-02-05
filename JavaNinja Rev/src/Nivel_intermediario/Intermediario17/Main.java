package Intermediario17;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender Record
        //Record funciona como uma classe, mas seus valores são final
        //Vanntagem do record é não precisar de getters e setters e construtores

        Fixo naruto = new Fixo("Naruto Uzumaki", 05);
        System.out.println(naruto.nome());
        System.out.println(naruto.cpf());
    }
}
