package Intermediario13;

public class Missoes {
    private String nome;
    private RankDeMissao rank;

    //Meus construtores
    public Missoes(){

    }

    public Missoes(String nome, RankDeMissao rank){
        this.nome = nome;
        this.rank = rank;
    }

    //Meus getters e setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public RankDeMissao getRank(){
        return rank;
    }

    public void setRank(RankDeMissao rank){
        this.rank = rank;
    }

    //Usando nosso ENUM
    public void exibiDetalhes(){
        System.out.println("Nome da missão: " + nome + ", Rank da missão: " + rank);

    }


}
