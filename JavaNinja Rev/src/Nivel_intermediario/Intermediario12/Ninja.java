package Intermediario12;

public abstract class Ninja {
    //Agora vou tornar minhas classes private para encapsulá-las, elas não serão mais acessíveis de forma direta
    private String nome;
    private String aldeia;
    private int idade;
    private double altura;

    //Para que eu consiga ter acesso a essas variáveis, precisarei criar o getter de cada uma delas
    public String getNome(){
        return nome;
    }
    public String getAldeia(){
        return aldeia;
    }
    public int getIdade(){
        return idade;
    }
    public double getAltura(){
        return altura;
    }

    /*Agora criarei os setters, que serão usados para atribuir valores a nossas variáveis, já que agora elas não estão mais
    acessíveis diretamente, os métodos dos setters são bastante semelhantes a construtores*/

    public void setNome(String nome){
        this.nome = nome;

    }

    public void setAldeia(String aldeia){
        this.aldeia = aldeia;

    }

    public void setIdade(int idade){
        this.idade = idade;

    }

    public void setAltura(double altura){
        this.altura = altura;

    }

    //Como não vou poder mais acessar as variáveis diretamente, só será possível passar atributos inicialmente por construtores
    public Ninja(){

    }

    public Ninja(String nome, String aldeia, int idade, double altura){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.altura = altura;

    }


}
