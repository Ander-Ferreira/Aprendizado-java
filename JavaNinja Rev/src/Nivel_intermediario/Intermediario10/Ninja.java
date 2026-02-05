package Intermediario10;

public abstract class Ninja implements mostrarAtributos{
    String nome;
    String aldeia;
    int idade;
    //Atributo final - preciso já passar o valor, pois depois dissso não poderá ser alterado
    final double altura = 1.83;

    //Método final - não pode ser sobrescrito depois com @Override em uma subclasse
    final void tacarKunai(){
        System.out.println("O ninja tacou uma Kunai");



    }


    @Override
    public void mostrar() {
        System.out.println("O nome do Ninja é: " + nome);
        System.out.println("O nome da Aldeia é: " + aldeia);
        System.out.println("A idade do Ninja é: " + idade);
        System.out.println("A altura do Ninja é: " + altura);
    }
}
