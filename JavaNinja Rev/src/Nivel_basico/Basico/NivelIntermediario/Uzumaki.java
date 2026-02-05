package NivelIntermediario;

//Minha classe Uzumaki está herdando os atributos da classe mãe Ninja

//Edit: minha classe agora tem uma interface de MovimentosNinjas com ataques ninjas
public class Uzumaki extends Ninja implements MovimentosNinjas{

    public void AtivarModoSabio(){

        System.out.println("Modo sábio ativado! " + " Eu sou um ninja, meu nome é " + nome );

    }

    //Métodos da minha interface de MovimentosNinjas
        @Override
        public void ataqueNinja() {

            System.out.println("Rasengan");

        }

        @Override
        public void ninjutsu() {
            System.out.println("Jutsu multiclones das sombras!");
        }
}
