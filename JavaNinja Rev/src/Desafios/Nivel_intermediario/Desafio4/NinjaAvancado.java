package Desafios.Nivel_intermediario.Desafio4;

public class NinjaAvancado extends NinjaBasico{
    //        3. Crie uma classe chamada NinjaAvançado que
//        também implementa a interface Ninja. Além dos
//        atributos nome, idade e habilidade, esta classe
//        deve ter um atributo adicional chamado
//        especialidade (uma habilidade especial do ninja).
//        4. Mostre as informações e execute as habilidades
//        de cada ninja usando os métodos que você
//        implementou.

    String especialidade;

    //Meus construtores
    public NinjaAvancado(){

    }

    public NinjaAvancado(String nome, TipoHabilidade habilidade, int idade, String especialidade){
        super(nome, habilidade, idade);
        this.especialidade = especialidade;
    }

//    @Override
//    public String mostrarInformacoes() {
//        super.mostrarInformacoes();
//        return "Especialidade: " + especialidade;
//    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + ", " + "Habilidade: " + getHabilidade() + ", " + "Idade: " + getIdade() + ", " + "Especialidade: " + especialidade;
    }
}
