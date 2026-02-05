package Intermediario15;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos; // Ao invés de trabalhar com um atributo, trabalharei com um array

    //Meu construtor para iniciar o array vazio
    public BolsaGenerica(){
        this.equipamentos = new ArrayList<>();
    }

    //Meu método para gravar no array
    public void gravarEquipamento(T equipamento){
        equipamentos.add(equipamento); //Gravar normalmente no meu array

    }

    //Getters e Setters

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos){
        this.equipamentos = equipamentos; //Este set poderá ser usado para substituir o array antigo por um novo array se for necessário

    }


    //Meu método para imprimir
    @Override
    public String toString() {
        return "Array de equipamentos: " + equipamentos.toString();
    }
}
