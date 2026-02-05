package Intermediario7;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    Rank rankNinja;

    //Meu construtor
    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade  = idade;

    }

    //Fazendo um overload para inserir os novos atributos de rank e missão
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, Rank rankNinja){
        this(nome, aldeia, idade); //Aqui já pego tudo que foi referenciado anteriormente
       //Novos atributos a serem inseridos
        this.numeroDeMissoes = numeroDeMissoes;
        this.rankNinja = rankNinja;


    }

    //Função para mostrar Dados
    public void mostrarDados(){
        System.out.println("O nome do Ninja é: " + nome);
        System.out.println("A aldeia do Ninja é: " + aldeia);
        System.out.println("A aldeia do Ninja é: " + idade);
        System.out.println("O número de missões do Ninja é: " + numeroDeMissoes);
        System.out.println("O rank do Ninja é: " + rankNinja);

    }


}
