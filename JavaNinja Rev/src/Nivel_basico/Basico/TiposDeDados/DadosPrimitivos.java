package TiposDeDados;

public class DadosPrimitivos {

//    Objetivos da aula
//    Criar um ninja
//    Tipos Primitivos: int, double, float, char, boolean, short
//    Tipos Primitivos não aceitam métodos

//    Antes de começar a codar, sempre vou precisar iniciar um boilerplate

    public static void main(String[] args) {

        int idade = 17;
        double altura = 1.65;
        char inicial = 'N';
        boolean vivoOuMorto = true;
        Long saldoBancario = 999999L; //Long guarda um valor maior do que int, int só vai até dois bilhões

//  Comando para mostrar para o usuário
        //System.out.print(idade);
        System.out.println(idade); //println quebra uma linha e exibe o resultado abaixo
        System.out.println(saldoBancario);

        //Comando de atalho para printar: sout
        System.out.println(saldoBancario);

        //Comando para mandar uma mensagem concatenada com o valor da variável: soutv
        System.out.println("saldoBancario é = " + saldoBancario);
        System.out.println("Minha idade é " + idade);







    }
}
