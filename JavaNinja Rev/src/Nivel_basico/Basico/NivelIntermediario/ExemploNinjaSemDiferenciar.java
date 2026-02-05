package NivelIntermediario;

public class ExemploNinjaSemDiferenciar {
    public static void main(String[] args) {
        //A classe ninja está iniciando o objeto naruto
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 16;
        Naruto.aldeia = "Aldeia da Folha";

        //Objeto Sasuke
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 17;
        Sasuke.aldeia = "Aldeia da Folha";

        //Objeto Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Aldeia da folha";

        //Objeto Kakashi
        Ninja Kakashi = new Ninja();
        Kakashi.nome = "Kakashi Hatake";
        Kakashi.idade = 25;
        Kakashi.aldeia = "Aldeia da folha";

        //Objeto Tsunade
        Ninja Tsunade = new Ninja();
        Tsunade.nome = "Tsunade";
        Tsunade.idade = 55;
        Tsunade.aldeia = "Aldeia da folha";

        //Objeto Shikamaru
        Ninja Shikamaru = new Ninja();
        Shikamaru.nome = "Shikamaru Nara";
        Shikamaru.idade = 16;
        Shikamaru.aldeia = "Aldeia da folha";

        //Objeto Gaara
        Ninja Gaara = new Ninja();
        Gaara.nome = "Gaara da Areia";
        Gaara.idade = 15;
        Gaara.aldeia = "Aldeia da areia";
        System.out.println(Gaara.nome);

        //Usando métodos criados na classe ninja

        //Método void
//        Sasuke.SharinganAtivado(); //Método void não pode ser colocado dentro de uma variável

        //Métodos que retornam algo
        String souNinja = Naruto.souUmNinja();  //A variável precisa ser do mesmo tipo daquilo que o método retorna
        System.out.println(souNinja);

        int quantoFaltaParaSerHokage = Sasuke.idadeParaSerHokage(50);
        System.out.println("Falta: " + quantoFaltaParaSerHokage + " anos" + " para você se tornar hokage");


    }
}
