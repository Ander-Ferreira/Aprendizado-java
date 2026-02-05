package Treino6;

public class Main {
    public static void main(String[] args) {
        //Objetivo: Treinar inserção de múltiplos objetos em uma classe generica

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Clone das Sombras", 15);
        System.out.println(naruto);
        naruto.tecnicaEspecial("Rasengan!");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Jutsu Bola de Fogo", 17);
        System.out.println(sasuke);
        sasuke.tecnicaEspecial("Sharingan!");

        Hyuga hinata = new Hyuga("Hinata Hyuga", "Palma Suave", 19);
        System.out.println(hinata);
        hinata.tecnicaEspecial("Byakugan!");

        //Adicionando os Ninjas no array
        VilaDaFolhaGenerica<Object> arrayDaVilaDaFolha = new VilaDaFolhaGenerica<>();
        arrayDaVilaDaFolha.adicionarNinjas(naruto);
        arrayDaVilaDaFolha.adicionarNinjas(sasuke);
        arrayDaVilaDaFolha.adicionarNinjas(hinata);
        System.out.println(arrayDaVilaDaFolha);




    }
}
