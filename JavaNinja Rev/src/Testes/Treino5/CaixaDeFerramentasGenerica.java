package Treino5;

import java.util.ArrayList;
import java.util.List;

public class CaixaDeFerramentasGenerica<T> {
    private List<T> caixaGenerica;

    //Construtor
    public CaixaDeFerramentasGenerica(){
        this.caixaGenerica = new ArrayList<>();
    }

    //Minha função para guardar o item no array
    public void guardarFerramenta(T itemGuardado){
        caixaGenerica.add(itemGuardado);

    }

    //Meu setter para construir um novo array (opcional)
    public void setNovoArray(List<T> novoArray){
        this.caixaGenerica = novoArray;
    }

    //Função para mostrar meu array


    @Override
    public String toString() {
        return "Array de Itens Ninja: " + caixaGenerica.toString();
    }
}
