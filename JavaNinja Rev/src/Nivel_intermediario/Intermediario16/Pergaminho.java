package Intermediario16;

public class Pergaminho {
    String nome;

    //Construtores
    public Pergaminho(){

    }

    public Pergaminho(String nome){
        this.nome = nome;
    }

    //Meus Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }


}
