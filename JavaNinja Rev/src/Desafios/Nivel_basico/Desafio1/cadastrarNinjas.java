package Desafios.Nivel_basico.Desafio1;

public class cadastrarNinjas extends Ninja {

    Dificuldade dificuldade;

    //Meu construtor herdade
    public cadastrarNinjas(String nome, String missao, int idade, Dificuldade dificuldade){
        super(nome, missao, idade);
        this.dificuldade = dificuldade;
    }




}
