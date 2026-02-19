package Desafios.Desafios_Aleatorios.Desafio6;

public class ProdutoDigital extends Produto{
    double tamanhoMb;

    //Meu construtor
    public ProdutoDigital(String nome, double preco, int quantidade, double tamanhoMb){
        super(nome, preco, quantidade);
        this.tamanhoMb = tamanhoMb;
    }

    //Meu getter e setter
    public double getTamanhoMb(){
        return tamanhoMb;
    }
    public void setTamanhoMb(double tamanhoMb){
        this.tamanhoMb = tamanhoMb;
    }

    //Minha função para calcular
    @Override
    public double calcularTotal() {
        double total = getPreco() * getQuantidade();
        double totalDesconto = total * 0.95;
        return totalDesconto;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", quantidade=" + getQuantidade() +
                "tamanhoMb=" + tamanhoMb +
                '}';
    }
}
