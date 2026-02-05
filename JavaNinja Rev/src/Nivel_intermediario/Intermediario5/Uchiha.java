package Intermediario5;

public class Uchiha extends Ninja implements MostrarHabilidade{

    //Meu construtor com parâmetros
    //Para conseguir pegar os dados do construtor da Super classe Ninja, preciso da palavra reservada super
    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);


    }

    //Método de mostrar a habilidade que estou pegando da minha interface
    @Override
    public void mostrarHabilidade() {
        System.out.println("Sharingan ativado!");

    }

}
