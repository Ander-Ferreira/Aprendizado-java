package Desafios.Desafios_Aleatorios.Desafio1;

public class Soma extends Operacoes{
    public Soma(){

    }

    public void soma(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
        double resultado = this.valor1 + this.valor2;
        System.out.println("Resultado: " + resultado);
    }
}
