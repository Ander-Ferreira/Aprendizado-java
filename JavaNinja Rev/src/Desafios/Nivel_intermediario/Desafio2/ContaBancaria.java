package Desafio2;

public abstract class ContaBancaria implements Conta{

    double valor;
    double saldo;
    String nome;

    //meus construtores
    public ContaBancaria(){

    }

    public ContaBancaria(String nome){
         this.nome = nome;
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
        System.out.println("Nome: " + nome + "Saldo: " + saldo);


    }
}
