package Intermediario10;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: aprender atributos e métodos final
        //Métodos final não podem ser sobrescritos com @override, pois são final
        //Atributos final também não podem ser alterados, é como as contantes no javascript

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 15;
        //altura é final e já foi setado na classe ninja, não pode ser alterado depois

        sasuke.mostrar();
        System.out.println("Método final logo abaixo");
        sasuke.tacarKunai();




    }
}
