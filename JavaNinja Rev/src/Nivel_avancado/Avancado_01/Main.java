package Nivel_avancado.Avancado_01;

public class Main {
    //Objetivo da aula:  aprender contexto estático e não estático
    //Tudo que possuir um contexto estático não precisa de um objeto para ser iniciado

    //Se está fora do contexto estático, será preciso gerar um objeto para acessar os dados
    int variavelGlobalForaDoContextoEstatico = 17;

    //Há a possibilidade de converter a variável global em estática para que não haja a necessidade de instanciar um objeto para acessá-la
    static int variavelGlobalEstatica = 18;


    //public static void main permite que chamemos os métodos da classe main sem precisar instanciar um objeto desta classe.
    public static void main(String[] args) {

        //Invocando uma variável fora do contexto estático
        Main invocandoVariavelGlobal = new Main();
        System.out.println(invocandoVariavelGlobal.variavelGlobalForaDoContextoEstatico);

        //Inovanco uma variável global estática
        System.out.println(variavelGlobalEstatica);

        //Invocando uma função estática sem precisar de um objeto
        ClasseEstatica.funcaoEstatica();

        //Usando uma função estática para fazer um contador de objetos de uma classe
        ClasseEstatica obj1 = new ClasseEstatica();
        ClasseEstatica obj2 = new ClasseEstatica();
        System.out.println("Total de objetos criados: " + ClasseEstatica.getContador());






    }
}
