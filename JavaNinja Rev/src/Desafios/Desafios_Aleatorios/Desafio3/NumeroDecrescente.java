package Desafios.Desafios_Aleatorios.Desafio3;

public class NumeroDecrescente {

    //Método
    int valor;

    public void numeroDecrescente(int valor){

        this.valor = valor;
        while(valor > 0){
          valor =  valor -= 1;
            System.out.println("Valor: " + valor);
        }


    }
}
