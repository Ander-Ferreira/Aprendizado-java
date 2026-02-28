package Nivel_avancado.Avancado_04;

public class Ninja {
    String nome;
    String vila;
    int idade;

    //Meus construtores
    public Ninja(){

    }
    public Ninja(String nome, String vila, int idade){
          this.nome = nome;
          this.vila = vila;
          this.idade = idade;
    }

    //Getters e Setters
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
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", vila='" + vila + '\'' +
                ", idade=" + idade +
                '}';
    }



}
