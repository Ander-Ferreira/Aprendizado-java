package Treino6;

public abstract class Ninja {
    private String nome;
    private String tecnica;
    private int idade;

    //Construtores
    public Ninja(){

    }

    public Ninja(String nome, String tecnica, int idade){
        this.nome = nome;
        this.tecnica = tecnica;
        this.idade = idade;

    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getTecnica(){
        return tecnica;
    }
    public void setTecnica(String tecnica){
        this.tecnica = tecnica;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | " + "Técnica: " + tecnica + " | " + "Idade: " + idade + " | ";
    }
}
