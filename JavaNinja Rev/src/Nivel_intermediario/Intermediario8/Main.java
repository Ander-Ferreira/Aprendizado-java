package Intermediario8;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Sobrecarga de métodos
        //A sobrecarga de métodos acontece quando temos dois métodos com nomes iguais, mas que irão fazer algo semelhante, mas não igual
        //Começarei pela interface, lá terei dois métodos, um sem parâmetro e outro com parâmetro, o que difere os dois métodos são os parâmetros

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 16);
        sasuke.mostrarDados();

        //Método comum
        sasuke.estrategiaDeInteligencia();

        //Método de sobrecarga
        sasuke.estrategiaDeInteligencia(130);


    }
}
