package NivelIntermediario;

//Minha classe Uzumaki está herdando os atributos da classe mãe Ninja

//Edit: minha classe agora tem uma interface de MovimentosNinjas com ataques ninjas

public class Haruno extends Ninja implements MovimentosNinjas{

        public void superCura(){

            System.out.println("Super cura ativada! " + "Eu sou uma ninja, meu nome é " + nome);

        }

    //Métodos da minha interface de MovimentosNinjas
        @Override
        public void ataqueNinja() {
            System.out.println("Ataque de superforça");

        }

       @Override
       public void ninjutsu() {
           System.out.println("Jutsu de hipnose");

       }
}
