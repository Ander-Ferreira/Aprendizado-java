package Nivel_avancado.Avancado_04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender o uso de streams para processar dados de coleções de dados

        List<Ninja> listaDeNinjas = new ArrayList<>();
        listaDeNinjas.add(new Ninja("Naruto Uzumaki", "Vila da Folha", 16));
        listaDeNinjas.add(new Ninja("Gaara da Areia", "Vila da Areia", 24));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", "Vila da Folha", 35));
        listaDeNinjas.add(new Ninja("Obito", "Vila da Folha", 15));
        listaDeNinjas.add(new Ninja("Temari", "Vila da Areia", 12));
        listaDeNinjas.add(new Ninja("Shikamaru", "Vila da Folha", 11));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", "Vila da Folha", 17));
        listaDeNinjas.add(new Ninja("Sakura Haruno", "Vila da Folha", 21));

        System.out.println("Vila da Folha----------------");
       //Neste stream estou pesquisando Ninjas que são somente da vila da folha
        listaDeNinjas.stream()
                .filter(ninja -> ninja.getVila().equals("Vila da Folha") )
                .forEach(System.out::println);

        System.out.println("Idades---------------------");
        //Neste stream estou ordenando a idade em ordem natural com o sorted
        listaDeNinjas.stream()
                .sorted((idade1, idade2) -> Integer.compare(idade1.getIdade(), idade2.getIdade()))
                .forEach(System.out::println);

        System.out.println("Nomes-----------------------");
        //Neste stream estou comparando e ordenando os nomes de forma em que a capitalização não interfiraa
        listaDeNinjas.stream()
                .sorted((nome1, nome2) -> String.CASE_INSENSITIVE_ORDER.compare(nome1.getNome(), nome2.getNome()))
                .forEach(System.out::println);



    }
}
