package Intermediario6;

public class Uchiha extends Ninja implements Sharingan, Anbu{


    public void EuSouUmUchiha(){
        System.out.println("Eu sou um uchiha!");
    }

    //Aqui tirarei a responsabilidade de um Uchiha de portar o sharingan
    //Porque há personagens que não são uchihas, mas possuem sharingan
    //Colocarei esta respoonsabilidade em uma interface

    //Método da minha interface
    @Override
    public void sharinganAtivado() {
        System.out.println("Eu sou do clã Uchiha e tenho um sharingan!");

    }

    //Como há ninjas uchihas que foram da anbu, preciso implementar a interface da anbu
    @Override
    public void NinjaDeElite() {
        System.out.println("Eu sou um Uchiha e sou um Ninja de Elite!");

    }
}
