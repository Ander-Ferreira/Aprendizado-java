package Basico;

public class Array2D {
    public static void main(String[] args) {

        //Em um array 2D, primeiro tenho as linhas, e depois as colunas
        String[][] ninjasEaldeias = new String[3][3];

        ninjasEaldeias[0][0] = "Aldeia da folha";
        ninjasEaldeias[0][1] = "Naruto Uzumaki";
        ninjasEaldeias[0][2] = "Shikamaru Nara";

        ninjasEaldeias[1][0] = "Aldeia da Areia";
        ninjasEaldeias[1][1] = "Gaara da Areia";
        ninjasEaldeias[1][2] = "Temari";

        ninjasEaldeias[2][0] = "Aldeia da Névoa";
        ninjasEaldeias[2][1] = "Zabuza Momochi";
        ninjasEaldeias[2][2] = "Haku";

        for(int i = 0; i < ninjasEaldeias.length; i++){
           System.out.println(ninjasEaldeias[0][i]);
           System.out.println(ninjasEaldeias[1][i]);
           System.out.println(ninjasEaldeias[2][i]);

        }

        System.out.println("Categorias e Ninjas--------------------");

        String[][] categoriasEninjas = new String[3][3];
        categoriasEninjas[0][0] = "Gennin";
        categoriasEninjas[0][1] = "Naruto Uzumaki";
        categoriasEninjas[0][2] = "Sakura Haruno";

        categoriasEninjas[1][0] = "Chunnin";
        categoriasEninjas[1][1] = "Sasuke Uchiha";
        categoriasEninjas[1][2] = "Shikamaru Nara";

        categoriasEninjas[2][0] = "Jounin";
        categoriasEninjas[2][1] = "Kakashi Hatake";
        categoriasEninjas[2][2] = "Guy";

        for(int i = 0; i < categoriasEninjas.length; i++){
            System.out.println(categoriasEninjas[0][i]);
            System.out.println(categoriasEninjas[1][i]);
            System.out.println(categoriasEninjas[2][i]);

        }

    }
}
