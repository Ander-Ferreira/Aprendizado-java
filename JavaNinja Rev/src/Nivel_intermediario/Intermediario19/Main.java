package Intermediario19;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender a diferença entre Array, List e Stack

        //Arrays possuem tamanhos fixos, são usados para tarefas simples
        System.out.println("-------ARRAY------");
        String[] meuArray = new String[3];
        meuArray[0] = "[ Naruto Uzumaki, ";
        meuArray[1] = " Sasuke Uchiha, ";
        meuArray[2] = " Sakura Haruno ]";
        for(int i = 0; i < meuArray.length; i++){
            System.out.print(meuArray[i]);

        }
        System.out.println("-");

        //Listas não possuem tamanhos fixos, e podem abrigar tipos genéricos
        //Em listas não precisamos lidar com a memória como no array
        //Listas são um pouco mais lentas que o array
        //Listas já vem por padrão com métodos que facilitam nossa vida
        System.out.println("-------LIST------");
        List<String> minhaLista = new ArrayList<>();
        minhaLista.add("Naruto Uzumaki");
        minhaLista.add("Sasuke Uchiha");
        minhaLista.add("Kakashi Hatake");
        System.out.println(minhaLista);


        //Stack é uma evolução da lista, mas funciona de forma ordenada
        //O último a entrar é o primeiro a sair (FILO)
        //Um bom exemplo de Stack é navegador, onde guarda a última visitada no histórico
        //Não há como excluir o primeiro da Stack sem processar os que chegaram depois
        System.out.println("-------STACK------");
        Stack<String> minhaStack = new Stack<>();
        minhaStack.push("Hinata Hyuga");
        minhaStack.push("Ino Yamanaka");
        minhaStack.push("Temari"); //Temari é a última, então ela será a primeira a sair no caso de exclusão
        System.out.println(minhaStack);
        minhaStack.pop();
        System.out.println(minhaStack);

        System.out.println("-------QUEUE------");
        //QUEUE - FILA - É o oposto da Stack, na fila o primeiro a chegar é o primeiro a sair (FIFO)
        //O primeiro a chegar será o Head da fila, e o último será Tail.
        //Não há como excluir o último da fila, é preciso processar todos antes
        Queue<String> minhaFila = new LinkedList<>();
        minhaFila.add("Shikamaru Nara");
        minhaFila.add("Tenten");
        minhaFila.add("Rock Lee");
        minhaFila.add("Chouji");
        System.out.println(minhaFila);
        minhaFila.poll(); //O pool irá processar o primeiro da fila e irá retirá-lo
        System.out.println(minhaFila);
        System.out.println(minhaFila.peek()); // O peek irá mostrar sempre o Head da nossa fila (O primeiro)

        //Diferença entre um ArrayList e Uma LinkedList
        //O ArrayList é ótimo para procurar itens pois possuem indices, mas possui uma performance horrível para fazer muitas operações, é pouco performático
        //Exemplo disso é a operação para adicionar um usuário ao indice já preenchido, será preciso reorganizar (bilhões) de usuários se for uma rede social
        //Já a LinkedList é terrível para procurar algo, porém, para inserir um novo elemento na posição que for, é extremamente simples por não precisar de reorganização

//        Array é fixo, o problema disso é que os slots de memórias não são dinâmicos para adicionar novos itens.
//                O ArrayList chegou para resolver o problema do Array ao implementar o sistema de cópia do último slot de memória para abrir dinamicamente vagas para adicionar
//        mais itens, e como uma evolução natural trouxe a facilidade de procurar itens por índices também, o ponto negativo é que se tiver muitos itens acaba
//        ficando pouco performático (mais itens, mais operações de reorganização de slot de memória). Já a LinkedList chegou resolver esse dilema,
//        é mais simples adicionar ou remover itens de uma lista grande, sendo que só será precisa uma única operação de troca de ponteiro.



















    }
}
