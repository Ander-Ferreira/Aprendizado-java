package Desafio2;

public class ContaCorrente extends ContaBancaria{
//    3. Crie uma classe chamada ContaCorrente que
//        estende a classe ContaBancaria.
//        4. Implemente o método depositar(double valor)
//        para adicionar o valor ao saldo.

    int id = 23;
    TipoConta tipoDeConta;

   //Meus construtores
    public ContaCorrente(){

    }

    public ContaCorrente(String nome, TipoConta tipoDeConta){
        super(nome);
        this.tipoDeConta = tipoDeConta;
        this.id = id++;
    }

    //Meus getter de id
    public int getId() {
        return id;
    }

    //Meu método para  depositar valor
    @Override
    public void depositarValor(double valor) {
        super.depositarValor(valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Nome: " + nome + "Saldo: " + saldo + "Conta: " + tipoDeConta + "Numero da conta: " + id);
    }



}
