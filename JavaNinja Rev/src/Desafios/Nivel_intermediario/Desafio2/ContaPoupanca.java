package Desafio2;

public class ContaPoupanca extends ContaBancaria{
    //        5. Crie uma classe chamada ContaPoupanca que
//        também estende a classe ContaBancaria.
//        6. Implemente o método depositar(double valor)
//        para adicionar o valor ao saldo com uma pequena
//        taxa de depósito (por exemplo, deduzir 1% do
//            valor depositado).
double deducao = 0;
static int contador = 23;
int id = 0;
TipoConta tipoDeConta;

//Meus construtores
public ContaPoupanca(){

}

public ContaPoupanca(String nome, TipoConta tipoDeConta){
    super(nome);
    contador++;
    this.id = contador;
    this.tipoDeConta = tipoDeConta;
}

//Meus getter de id
public int getId() {
        return id;
    }


    //Meu método para  depositar valor
    @Override
    public void depositarValor(double valor) {
        super.depositarValor(valor);
        deducao = (valor * 0.01) / 100;
        saldo = saldo - deducao;

    }

    @Override
    public void consultarSaldo() {
        System.out.println("Nome: " + nome + "Saldo: " + saldo + "Conta: " + tipoDeConta + "Numero da conta: " + id);
    }
}
