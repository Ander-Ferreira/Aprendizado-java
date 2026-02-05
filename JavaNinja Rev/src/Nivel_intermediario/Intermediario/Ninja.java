package Intermediario;

public class Ninja {
    //Criando minha classe ninja
    String nome;
    String aldeia;
    int idade;

    //--------------------Métodos da minha classe Ninja---------------------------

    //Meu método void -  não retorna nada, apenas mostra

    public void EuSouUmNinja(){
        System.out.println("Eu sou um ninja");

    }

    //Método que irá retornar algo - Irá Retornar uma String

    public String EuSouUmHokage(){
        return "Eu sou um Hokage";


    }

    //Método com parâmetro que irá retornar algo - Irá Retornar um Int

    public int IdadeMinimaParaSerHokage(int idadeMinima){
        return idadeMinima - idade;

    }
}
