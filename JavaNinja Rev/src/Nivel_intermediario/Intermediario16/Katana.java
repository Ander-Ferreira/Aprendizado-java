package Intermediario16;

public class Katana {
    private String nome;

    //Construtor
    public Katana(){

    }

    public Katana(String nome){
        this.nome = nome;
    }

    //Getters e Setters
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
