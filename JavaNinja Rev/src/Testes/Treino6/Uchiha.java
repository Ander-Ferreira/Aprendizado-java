package Treino6;

public class Uchiha extends Ninja implements TecnicaEspecial{
    String especial;

    //Meu construtor
    public Uchiha(String nome, String tecnica, int idade){
        super(nome, tecnica, idade);
    }

    //Minha função da interface de tecnicaEspecial
    @Override
    public void tecnicaEspecial(String especial) {
        this.especial = especial;
        System.out.println("Técnica Especial: " + especial);
    }


}
