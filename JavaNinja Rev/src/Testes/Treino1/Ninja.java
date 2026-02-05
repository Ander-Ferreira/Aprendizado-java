package Treino1;

public class Ninja implements FuncoesNinja{
    String nome;
    String ataquePadrao;
    int idade;

    //Meu constructor
    public Ninja(String nome, String ataquePadrao, int idade){
        this.nome = nome;
        this.ataquePadrao = ataquePadrao;
        this.idade = idade;


    }


    //Minhas funções da interface
    @Override
    public void mostrarDados() {
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Ataque Padrão:  " + ataquePadrao);
        System.out.println("Idade:  " + idade);

    }


}
