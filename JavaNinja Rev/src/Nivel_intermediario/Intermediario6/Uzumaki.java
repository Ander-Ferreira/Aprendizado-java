package Intermediario6;

public class Uzumaki extends Ninja implements Hokage{

    public void EuSouUmUzumaki(){
        System.out.println("Eu sou um Uzumaki!");

    }

    //Como os Uzumakis já foram hokages, vou precisar implementar a interface hokage
    @Override
    public void EuSouUmHokage() {
        System.out.println("Eu sou do clã Uzumaki e sou um Hokage!");

    }
}
