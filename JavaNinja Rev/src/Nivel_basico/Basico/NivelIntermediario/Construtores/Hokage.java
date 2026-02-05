package NivelIntermediario.Construtores;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuMorto;


    //Construtores servem para criar objetos com base em parâmetros passados
        public Hokage(String nome, int idade, boolean vivoOuMorto){

            this.nome = nome; //O nome que passei lá em cima vai ser igual ao parâmetro
            this.idade = idade;
            this.vivoOuMorto = vivoOuMorto;

        }

    //Este é apenas um construtor sem argumentos
        public Hokage(){

        }

}
