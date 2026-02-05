package Intermediario11;

final public class Anbu {
    //Esta será minha classe final
    //Ela pode gerar objetos, mas não pode ser herdada ou extendida
    //Os atributos e métodos não são final por padrão, ainda preciso colocar final se assim optar

    String codiNome;
    int numeroDeMissoes;

    public void mostrarAnbu(){
        System.out.println("Codinome: " + codiNome);
        System.out.println("Numero de Missões: " + numeroDeMissoes);
    }

}
