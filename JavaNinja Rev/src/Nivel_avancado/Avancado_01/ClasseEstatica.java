package Nivel_avancado.Avancado_01;

public class ClasseEstatica {
    //Quando há elementos estáticos em uma classe, não preciso criar um objeto a partir dela para chamar suas funções

    public static void funcaoEstatica(){
        System.out.println("Mostrando uma função estática");
    }

    //Meu construtor
   static int contador = 0;

    public ClasseEstatica() {
        contador++;
    }

    //Função estática para contar objetos
    public static int getContador(){
        return contador;
    }


}
