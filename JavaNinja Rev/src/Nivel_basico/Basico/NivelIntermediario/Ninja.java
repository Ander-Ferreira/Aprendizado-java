package NivelIntermediario;

//Essa é a classe que usarei como molde para os objeto de ninjas lá na main

public class Ninja {

    //Usarei essas chaves nos objetos que irei criar na main
        String nome;
        int idade;
        String aldeia;

    //Meus métodos

   //Métodos void não precisam retornar nada
//        public void SharinganAtivado(){
//        System.out.println("Sharingan Ativado!");
//
//    }

   //Método que retorna algo
   public String souUmNinja(){
       return "Oi, eu sou um ninja";
   }

   //Método com parametro
   public int idadeParaSerHokage(int idadeMinimaParaSerHokage){
       return idadeMinimaParaSerHokage - idade;
   }




}


