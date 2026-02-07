package Desafios.Nivel_basico.Desafio2;

import java.util.ArrayList;
import java.util.List;

public class ListaGenerica <T> {
    List<T> Ninjas;

   //Meu construtor
    public ListaGenerica(){
        this.Ninjas = new ArrayList<>();
    }

    //Meu getter / Mostrar Ninjas
    public List<T> getNinjas(){
        return Ninjas;
    }


    //Função para adicionar meus ninjas
    public void adicionarNinjas(T ninja){
        Ninjas.add(ninja);
    }






}
