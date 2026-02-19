package Desafios.Desafios_Aleatorios.Desafio6;

public abstract class Produto implements Calcular {
    private String nome;
    private double preco;
    private int quantidade;

    //Meus construtores
    public Produto(){

    }
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    //Meus getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return  preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    //Minha função para calcular


    @Override
    public double calcularTotal() {
        double valorTotal = preco * quantidade;
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }


}
