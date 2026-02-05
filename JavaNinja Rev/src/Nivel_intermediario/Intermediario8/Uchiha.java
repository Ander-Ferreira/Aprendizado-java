package Intermediario8;

public class Uchiha extends Ninja{

    //Meu construtor
    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);

    }

    //Método normal de estratégia de inteligência
    @Override
    public void estrategiaDeInteligencia() {
        super.estrategiaDeInteligencia();
    }

    //Método com parâmetro da estratégia de inteligência
    @Override
    public void estrategiaDeInteligencia(int qi) {
        super.estrategiaDeInteligencia(qi);
    }
}
