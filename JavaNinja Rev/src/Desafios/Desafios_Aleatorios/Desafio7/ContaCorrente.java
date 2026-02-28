package Desafios.Desafios_Aleatorios.Desafio7;

public class ContaCorrente extends ContaBancaria{
//        6. Implemente o método depositar(double valor)
//        para adicionar o valor ao saldo com uma pequena
//        taxa de depósito (por exemplo, deduzir 1% do
//            valor depositado).


    private double juros = 10;
    private TipoConta tipoConta;

    //Meus construtores
    public ContaCorrente(){

    }
    public ContaCorrente(String nome){
          super(nome);
          this.tipoConta = TipoConta.CORRENTE;
    }


   //Minha função de depositar com juros de 10%
    @Override
    public double depositar(double valor) {
        this.juros = (juros * valor) / 100;
        double valorFinal = valor - juros;

        return super.depositar(valorFinal);

    }

   //Meu getter
    public TipoConta getTipoConta() {
        return tipoConta;
    }

    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
        System.out.println("Tipo da Conta: " + getTipoConta());
    }
}
