package Desafio2;

public abstract class ContaBancaria implements Conta{

    double valor;
    double saldo;

    //meus construtores
    public ContaBancaria(){

    }



    //Meu método para  depositar valor
    @Override
    public void depositarValor(double valor) {
        saldo = this.saldo += valor;

    }

    //Meu método para sacar


    @Override
    public void sacar(double valor) {
        saldo = saldo -= valor;
    }

    //Meu método para consultar saldo
    @Override
    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);


    }
}
