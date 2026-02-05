package Treino4;

public class Main {
    public static void main(String[] args) {
        //Objetivo: Criar ferramentas ninjas e uma bolsa de ferramentas para guardar diversos tipos de ferramentas

        //Ferramentas Ninjas
        FerramentasNinjas kunai = new FerramentasNinjas("Kunai cortante", "A", 15);
        FerramentasNinjas shuriken = new FerramentasNinjas("Shuriken", "S", 5);
        FerramentasNinjas pergaminho = new FerramentasNinjas("Pergaminho Explosivo", "S+", 2);
        FerramentasNinjas katana = new FerramentasNinjas("Katana Ninja", "SS", 5);

        //TODO:Bolsa de ferramentas
        BolsaGenerica<FerramentasNinjas> arrayDaBolsaFerramentas = new BolsaGenerica<>();
        arrayDaBolsaFerramentas.guardarFerramentas(kunai);
        arrayDaBolsaFerramentas.guardarFerramentas(shuriken);
        arrayDaBolsaFerramentas.guardarFerramentas(pergaminho);
        System.out.println(arrayDaBolsaFerramentas);
        //Substituindo o array
        BolsaGenerica<FerramentasNinjas> novoArrayDaBolsaFerramentas = new BolsaGenerica<>();
        novoArrayDaBolsaFerramentas.guardarFerramentas(katana);
        novoArrayDaBolsaFerramentas.guardarFerramentas(pergaminho);
        System.out.println(novoArrayDaBolsaFerramentas);






    }
}
