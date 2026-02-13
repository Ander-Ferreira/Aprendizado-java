package Desafios.Desafios_Aleatorios.Desafio1;

public class Divisao extends Operacoes {

    public void divisao(int valor1 , int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

        if(this.valor2 != 0){
            double resultado = this.valor1 / this.valor2;
            System.out.println("Resultado: " + resultado);

        }else{
            System.out.println("Divisão por zero!");
        }

    }

}
