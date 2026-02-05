package Treino6;

public class Uzumaki extends Ninja implements TecnicaEspecial{

    String especial;

    //Meus construtores
    public Uzumaki(String nome, String tecnica, int idade){
        super(nome, tecnica, idade);

    }

    //Minha função da interface de tecnicaEspecial
    @Override
    public void tecnicaEspecial(String especial) {
            this.especial = especial;
            System.out.println("Técnica Especial: " + especial);
    }


}
