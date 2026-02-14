package Nivel_avancado.Avancado_03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: compreender níveis de complexidade como O(1), O(N) e O(N²)

        ArrayList<Ninja> listaDeNinjas = new ArrayList<>();
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 15));
        listaDeNinjas.add(new Ninja("Gaara", 16));
        listaDeNinjas.add(new Ninja("Tsunade", 45));



        //Um algoritmo O(1) ou de complexidade constante, é um algoritmo que terá o mesmo tempo de execução, independemente da entrada.
        //Exemplo: acessar um item do array
        System.out.println(listaDeNinjas.get(0));

        //Um algoritmo O(n) ou algoritmo de complexidade linear, o tempo de execução cresce linearmente com o tamanho da entrada. Exemplo: percorrer todos os elementos de um array.
        System.out.println("-----------------------------------");
        for(int i = 0; i < listaDeNinjas.size(); i++){
            System.out.println(listaDeNinjas.get(i));

        }

        //Um algoritmo O(n^2) ou algoritmo de complexidade quadrática, o tempo de execução irá aumentar quadráticamente de acordo com o tamanho da entrada, exemplo um bubble sort (um for dentro do outro)
        System.out.println("----------------------------------");

        for(int i = 0; i < listaDeNinjas.size(); i++){

            for(int j = 0; j < listaDeNinjas.size(); j++){
                System.out.println(listaDeNinjas.get(i) + " Contra " + listaDeNinjas.get(j));

            }

        }









    }
}
