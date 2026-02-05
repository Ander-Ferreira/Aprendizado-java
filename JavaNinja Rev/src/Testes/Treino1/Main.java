package Treino1;

public class Main {
    public static void main(String[] args) {

        //Objetivo: Criar uma classe para ninjas com nome, idade, e ataque padrão
        //Criar clãs ninjas tendo os mesmos aspectos que os ninjas, e tendo um ataque especial

        //Ninja básico

        Ninja Nagato = new Ninja("Nagato Gatato", "Jogar Kunai", 16);
        Nagato.mostrarDados();

        System.out.println("----------Ninja do Clã Uchiha---------");

        //Ninja do Clã Uchiha

        ClaUchiha Sasuke = new ClaUchiha("Sasuke Uchiha", "Jogar Kunai", 15, "Ativar Sharingan");
        Sasuke.mostrarDados();

        System.out.println("----------Ninja do Clã Hyuga---------");

        //Ninja do Clã Hyuga
        ClaHyuga Hinata = new ClaHyuga("Hinata Hyuga", "Taijutsu", 14, "Byakugan");
        Hinata.mostrarDados();

        System.out.println("----------Ninja do Clã Uzumaki---------");

        //Ninja do Clã Uzumaki
        ClaUzumaki Naruto = new ClaUzumaki("Naruto Uzumaki", "Clone das Sombras", 14, "Rasengan");
        Naruto.mostrarDados();








    }
}
