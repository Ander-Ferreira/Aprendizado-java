package Desafios.Nivel_basico.Desafio1;

public abstract class Ninja {
    private String nome;
    private  String missao;
    private int idade;


    //Meus construtores
    public Ninja(){

    }

    public Ninja(String nome, String missao, int idade){
        this.nome = nome;
        this.missao = missao;
        this.idade = idade;

    }

    //Meus Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMissao(){
        return missao;
    }
    public void setMissao(String missao){
        this.missao = missao;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome do Ninja: " + nome + ", " + "Missão do Ninja: " + missao + ", " + "Idade do Ninja: " + idade;
    }
}
