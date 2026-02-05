package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {

       //Tudo digitado aqui dentro com o public static void main (psvm) será compilado e executado pelo java

       //Dados primitivos aceitam métodos

           String nome = "Naruto Uzumaki";

       //Agora usarei um método para deixar a string em caixa alta, e guardarei em uma variável

            String nomeEmCaixaAlta = nome.toUpperCase();

            System.out.println("nomeEmCaixaAlta = " + nomeEmCaixaAlta);
        
        //Brincando com outros métodos
        
            String nomeEmCaixaBaixa = nome.toLowerCase();

            System.out.println("nomeEmCaixaBaixa = " + nomeEmCaixaBaixa);

            String substituirLetra = nome.replace('N', 'O');

            System.out.println("substituirLetra = " + substituirLetra);

    }
}
