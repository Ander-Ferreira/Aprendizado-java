package Treino2;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    RankNinja rank;

    //Meu construtor
    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }


    //Minha sobrecarga de construtor para inserir os dois novos atributos que surgiram, o numeroDeMissoes e o RankNinja
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, RankNinja rank){
        this(nome, aldeia, idade); //Aqui referenciei o que instanciei no meu construtor Ninja

        //Aqui vem os novos atributos que quero adicionar
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;



    }


    //Meu método para mostrar dados do Ninja
    public void mostrarDados(){
        System.out.println("O nome do Ninja é: " + nome);
        System.out.println("A aldeia do Ninja é: " + aldeia);
        System.out.println("A idade do Ninja é: " + idade);
        System.out.println("Meu rank Ninja é: " + rank);

    }
}
