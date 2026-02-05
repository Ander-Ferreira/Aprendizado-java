package Condicoes;

public class lacosDeRepeticao {
    public static void main(String[] args) {

        System.out.println("Clones do Naruto: ");
        int numeroAtualDeClones = 0;
        int numeroMaximoDeClones = 40;

        while(numeroAtualDeClones <= numeroMaximoDeClones){
            numeroAtualDeClones++;
            System.out.println("O naruto se clonou!" + numeroAtualDeClones);

        }

        System.out.println("--------------------------------------------------------------");
        System.out.println("Salário e Horas Trabalhadas:");

        int ganhoHora = 0;
        int valorFixo = 100;
        int ganhoMensalMaximo = 3500;
        int horaTrabalhada = 1;

        while(ganhoHora <= ganhoMensalMaximo){
            ganhoHora += valorFixo;
            horaTrabalhada++;
            System.out.println("O ganho atual é de: " + ganhoHora + ", foram trabalhadas: " + horaTrabalhada + " horas");

        }

        System.out.println("--------------------------------------------------------------");

        System.out.println("Fazendo Amburguers para a festa: ");

        int numeroMaximoDeAmburguers = 45;

        for(int i = 0; i < numeroMaximoDeAmburguers; i++){
                String frase = (i <= 1)? "Já tenho " + i + " amburguer!": "Já tenho " + i + " amburguers!";
                System.out.println(frase);


        }


    }
}
