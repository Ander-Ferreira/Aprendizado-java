package Intermediario13;

public enum RankDeMissao {
    D("Baixo", 1),
    C("Moderada", 2),
    A("Difícil", 3),
    S("Muito Difícil", 4);

    //Se eu quiser adicionar detalhes a cada item do meu ENUM, preciso criar um construtor primeiro, sem public, ENUM é private por padrão

    private String descricao;
    private int dificuldade;

    RankDeMissao(String descricao, int dificuldade){
        this.descricao = descricao;
        this.dificuldade = dificuldade;

    }




}
