package Intermediario16;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Aprender a adicionar diferentes classes em um array genérico

        //Criando meu array
        //Object é uma super classe do java usada para representar diferentes tipos de objetos de Classes
        BolsaGenerica<Object> bolsaDeItens = new BolsaGenerica<>();
        //new Shuriken é o objeto da Classe que quero guardar
        bolsaDeItens.guardarObjeto(new Shuriken("Shuriken de Venenosa"));
        bolsaDeItens.guardarObjeto(new Katana("Katana Assassina"));
        bolsaDeItens.guardarObjeto(new Pergaminho("Pergaminho Explosivo"));
        //Mostrando
        bolsaDeItens.mostrarArray();






    }
    }
