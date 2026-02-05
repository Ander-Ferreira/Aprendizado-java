package Intermediario15;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Objetivo da aula: Usar generics tanto em classe como array

        //Meus objetos de Classe Equipamentos Ninja
        EquipamentosNinjas kunai = new EquipamentosNinjas("Kunai");
        EquipamentosNinjas shuriken = new EquipamentosNinjas("Shuriken");
        EquipamentosNinjas pergaminho = new EquipamentosNinjas("Pergaminho");

        //Meu Array de Objetos da Classe generica BolsaGenerica, vou guardar os EquipamentosNinjas aqui
        //Lê-se assim, qualquer objeto que seja de EquipamentosNinjas será aceito nesta nova instância da BolsaGenerica
        //É um array de objetos
        BolsaGenerica<EquipamentosNinjas> bolsaGenerica = new BolsaGenerica<>();
        bolsaGenerica.gravarEquipamento(kunai);
        bolsaGenerica.gravarEquipamento(shuriken);
        bolsaGenerica.gravarEquipamento(pergaminho);
        System.out.println(bolsaGenerica);

        //Criando uma nova lista de EquipamentosNinjas
        List<EquipamentosNinjas> novosEquipamentos = new ArrayList<>();
        novosEquipamentos.add(new EquipamentosNinjas("Bomba de Fumaça"));
        novosEquipamentos.add(new EquipamentosNinjas("Bulmerangue"));
        novosEquipamentos.add(new EquipamentosNinjas("Katana"));
        //Usando o set para substituir a lista antiga por essa nova
        bolsaGenerica.setEquipamentos(novosEquipamentos);
        System.out.println("Nova Bolsa Generica: " + bolsaGenerica);








    }
}
