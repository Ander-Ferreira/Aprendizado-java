package Condicoes;

public class Array2d {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender array 2d com uma matriz
        //Em um array 2d primeiro temos as linhas -> [] e depois o número de colúnas -> []

        //Array de três linhas e três colunas
            String [] [] ninjasEaldeias = new String[3][3];
            ninjasEaldeias [0] [0] = "Konoha";
            ninjasEaldeias [0] [1] = "Naruto";
            ninjasEaldeias [0] [2] = "Sasuke Uchiha";

            ninjasEaldeias [1] [0] = "Nevoa";
            ninjasEaldeias [1] [1] = "Zabuza";
            ninjasEaldeias [1] [2] = "Haku";

            ninjasEaldeias [2] [0] = "Areia";
            ninjasEaldeias [2] [1] = "Gaara";
            ninjasEaldeias [2] [2] = "Temari";

            for(int i = 0; i < ninjasEaldeias.length; i++){
                System.out.println(ninjasEaldeias[0][i]); //Primeira linha, e todos da primeira coluna
                System.out.println(ninjasEaldeias[1][i]); // Segunda linha, e todos da segunda coluna
                System.out.println(ninjasEaldeias[2][i]); //Terceira linha, e todos da terceira coluna
            }
    }
}
