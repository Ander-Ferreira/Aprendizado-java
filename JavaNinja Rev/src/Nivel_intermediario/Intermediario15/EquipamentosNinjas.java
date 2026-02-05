package Intermediario15;

public class EquipamentosNinjas {
    private String nome;

    //Meus construtores
    public EquipamentosNinjas(){

    }

    public EquipamentosNinjas(String nome){
        this.nome = nome;
    }

    //Getters e Setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //Meu método toString para imprimir os valores do meu objeto


    @Override
    public String toString() {
        return nome;
    }
}
