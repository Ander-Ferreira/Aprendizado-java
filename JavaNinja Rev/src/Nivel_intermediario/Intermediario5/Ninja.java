package Intermediario5;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Meu construtor vazio
    public Ninja(){

    }

    //Meu construtor com parâmetros
    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;

    }

    //Método para mostrar dados
    public void mostrarDados(){
        System.out.println("Nome do ninja: " + nome);
        System.out.println("Aldeia do ninja: " + aldeia);
        System.out.println("Idade do ninja: " + idade);
    }


}
