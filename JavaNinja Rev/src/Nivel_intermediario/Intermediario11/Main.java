package Intermediario11;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: aprender classe final
        //Classes final não podem ser extendidas ou herdadas, mas ao contrário das classes abstratas podemos gerar objetos a partir dela

        Anbu kakashi = new Anbu();
        kakashi.codiNome = "Kakashi Hatake";
        kakashi.numeroDeMissoes = 205;
        kakashi.mostrarAnbu();


    }
}
