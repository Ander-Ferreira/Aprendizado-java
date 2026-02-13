package Desafios.Desafios_Aleatorios.Desafio2;

public class FuncionarioLoja extends Funcionario {
   static int contador = 0;

    //Meus construtores
    public FuncionarioLoja(){

    }
    public FuncionarioLoja(String nome, String cargo, int salario){
        super(nome, cargo, salario);
        contador++;

    }

    //Função de contador


    public static int contadorDeFuncionarios() {
        return  contador ;
    }
    
}
