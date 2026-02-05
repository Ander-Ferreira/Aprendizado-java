package Intermediario18;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender Stack
        //Em Stack, o último a entrar é o primeiro a sair
        //Stack é uma estrutura de dados assim como Array e List<>

        Stack<String> ninjas = new Stack<>();
        ninjas.push("Naruto Uzumaki"); //O método add funciona também, mas é aconselhável usar push() na Stack para facilitar a legibilidade do código
        ninjas.push("Sasuke Uchiha");
        ninjas.push("Sakura Haruno");
        System.out.println(ninjas);

        //Removendo o último Ninja a entrar
        ninjas.pop(); //pop() remove sempre o último elemento
        System.out.println(ninjas);

        //Espiar o último elemento da Stack
        ninjas.peek();



    }
}
