package NivelIntermediario.Construtores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender sobre construtores
            Hokage Tobirama = new Hokage("Tobirama", 38, false); //Aqui dentro passo todos os argumentos da minha classe Hokage
            System.out.println("Nome do Hokage: " + Tobirama.nome);
            System.out.println("Idade do Hokage: " + Tobirama.idade);
            System.out.println("Está vivou ou morto? " + Tobirama.vivoOuMorto);

      //Ninjas
            Ninjas Kakashi = new Ninjas("Kakashi Hatake", 25, true, "Jounin");
            System.out.println("Ninjas-----");
            System.out.println("Nome do Ninja: " + Kakashi.nome);
            System.out.println("Idade do Ninja: " + Kakashi.idade);
            System.out.println("Está Vivo ou Morto? " + Kakashi.vivoOuMorto);
            System.out.println("Patente: " + Kakashi.patente);

     //Criando um ninja
            System.out.println("Crie seu ninja----");
            Scanner digitar = new Scanner(System.in);
            Scanner digitarPatente = new Scanner(System.in);
            System.out.println("Digite o nome do Ninja: ");
            String guardarNome = digitar.nextLine();
            System.out.println("Digite a idade do Ninja: ");
            int guardarNumero = digitar.nextInt();
            System.out.println("Verdadeiro ou Falso: ");
            boolean guardarTrueFalse = digitar.hasNextBoolean();
            System.out.println("Digite a patente: ");
            String guardarPatente = digitarPatente.nextLine();

            Ninjas Usuario = new Ninjas(guardarNome, guardarNumero, guardarTrueFalse, guardarPatente);
            System.out.println("O nome do seu ninja é: " + Usuario.nome);
            System.out.println("A idade do seu ninja é: " + Usuario.idade);
            System.out.println("Seu ninja está morto? " + Usuario.vivoOuMorto);
            System.out.println("A patente do seu usuário é " + Usuario.patente);




    }
}
