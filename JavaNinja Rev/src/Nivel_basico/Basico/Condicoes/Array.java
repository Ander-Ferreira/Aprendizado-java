package Condicoes;

public class Array {
    public static void main(String[] args) {
        //Objetivo da aula: entender como array funciona em java

        //Declaro meu array com quantos espaços de memória irei usar
            String[] ninja = new String[4];

            ninja[0] = "Naruto Uzumaki";
            ninja[1] = "Sasuke Uchiha";
            ninja[2] = "Sakura Haruno";
            ninja[3] = "Hinata Hyuga";

        System.out.println(ninja[0]);

        //Cada array representa um objeto de memória com espaços alocados fixos.
        //Tipos de arrays e inicializações

        //Array de String sempre irá inicializar como null se não houver nada alocado
            String [] arrayDeString = new String[1];
            System.out.println(arrayDeString[0]);
        //Array de tipo int sempre inicializará como 0 se não houver nada alocado
            int [] arrayDeNumeros = new int[1];
            System.out.println(arrayDeNumeros[0]);
        //Array de tipo double sempre inicializará como 0.0 se não houver nada alocado
            double [] arrayDeDouble = new double[1];
            System.out.println(arrayDeDouble[0]);
        //Array de tipo boolean sempre incializará como false se não houver nada alocado
            boolean [] meuArrayBoolean = new boolean[1];
            System.out.println(meuArrayBoolean[0]);

        //Redeclarando um array
        //Quando redeclaro um array, o conteúdo que ele tinha anteriormente em memória é apagado
            ninja = new String[5];
            ninja[0] = "Primeiro Hokage";
            ninja[1] = "Segundo Hokage";
            ninja[2] = "Terceiro Hokage";
            ninja[3] = "Quarto Hokage";
            ninja[4] = "Quinto Hokage";

        //Percorrendo o array para listar todos os nomes
            for(int i = 0; i < 5; i++){
                System.out.println(ninja[i]);
            }


    }
}
