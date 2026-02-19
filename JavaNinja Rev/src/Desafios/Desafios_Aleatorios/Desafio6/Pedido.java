package Desafios.Desafios_Aleatorios.Desafio6;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido{
    LocalDate data;
    ArrayList<Produto> listaDePedidos;
    double total;

    //Meu Construtor
    public Pedido(){
        this.listaDePedidos = new ArrayList<>();

    }

    //Meu setter
    public void setListaDePedidos(ArrayList<Produto> novosPedidos){
        this.listaDePedidos = novosPedidos;

    }

    //Minha função para adicionar produto
    public void adicionarProduto(Produto produto){
        listaDePedidos.add(produto);


    }


    //Minha função para calcular o total
    public double calcularValorTotalPedidos(){

        total = 0;

        for(Produto produto : listaDePedidos){
            total += produto.calcularTotal();
        }
        return total;

    }




    //Listar Produtos
    public void listarProdutos(){
        for(int i = 0; i < listaDePedidos.size(); i++){
            System.out.println(listaDePedidos.get(i));

        }
    }




}
