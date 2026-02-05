package Treino3;

public abstract class Ninja {
    private String nome;
   private String aldeia;
    private int idade;

    //Construtores
    public Ninja(){

    }

    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Meus getters e setters já que estou trabalhando com atributos privados

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getAldeia(){
        return aldeia;
    }

    public void setAldeia(String aldeia){
        this.aldeia = aldeia;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }


    //Função para mostrar dados
    public void mostrarDados(){
        System.out.println("Nome do Ninja: " + nome);
        System.out.println("Nome do Ninja: " + aldeia);
        System.out.println("Nome do Ninja: " + idade);
    }


}
