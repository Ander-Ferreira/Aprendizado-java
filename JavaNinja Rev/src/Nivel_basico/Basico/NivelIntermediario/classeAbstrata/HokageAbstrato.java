package NivelIntermediario.classeAbstrata;

//Classe abstrata é uma forma de padronizazar uma classe
//Classe abstrata servirá para ser herdada em outras classes
//Classe abstrata não pode ser instanciada

public abstract class HokageAbstrato {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    double altura;

    //Método abstrato, métodos abstratos não possuem corpos
    public abstract void sabedoira();

}
