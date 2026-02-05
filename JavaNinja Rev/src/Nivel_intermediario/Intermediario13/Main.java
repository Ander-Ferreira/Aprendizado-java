package Intermediario13;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: aprender a usar ENUMS
        //ENUMS são usados quando quero colocar um número específico de elementos que nunca irão mudar

        Missoes missaoInicial = new Missoes("Resgate de Gato", RankDeMissao.D);
        missaoInicial.exibiDetalhes();
        missaoInicial.setRank(RankDeMissao.S);
        missaoInicial.exibiDetalhes();
        


    }
}
