package Treino3;

public enum Biju {
    SHUKAKU ("Gaara da Areia", 1),
    NIBI("Yugito", 2),
    SANBI("Yagura Karatachi", 3),
    YONBI("Roshi", 4 ),
    GOBI("Han", 5),
    ROKUBI("Utakata", 6),
    NANABI("Fu", 7),
    HACHIBI(" Killer B", 8),
    KYUUBI("Naruto Uzumaki", 9);

    String nomeJinchiriki;
    int numeroDeCaudas;

    //Meus construtores - obs, tudo é final aqui, os valores devem ser passados aqui também
    Biju(){

    }

    Biju(String nomeJinchiriki, int numeroDeCaudas){
        this.nomeJinchiriki = nomeJinchiriki;
        this.numeroDeCaudas = numeroDeCaudas;
    }



}
