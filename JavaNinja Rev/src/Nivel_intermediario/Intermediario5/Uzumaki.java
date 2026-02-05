package Intermediario5;

public class Uzumaki extends Ninja implements MostrarHabilidade{

    //Meu construtor com parâmetros
    //Para conseguir pegar os dados do construtor da Super classe Ninja, preciso da palavra reservada super

    public Uzumaki(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);

    }

    @Override
    public void mostrarHabilidade() {
        System.out.println("Raposa de 9 caldas ativada!");

    }
}
