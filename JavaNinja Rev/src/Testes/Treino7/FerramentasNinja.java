package Treino7;

public class FerramentasNinja {
    private String nome;
    private String dano;
    private int quantidade;
    FerramentasNinja proximo; //ponteiro da minha lista

    //Meu construtor
    public FerramentasNinja(String nome, String dano, int quantidade){
        this.nome = nome;
        this.dano = dano;
        this.quantidade = quantidade;
    }

    //Meus Getters e Setters
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

    @Override
    public String toString() {
        return "Nome: " + nome + " Dano: " + dano + " Quantidade: " + quantidade;
    }
}
