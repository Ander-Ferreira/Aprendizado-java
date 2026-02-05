package Intermediario8;

public class Ninja implements EstrategiasNinjas{
    String nome;
    String aldeia;
    int idade;

    public Ninja(String nome, String aldeia, int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Meus métodos da minha interface

    //Método comum
    @Override
    public void estrategiaDeInteligencia() {
        System.out.println("Eu sou um ninja e essa é a minha estratégia de inteligência");

    }

    //Método sobrecarga, este método é semelhante ao anterior, mas fará algo a mais, são os mesmos métodos, mas com parâmetros diferentes
    @Override
    public void estrategiaDeInteligencia(int qi) {
        //Condiçãozinha para brincar com o valor do parâmetro e voltar algo diferente
        if(qi > 180){
            System.out.println("Você é um ninja gênio!");

        } else if (qi >= 130) {
            System.out.println("Você é um ninja prodígio!");

        }else{
            System.out.println("Você precisa treinar mais suas habilidades!");

        }

    }

    //Método para mostrar os dados dos ninjas
    public void mostrarDados(){
        System.out.println("O nome do ninja é: " + nome);
        System.out.println("A aldeia do ninja é: " + aldeia);
        System.out.println("A idade do ninja é: " + idade);

    }


}
