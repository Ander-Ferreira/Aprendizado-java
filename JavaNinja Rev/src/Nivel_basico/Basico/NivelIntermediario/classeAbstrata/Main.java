package NivelIntermediario.classeAbstrata;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: aprender classe abstrata e métodos abstratos

        //Utilização da classe Senju já herdando a classe HokageAbstrata e seu método abstrato

        Senju Tobirama = new Senju();
        Tobirama.nome = "Senju Tobirama";
        Tobirama.idade = 43;
        Tobirama.aldeia = "Aldeia da folha";
        System.out.println("Nome: " + Tobirama.nome);
        System.out.println("Idade: " + Tobirama.idade);
        System.out.println("Aldeia: " + Tobirama.aldeia);
        Tobirama.sabedoira();



    }
}
