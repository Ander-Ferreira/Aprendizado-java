package Treino3;

public class Uchiha extends Ninja implements Sharingan{

    //Construtores
    public Uchiha(){

    }

    public Uchiha(String nome, String aldeia, int idade){
       super(nome, aldeia, idade);

    }

    //Método da minha interface
    @Override
    public void ativarSharingan() {
        System.out.println("Sharingan Ativado!");
    }

}
