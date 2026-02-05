package Basico;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String[] nomes = new String[4];
        nomes[0] = "Sakura Haruno";
        nomes[1] = "Sasuke Uchiha";
        nomes[2] = "Naruto Uzumaki";
        nomes[3] = "Hinata Hyuga";

        for(int i = 0; i < nomes.length; i ++ ){
            System.out.println("Nomes dos ninjas: " + nomes[i]);

        }

        System.out.println("----------------------- Laço while");

       String[] aldeias = new String[5];
       aldeias[0] = "Aldeia da Folha";
       aldeias[1] = "Aldeia da Areia";
       aldeias[2] = "Aldeia do som";
       aldeias[3] = "Aldeia da Nevoa";
       aldeias[4] = "Aldeia da Pedra";


        int i = 0;
        while(i < aldeias.length){
            System.out.println(aldeias[i]);
            i++;

        }

        System.out.println("Redeclaração");
        aldeias[4] = "Aldeia Redeclarada";



        for(i = 0; i < aldeias.length; i++){
            System.out.println(aldeias[i]);

        }


        //Se eu tento inserir um novo indice no array, todo o conteúdo do meu array é varrido pelo garbage collection
        //Porque ao fazer isso estarei usando um novo objeto de memoria

        aldeias = new String[5];

        for(i = 0; i < aldeias.length; i++){
            System.out.println(aldeias[i]);

        }










    }
}
