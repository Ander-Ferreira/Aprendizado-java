package Intermediario2;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuMorto;

    //O construtor não tem nenhum tipo como void, String, int etc...

    //O construtor precisa ter o mesmo nome da classe

    //Construtor vazio (sem argumentos)
    public Hokage(){

    }

    //Construtor com um argumento
    public Hokage(String nome){
        //O nome que instanciei lá em cima na classe será igual ao nome do atributo que será passado
        this.nome = nome;
    }

    //Construtor com todos os argumentos
    public Hokage(String nome, int idade, boolean vivoOuMorto){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuMorto = vivoOuMorto;

    }


}
