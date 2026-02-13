package Nivel_avancado.Avancado_02;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
     /*
     Objetivo da aula: Entender a introdução da complexidade de algoritmos

     Tipos de Complexidade:

                                                                    Complexidade de Tempo

    Refere-se ao tempo necessário para executar o algoritmo. A complexidade de tempo é geralmente expressa em termos da notação Big O, que mostra como o tempo de execução cresce em relação ao aumento da entrada.

                                                                    Complexidade de Espaço

    Refere-se à quantidade de memória necessária para executar o algoritmo. Isso inclui o espaço para armazenar variáveis, estruturas de dados e chamadas de função.

                                                       Principais Classes de Complexidade de Tempo

    O(1) - Constante

    A execução do algoritmo leva o mesmo tempo, independentemente do tamanho da entrada.
            O(log n) - Logarítmica

    O tempo de execução cresce logaritmicamente com o tamanho da entrada. Comum em algoritmos que dividem a entrada pela metade a cada passo, como a busca binária.
            O(n) - Linear

    O tempo de execução cresce linearmente com o tamanho da entrada. Exemplo: percorrer todos os elementos de uma lista.
            O(n log n) - Linearítmica

    Uma combinação de crescimento linear e logarítmico, comum em algoritmos de ordenação eficientes, como mergesort e heapsort.
            O(n^2) - Quadrática

    O tempo de execução aumenta exponencialmente em relação ao tamanho da entrada. Exemplo: algoritmos de ordenação simples, como o bubble sort.
            O(2^n) - Exponencial

    O tempo de execução dobra a cada aumento de unidade na entrada. Comum em algoritmos de força bruta que exploram todas as combinações possíveis, como na resolução de problemas de subconjunto.
  */

    public static void main(String[] args) {

        //Comparação em velocidade de uma LinkedList e um ArrayList
        LinkedList<Integer> listaLinkada = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();


        //Adicionando itens na lista
        for(int i = 0; i < 25000; i++){
            listaLinkada.add(i);
            arrayList.add(i);

        }

        //Medidores
        long inicio;
        long fim;
        long tempo;

        //Tempo de execução do arrayList para get
       //Inicio de quanto tempo a JVM demora para entender e processar o algoritmo
        inicio = System.nanoTime();
        arrayList.get(0);

        //Fim do processamento
        fim = System.nanoTime();
        tempo = fim -inicio;
        System.out.println(" Tempo do get do arrayList: " + tempo + " ns");
        System.out.println("A medida que os itens aumentam no arrayList, o tempo de processamento também aumenta");
        System.out.println("Complexidade O(n)");

        //Tempo de execução da linkedList para get
        inicio = System.nanoTime();
        listaLinkada.get(0);

        //Fim do processamento
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println(" Tempo do get do LinkedList: " + tempo + " ns");
        System.out.println("A medida que os itens aumentam na linkedList, o tempo de processamento se mantém igual");
        System.out.println("Complexidade O(1)");






    }




}
