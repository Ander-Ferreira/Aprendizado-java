package Intermediario9;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;

    }

    //Agora aqui farei o @Override do método toString(), que normalmente só exibirá a referência de memória do nosso objeto
    //Então agora irei especificar o que ele irá printar para mim caso tenha só o nome do objeto do sout

    @Override
    public String toString() {
        return "Nome: " + nome + " Aldeia: " + aldeia + " Idade: " + idade;
    }
}
