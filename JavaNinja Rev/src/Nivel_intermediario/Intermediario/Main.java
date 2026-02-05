package Intermediario;

public class Main {
    public static void main(String[] args) {
        //Objetivo, Utilizar uma classe criada por mim para criar um objeto

        //Inicio um novo objeto a partir da classe Ninja
//        Ninja naruto = new Ninja();
//
        //Agora preencho os campos do objeto que criei
//        naruto.nome = "Naruto Uzumaki";
//        naruto.aldeia = "Aldeia da Folha";
//        naruto.idade = 16;

        Uzumaki naruto = new Uzumaki();

        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        System.out.println("O nome do ninja 1 é: " + naruto.nome);
        System.out.println("A aldeia do ninja 1 é: " + naruto.aldeia);
        System.out.println("A idade do ninja 1 é: " + naruto.idade);
        System.out.println("Método da classe Uzumaki: ");
        naruto.grandeChackra();

        //Ninja 2 - Construído com a classe Uchiha, filha de Ninja
        System.out.println("Ninja 2 ---------------------");

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Uchiha Sasuke";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 16;

        System.out.println("O nome do ninja 2 é: " + sasuke.nome);
        System.out.println("A aldeia do ninja 2 é: " + sasuke.aldeia);
        System.out.println("A idade do 2 é: " + sasuke.idade);
        System.out.println("Método da classe Uchiha: ");
        sasuke.SharinganAtivado();

        //Ninja 2 - Construído com a classe Uchiha, filha de Ninja
        System.out.println("Ninja 3 -------------------------");

        Haruno sakura = new Haruno();
        sakura.nome = "Sakura Haruno";
        sakura.aldeia = "Aldeia da folha";
        sakura.idade = 17;

        System.out.println("O nome da ninja é: " + sakura.nome);
        System.out.println("A aldeia da ninja é: " + sakura.aldeia);
        System.out.println("A idade da ninja é: " + sakura.idade);
        System.out.println("Método da classe Haruno: ");
        sakura.fatorCura();

        System.out.println("Ninja 3 -------------------------");
        Hyuga hinata = new Hyuga();

        hinata.nome = "Hinata Hyuga";
        hinata.aldeia = "Aldeia da Folha";
        hinata.idade = 16;
        System.out.println("Método da classe Hyuga: ");
        hinata.AtivarByakugan();


        System.out.println("------------------------------------------");
        System.out.println("Brincando com métodos da minha classe Ninja");
        //Chamando os métodos da minha classe Ninja

        //Chamando método void
        sasuke.EuSouUmNinja();

        //Chamando Método que retorna algo - String
        String mostrandoMetodoEuSouHokage = sasuke.EuSouUmHokage();
        System.out.println(mostrandoMetodoEuSouHokage);

        //Chamando Método que retorna algo - String
        int mostrandoIdadeMinima = sasuke.IdadeMinimaParaSerHokage(60);
        System.out.println("Você tem " + sasuke.idade + ", faltam " + mostrandoIdadeMinima + " anos");

        System.out.println("----Ninjas Com Interface");
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Uzumaki";
        boruto.aldeia = "Aldeia da folha";
        boruto.idade = 9;
        System.out.println("O nome da ninja é: " + boruto.nome);
        System.out.println("A aldeia da ninja é: " + boruto.aldeia);
        System.out.println("A idade da ninja é: " + boruto.idade);
        System.out.println("Método da classe/interface Boruto e HyugaUzumaki: ");
        boruto.ativarKarma();
        boruto.mostrarJougan();

        System.out.println("-----------------------------------");

        Sarada sarada = new Sarada();
        sarada.nome = "Sarada Uchiha";
        sarada.aldeia = "Aldeia da folha";
        sarada.idade = 9;
        System.out.println("O nome da ninja é: " + sarada.nome);
        System.out.println("A aldeia da ninja é: " + sarada.aldeia);
        System.out.println("A idade da ninja é: " + sarada.idade);
        System.out.println("Método da classe/interface Sarada e UchihaHaruno: ");
        sarada.sharinganDaCura();
        sarada.copiaForca();












    }
}
