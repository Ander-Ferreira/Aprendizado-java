package Desafios.Desafios_Aleatorios.Desafio7;

public abstract class ContaBancaria implements Conta {
 //        2. Crie uma classe abstrata chamada
//        ContaBancaria que implementa a interface
//        Conta.

   private String nome;
   static int contador = 0;
   private int id = 0;
   private double saldo;


    //Meus construtores
   public ContaBancaria(){

   }

    public ContaBancaria(String nome){
            this.nome = nome;
            contador++;
            this.id = contador;
        System.out.println("O número da sua conta é: " + getId());
    }

    //Meus getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getId(){
        return id;
    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public double depositar(double valor) {
        saldo = 0;
        this.saldo += valor;
        return saldo;
    }

    @Override
    public double sacar(double valor) {
        if(saldo < valor){
            System.out.println("Saldo insuficiente!");
        }

        this.saldo -= valor;

        return saldo;

    }

   //Minha função de consutar saldo
    @Override
    public void consultarSaldo() {
        System.out.println("Nome: " + getNome() + ", " + "Número da conta: " + getId() + ", " + "Saldo:" + getSaldo() );
    }
}
