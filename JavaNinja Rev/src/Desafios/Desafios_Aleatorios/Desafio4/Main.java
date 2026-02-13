package Desafios.Desafios_Aleatorios.Desafio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor, e a soma dos valores

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner caixaDeInput = new Scanner(System.in);
        int caixaDeNumeros;
        int opcoes = 1;


        while (opcoes != 0){

            System.out.println("Digite um número");
            caixaDeNumeros = caixaDeInput.nextInt();

            numeros.add(caixaDeNumeros);

            int menor = numeros.get(0);
            int maior = numeros.get(0);

           for(int i = 0; i < numeros.size(); i++){
               if(numeros.get(i) > maior){
                   maior = numeros.get(i);

               }

               if (numeros.get(i) < menor) {
                   menor = numeros.get(i);
               }

           }

            System.out.println("Maior numero: " + maior);
            System.out.println("Menor numero: " + menor);


           System.out.println("Tecle 0 para sair ou 1 para continuar");
            opcoes = caixaDeInput.nextInt();



        }






    }
}
