package Intermediario6;

//Herança múltipla é feita via interfaces

public class Hatake extends Ninja implements Sharingan, Anbu, Hokage{

    public void euSouUmHatake(){
        System.out.println("Eu sou um hatake!");
    }

    //Como os Hatake possui um ninja que também possui sharingan, preciso implementar a interface sharingan
    @Override
    public void sharinganAtivado() {
        System.out.println("Eu sou do clá Hatake e tenho um Sharingan!");
    }

    //Os hatakes possuem ninjas de elite, e para mostrar que são de elite, preciso de outra interface chamada Anbu
    @Override
    public void NinjaDeElite() {
        System.out.println("Eu sou um Hatake e sou um Ninja de Elite!");

    }

    //Os hatakes possuem um ninja que foi Hokage, e para mostrar isso preciso da interface Hokage
    @Override
    public void EuSouUmHokage() {
        System.out.println("Eu sou um Hatake e sou um Hokage!");

    }
}
