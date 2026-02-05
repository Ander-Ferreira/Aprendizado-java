package NivelIntermediario;

//Minha classe Uzumaki está herdando os atributos da classe mãe Ninja

//Edit: minha classe agora tem uma interface de MovimentosNinjas com ataques ninjas
public class Hyuga extends Ninja implements MovimentosNinjas{

         public void AtivarByakugan(){

            System.out.println("Byakugan ativado! " + "Eu sou uma ninja, meu nome é " + nome);
         }

    //Métodos da minha interface de MovimentosNinjas
        @Override
        public void ataqueNinja() {
            System.out.println("Punhos suaves");
        }

        @Override
        public void ninjutsu() {
            System.out.println("Jutsu do estilo dragão");

        }
}
