package Treino3;


public class Main {
    public static void main(String[] args) {
        //1 - Crie uma classe Ninja com dados básicos do ninja
        //2 - Crie clãs ninjas e técnicas especiais
        //3 - Insira novos atributos em classes já existentes, como números de missões e bijus se aplicável ao clã

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 16, Biju.KYUUBI);
        naruto.mostrarDados();
        System.out.println("------ Alterando atributos com meu Setter -------");
        naruto.setNome("Uzumaki Naruto");
        naruto.mostrarDados();

        System.out.println("----------Clã Uchiha---------------------");
        Uchiha sasuke = new Uchiha("Sasuke", "Aldeia da Folha", 20);
        sasuke.mostrarDados();
        sasuke.ativarSharingan();
        System.out.println("------ Alterando atributos com meu Setter -------");
        sasuke.setNome("Sasuke Uchiha");
        sasuke.mostrarDados();



    }
}
