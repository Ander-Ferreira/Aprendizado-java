package Intermediario7;

public class Uchiha extends Ninja implements Sharingan{

    //Meu construtor
    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);

    }

    //Overload do meu construtor
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, Rank rankNinja){
        super(nome, aldeia, idade);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rankNinja = rankNinja;
    }

    //Método da minha interface Sharingan
    @Override
    public void mostrarSharingan() {
        System.out.println("Eu sou um uchiha e tenho um Sharingan!");
    }


}
