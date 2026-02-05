package Treino2;


public class Uchiha extends Ninja implements Sharingan {

    //Meu construtor
    public Uchiha(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);

    }

    //Minha interface
    @Override
    public void ativarSharinga() {
        System.out.println("Sharingan ativado!");
    }

    //Minha sobrecarga de construtor para inserir os dois novos atributos que surgiram, o numeroDeMissoes e o RankNinja
    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, RankNinja rank){
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    //Método mostrar dados
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Eu sou um uchiha!");
    }
}
