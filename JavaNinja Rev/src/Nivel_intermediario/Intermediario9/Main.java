package Intermediario9;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula, entender referencia de memória e a como a fazer um @Override do toString() para printar o conteúdo de uma referência de memória

        //Se eu fosse printar normalmente sem sobrescrever o método toString(), só seria printado a referência da memória
        //Mas como já sobrescrevi o método toString() de forma que printe o conteúdo de dentro da referência, os valores irão aparecer normalmente

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 15);
        System.out.println(sasuke);

    }
}
