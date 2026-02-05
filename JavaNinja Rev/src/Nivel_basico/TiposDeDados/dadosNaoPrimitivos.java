package TiposDeDados;

public class dadosNaoPrimitivos {
    public static void main(String[] args) {
        //Tudo que é digitado dentro do PSVM é o que o java irá compilar
        //Dados primitivos aceitam métodos, são eles String, Array, Class, enum

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println(nomeEmCaixaAlta);
        String nomeEmCaixaBaixa = nome.toLowerCase();
        System.out.println(nomeEmCaixaBaixa);
        System.out.println(nome.charAt(2));


    }
}
