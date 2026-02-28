package Desafios.Desafios_Aleatorios.Desafio7;

public class ContaPoupanca extends ContaBancaria{
 //   5. Crie uma classe chamada ContaPoupanca que
 //        também estende a classe ContaBancaria.

    private TipoConta tipoDaConta;

    //Meus construtores
    public ContaPoupanca(){

    }

    public ContaPoupanca(String nome){
        super(nome);
        this.tipoDaConta = TipoConta.POUPANCA;

    }

    //Meu getter
    public TipoConta getTipoDaConta(){
        return tipoDaConta;
    }


   //Minha função de consulta de saldo
    @Override
    public void consultarSaldo() {
        super.consultarSaldo();
        System.out.println("Tipo da conta: " + getTipoDaConta());
    }

}
