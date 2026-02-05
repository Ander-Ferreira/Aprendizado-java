package Treino6;

import java.util.ArrayList;
import java.util.List;

public class VilaDaFolhaGenerica<T> {
    List<T> arrayDeNinjas;

    //Meu construtor para iniciar meu array vazio
    public VilaDaFolhaGenerica(){
        this.arrayDeNinjas = new ArrayList<>();
    }

    //Minha função para adicionar os ninjas no meu array
    public void adicionarNinjas(T ninjas){
        arrayDeNinjas.add(ninjas);
    }

    //Meu setter para substituir o array por um novo se necessário
    public void novoArray(List<T> outroArray){
        this.arrayDeNinjas = outroArray;
    }

    @Override
    public String toString() {
        return "Array de Clãs da Vila da Folha: " + arrayDeNinjas;
    }
}
