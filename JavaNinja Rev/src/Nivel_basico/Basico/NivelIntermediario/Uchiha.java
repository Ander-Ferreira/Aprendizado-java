package NivelIntermediario;

//Minha classe Uzumaki está herdando os atributos da classe mãe Ninja

//Edit: minha classe agora tem uma interface de MovimentosNinjas com ataques ninjas
public class Uchiha extends Ninja implements MovimentosNinjas{

    public void AtivarSharingan(){

        System.out.println("Sharingan ativado! " + "Eu sou um ninja, meu nome é " + nome);

    }

    //Métodos da minha interface de MovimentosNinjas
        @Override
        public void ataqueNinja() {
            System.out.println("Chidori!");
        }

        @Override
        public void ninjutsu() {
            System.out.println("Susanoo");
        }
}
