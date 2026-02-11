package Desafio2;

public enum TipoConta {
    CORRENTE ("Conta Corrente", 0),
    POUPANCA ("Conta Poupança", 1);

    private String descricao;
    private int juros;

    TipoConta(String descricao, int juros){
         this.descricao = descricao;
         this.juros = juros;

    }
}
