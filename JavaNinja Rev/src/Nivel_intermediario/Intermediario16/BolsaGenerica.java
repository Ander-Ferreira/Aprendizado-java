package Intermediario16;

import java.util.ArrayList;
import java.util.List;

public class BolsaGenerica<T> {
    private List<T> bolsaDeFerramentas;

    //Meu construtor para iniciar meu array sempre vazio
    public BolsaGenerica(){
        this.bolsaDeFerramentas = new ArrayList<>();
    }

    //Minha Função para guardar objeto no array
    public void guardarObjeto(T guardarFerramenta){
        bolsaDeFerramentas.add(guardarFerramenta);

    }

    //Minha função para mostrar os itens do array
    //Lista não tem os métodos do array, e sim os das listas
    public void mostrarArray(){
        for(int i = 0; i < bolsaDeFerramentas.size(); i++){
            System.out.println(bolsaDeFerramentas.get(i));
        }

    }


}
