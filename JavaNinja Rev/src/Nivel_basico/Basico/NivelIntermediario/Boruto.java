package NivelIntermediario;

//Minha classe está acessando a interface HyugaUzumaki e herdando Uzumaki

public class Boruto extends Uzumaki implements HyugaUzumaki {

    //Aqui é onde vou redeclarar os métodos da interface que criei
    public void AtivarJougan(){
        System.out.println("Jougan Ativado!");

    }

    public void Ativarkarma(){
        System.out.println("Karma ativado!");
    }





}
