package Desafio1;

public abstract class Ninja implements Informacoes {
    //        1. Na classe Ninja, defina os atributos nome
//                (String), idade (int), missao (String),
//                nivelDificuldade (String) e statusMissao (String).
//                Adicione um método chamado
//        mostrarInformacoes() que exibe todos esses
//        atributos.

   private String nome;
   private String missao;
   private String nivelDificuldade;
   private String statusMissao;
   private int idade;

   //Construtores
    public Ninja(){

    }

    public Ninja(String nome, String missao, String nivelDificuldade, String statusMissao, int idade){
        this.nome = nome;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
        this.idade = idade;

    }

    //Meus getters e setters
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

    public String getNivelDificuldade(){
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade){
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getStatusMissao(){
        return statusMissao;
    }
    public void setStatusMissao(String statusMissao){
        this.statusMissao = statusMissao;
    }

   public int getIdade(){
        return idade;
   }
   public void setIdade(int idade){
        this.idade = idade;
   }

   //Meu método para mostrar informações


    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);


    }
}
