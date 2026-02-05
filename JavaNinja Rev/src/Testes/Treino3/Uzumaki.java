package Treino3;

public class Uzumaki extends Ninja{
    Biju biju;

    //Construtores
    public Uzumaki(){

    }

    public Uzumaki(String nome, String aldeia, int idade){
        super(nome, aldeia, idade);

    }

    //Sobrecarga de método para inserir o novo atributo dos Uzumaki
    public Uzumaki(String nome, String aldeia, int idade, Biju biju){
        super(nome, aldeia, idade);
        this.biju = biju;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Biju: " + biju);
    }


}
