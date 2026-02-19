package Desafios.Desafios_Aleatorios.Desafio6;

public class ProdutoFisico extends Produto{
    double peso;

    //Meu construtor
    public ProdutoFisico(String nome, double preco, int quantidade, double peso){
        super(nome, preco, quantidade);
        this.peso = peso;
    }

    //Meu getter e setter
    public double getPeso(){
        return  peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    @Override
    public double calcularTotal() {
        if(peso > 10){
           double total = getPreco() * getQuantidade();
           double totalAdicional = (total / 10) + total;
            return totalAdicional;
        }

        return super.calcularTotal();

    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidade=" + getQuantidade() +
                "peso=" + peso +
                '}';
    }





}
