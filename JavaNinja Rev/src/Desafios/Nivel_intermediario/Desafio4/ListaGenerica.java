package Desafios.Nivel_intermediario.Desafio4;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T>{
    List<T> listaDeNinjas;

    //Meu construtor
    public ListaGenerica(){
        this.listaDeNinjas = new ArrayList<>();
    }

    //Meus getters e setters
    public List<T> getListaDeNinjas(){
        return listaDeNinjas;
    }
    public void setListaDeNinjas(List<T> listaDeNinjas){
        this.listaDeNinjas = listaDeNinjas;
    }

    //Meu método para adicionar na lista
    public void adicionarNinja(T ninja){
        listaDeNinjas.add(ninja);
        System.out.println("Ninja adicionado com sucesso!");
    }






}
