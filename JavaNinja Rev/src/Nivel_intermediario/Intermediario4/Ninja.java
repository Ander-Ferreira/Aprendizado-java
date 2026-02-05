package Intermediario4;

public abstract class Ninja implements estrategiaNinja{
    String nome;
    String aldeia;
    int idade;


    //Meu método da interface
    @Override
    public void estrategiaNinja() {
        System.out.println("Eu sou " + nome + " e essa é minha estratégia ninja ");

    }
}
