package Treino1;

public class ClaHyuga extends Ninja {
    String ataqueEspecial;
    //Meu constructor
    public ClaHyuga(String nome, String ataquePadrao, int idade, String ataqueEspecial){
        super(nome, ataquePadrao, idade);
        this.ataqueEspecial = ataqueEspecial;


    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Ataque especial: " + ataqueEspecial);
    }
}
