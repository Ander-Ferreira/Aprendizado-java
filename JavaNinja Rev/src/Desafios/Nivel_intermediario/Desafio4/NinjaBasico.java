package Desafios.Nivel_intermediario.Desafio4;

public class NinjaBasico implements Ninja {
 //        2. Crie uma classe chamada NinjaBásico que
//        implementa a interface Ninja.



    private String nome;
   private TipoHabilidade habilidade;
   private int idade;

   //Meus construtores
    public NinjaBasico(){

    }

    public NinjaBasico(String nome, TipoHabilidade habilidade, int idade){
        this.nome = nome;
        this.habilidade = habilidade;
        this.idade = idade;
    }

    //Meus getters
    public String getNome() {
        return nome;
    }

    public TipoHabilidade getHabilidade() {
        return habilidade;
    }

    public int getIdade() {
        return idade;
    }




//    @Override
//    public String mostrarInformacoes() {
//        return "Nome: " + nome + ", " + "Habilidade: " + habilidade + ", " + "Idade: " + idade;
//
//    }


    @Override
    public String toString() {
        return "Nome: " + nome + ", " + "Habilidade: " + habilidade + ", " + "Idade: " + idade;
    }

    @Override
    public void executarHabilidade() {

    }
}

