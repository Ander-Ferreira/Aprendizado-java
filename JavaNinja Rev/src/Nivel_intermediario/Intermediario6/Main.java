package Intermediario6;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula, aprender herança múltipla
        //A herança múltipla acontece quando uma classe precisa herdar mais do que uma super classe tem a oferecer
        //Para fazer isso, vou precisar usar as interfaces

        Hatake kakashi = new Hatake();
        kakashi.nome = "Hatake Kakashi";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 15;
        kakashi.mostrarDados();
        kakashi.euSouUmHatake();
        kakashi.sharinganAtivado();
        kakashi.NinjaDeElite();
        kakashi.EuSouUmHokage();

        System.out.println("Ninjas do Clã Uzumaki");
        Uzumaki minato = new Uzumaki();
        minato.nome = "Minato Namikaze";
        minato.aldeia = "Aldeia da Folha";
        minato.idade = 26;
        minato.mostrarDados();
        minato.EuSouUmUzumaki();
        minato.EuSouUmHokage();

        System.out.println("Ninjas do Clã Uchiha");
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 35;
        sasuke.mostrarDados();
        sasuke.EuSouUmUchiha();
        sasuke.NinjaDeElite();
        sasuke.sharinganAtivado();






    }
}
