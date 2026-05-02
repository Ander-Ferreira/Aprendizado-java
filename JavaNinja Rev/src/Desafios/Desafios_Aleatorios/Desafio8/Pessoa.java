package CadastroDePessoas;

public class Pessoa {
    private String nome;
    private String pais;
    private int idade;

    public Pessoa(){

    }
    public Pessoa(String nome, String pais, int idade){
        this.nome = nome;
        this.pais = pais;
        this.idade = idade;

    }

    //Meus getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getPais(){
        return pais;
    }
    public void setPais(String pais){
        this.pais = pais;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " País: " + pais + " Idade: "  + idade;
    }
}
