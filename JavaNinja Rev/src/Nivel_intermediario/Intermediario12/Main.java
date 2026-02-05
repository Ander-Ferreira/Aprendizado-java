package Intermediario12;

public class Main {
    public static void main(String[] args) {

        //Objetivo da aula: aprender a usar Getters e Setters
        /*Getters e Setters servem para encapsular variáveis e protegê-las
         * contra códigos indevidos e também serve para ajudar na leitura do código e organização
         */

        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 14, 1.55);

        //Como privei minhas variáveis, só vou conseguir mostrar os dados via o getter que criei

        System.out.println(naruto.getNome());
        System.out.println(naruto.getAldeia());
        System.out.println(naruto.getIdade());
        System.out.println(naruto.getAltura());

        //Agora se eu quiser alterar, posso usar o setter que criei
        System.out.println("-------------Alterações com setters----------");

        naruto.setNome("Naruto Uzumaki");
        naruto.setAldeia("Aldeia Oculta da Folha");
        naruto.setIdade(16);
        naruto.setAltura(1.83);
        System.out.println(naruto.getNome());
        System.out.println(naruto.getAldeia());
        System.out.println(naruto.getIdade());
        System.out.println(naruto.getAltura());











    }


}
