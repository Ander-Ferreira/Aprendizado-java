package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        //Ternário é um meio de diminuir o código ao substituir um if else
        //Objetivo da aula: Diminuir um if else anterior usando um ternário no lugar

            short idadeDoNinja = 16;

        //Meu ternário de comparação de idade
            String comparacaoDeIdade = (idadeDoNinja >= 18) ? "O ninja é maior de idade!" : "O ninja é de menor!";
            System.out.println(comparacaoDeIdade);

        //Qual é o gênero
            char genero = 'M';
            String comparacaoDeGenero = (genero == 'M') ? "O gênero é masculino" : "O gênero é femínino!";
            System.out.println(comparacaoDeGenero);




    }
}
