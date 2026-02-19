package Desafios.Desafios_Aleatorios.Desafio6;

public class Main {
    public static void main(String[] args) {

        /*
       Sistema de gerenciamento de pedidos.

          O sistema deve permitir a criação de diferentes tipos de produtos
         (físicos e digitais), onde cada tipo pode ter regras próprias
         para cálculo do valor total.

        Um pedido deve armazenar uma lista de produtos e ser capaz
        de calcular o valor total somando o total individual de cada produto.

       O objetivo é aplicar conceitos de:
        - Herança
       - Polimorfismo
       - Classe abstrata
      - Coleções (ArrayList)
      - Sobrescrita de métodos
*/

        //Aidicionando produto a minha lista
        Pedido meuCarrinho = new Pedido();
        meuCarrinho.adicionarProduto(new ProdutoDigital("Placa de Vídeo RTX 5090", 20000, 2, 36000));
        meuCarrinho.adicionarProduto(new ProdutoFisico("Mesa", 900, 2, 11));
        meuCarrinho.listarProdutos();
        System.out.println("Total a pagar: " + meuCarrinho.calcularValorTotalPedidos());


    }
}
