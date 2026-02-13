package Desafios.Desafios_Aleatorios.Desafio2;

public abstract class Funcionario {
    private String nome;
    private String cargo;
    private int salario;

    //Meus construtores
    public Funcionario(){

    }

    public Funcionario(String nome, String cargo, int salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    //Meus getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }


    public int getSalario(){
        return salario;
    }
    public void setSalario(int salario){
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", " + "Cargo: " +  cargo + ", " + "Salário: " + salario;
    }
}
