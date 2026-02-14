package Nivel_avancado.Avancado_03;

public class Ninja {
    String nome;
    int idade;


    public Ninja(){

    }

    public Ninja(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
