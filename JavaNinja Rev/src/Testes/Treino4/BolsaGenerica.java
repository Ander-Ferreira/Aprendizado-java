package Treino4;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> BolsaDeFerramentas;

    //Construtor
    public BolsaGenerica(){
        this.BolsaDeFerramentas = new ArrayList<>();
    }

    //Getters e Setters
    public List<T> getBolsaDeFerramentas(){
        return BolsaDeFerramentas;
    }

    public void setBolsaDeFerramentas(List<T> NovaBolsaDeFerramentas){
        this.BolsaDeFerramentas = NovaBolsaDeFerramentas;
    }

    //Minha função para guardar ferramentas na minha bolsa
    public void guardarFerramentas(T guardarFerramenta){
          BolsaDeFerramentas.add(guardarFerramenta);
    }

    //Minha funão para mostrar dados


    @Override
    public String toString() {
        return "Meu Array de Objetos de Bolsa de Ferramentas: " + BolsaDeFerramentas.toString();
    }
}
