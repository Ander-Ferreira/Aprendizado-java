package Treino4;

public class FerramentasNinjas {
    private String nome;
    private String dano;
    private int quantidade;

    //Meus construtores
    public FerramentasNinjas(){

    }

    public FerramentasNinjas(String nome, String dano, int quantidade){
        this.nome = nome;
        this.dano = dano;
        this.quantidade = quantidade;

    }

    //Getters e Setters
    public String getNome(){
        return nome;

    }

    public void setNome(String nome){
        this.nome = nome;

    }

    public String getDano(){
        return dano;
    }

    public void setDano(String dano){
        this.dano = dano;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    //Meu método para exibir os dados da ferramenta


    @Override
    public String toString() {
        return "Nome da ferramenta: " + nome + " " + "Dano da ferramenta: " + " " + dano + " " + "Quantidade da ferramenta: " + quantidade;
    }


}
