package Desafio3;

public class Ninja {
//        Você foi encarregado de desenvolver um sistema em
//        Java para gerenciar uma lista de ninjas usando a
//        estrutura de dados LinkedList. Cada ninja terá nome,
//        idade e vila. Inicialmente

    private String nome;
    private String vila;
    private int idade;

    //Meus construtores
    public Ninja(){

    }

    public Ninja(String nome, String vila, int idade){
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }



    //Meus getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getVila(){
        return vila;
    }
    public void setVila(String vila){
        this.vila = vila;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " + " Vila: " + vila + ", " + "Idade: " + idade;
    }
}
