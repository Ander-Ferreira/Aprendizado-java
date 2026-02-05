package NivelIntermediario;

public class Main {
      public static void main(String[] args) {

        //Objetivo da aula: Treina herança
        //Criando Objetos com atributos únicos baseados em classes filhas
        //Edit: Adicionei ataques padrões da interface MovimentosNinjas

        //Classe Uzumaki
           Uzumaki Naruto = new Uzumaki();
           Naruto.nome = "Naruto Uzumaki";
           Naruto.idade = 16;
           Naruto.aldeia = "Aldeia da folha";
           Naruto.AtivarModoSabio(); //Atributo único
           Naruto.ataqueNinja(); //Ataque padrão
           Naruto.ninjutsu(); //Ataque padrão

      //Classe Uchiha
          Uchiha Sasuke = new Uchiha();
          Sasuke.nome = "Sasuke Uchiha";
          Sasuke.idade = 17;
          Sasuke.aldeia = "Aldeia da folha";
          Sasuke.AtivarSharingan(); //Atributo único
          Sasuke.ataqueNinja(); //Ataque padrão
          Sasuke.ninjutsu(); //Ataque padrão

      //Classe Haruno
          Haruno Sakura = new Haruno();
          Sakura.nome = "Sakura Haruno";
          Sakura.idade = 16;
          Sakura.aldeia = "Aldeia da folha";
          Sakura.superCura(); //Atributo único
          Sakura.ataqueNinja(); //Ataque padrão
          Sakura.ninjutsu(); //Ataque padrão

      //Classe Hyuga
          Hyuga Hinata = new Hyuga();
          Hinata.nome = "Hinata Hyuga";
          Hinata.idade = 16;
          Hinata.aldeia = "Aldeia da folha";
          Hinata.AtivarByakugan(); //Atributo único
          Hinata.ataqueNinja(); //Ataque padrão
          Hinata.ninjutsu(); //Ataque padrão

      //Classe Boruto
          Boruto Boruto = new Boruto();
          Boruto.nome = "Uzumaki Boruto";
          Boruto.idade = 12;
          Boruto.aldeia = "Aldeia da folha";
          Boruto.AtivarModoSabio();
          Boruto.AtivarJougan();
          Boruto.Ativarkarma();
          Boruto.ataqueNinja(); //Ataque padrão
          Boruto.ninjutsu(); //Ataque padrão






    }

}
