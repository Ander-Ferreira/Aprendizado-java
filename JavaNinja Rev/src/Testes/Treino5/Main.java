package Treino5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objetivo, criar um programa em que usuários possam registrar seus equipamentos

        //Campo de Input do Usuário da Ferramenta 1
        System.out.println("Digite o Nome da Ferramenta: ");
        Scanner caixaDeTexto = new Scanner(System.in);
        String guardarTexto1Ferramenta1 = caixaDeTexto.nextLine();
        System.out.println("Digite o Dano da Ferramenta: ");
        String guardarTexto2Ferramenta1 = caixaDeTexto.nextLine();
        System.out.println("Digite a Quantidade da Ferramenta: ");
        int guardarNumeroFerramenta1 = caixaDeTexto.nextInt();


        //Registrando a ferramenta do Usuário
        EquipamentosNinja ferramenta1 = new EquipamentosNinja();
        ferramenta1.setNome(guardarTexto1Ferramenta1);
        ferramenta1.setDano(guardarTexto2Ferramenta1);
        ferramenta1.setQuantidade(guardarNumeroFerramenta1);

        //Ferramenta 2
        System.out.println("Digite o Nome da Ferramenta: ");
        String guardarTexto1Ferramenta2 = caixaDeTexto.nextLine();
        guardarTexto1Ferramenta2 = caixaDeTexto.nextLine();
        System.out.println("Digite o Dano da Ferramenta: ");
        String guardarTexto2Ferramenta2 = caixaDeTexto.nextLine();
        System.out.println("Digite a Quantidade da Ferramenta: ");
        int guardarNumeroFerramenta2 = caixaDeTexto.nextInt();

        EquipamentosNinja ferramenta2 = new EquipamentosNinja();
        ferramenta2.setNome(guardarTexto1Ferramenta2);
        ferramenta2.setDano(guardarTexto2Ferramenta2);
        ferramenta2.setQuantidade(guardarNumeroFerramenta2);


        //Ferramenta 3
        System.out.println("Digite o Nome da Ferramenta: ");
        String guardarTexto1Ferramenta3 = caixaDeTexto.nextLine();
        guardarTexto1Ferramenta3 = caixaDeTexto.nextLine();
        System.out.println("Digite o Dano da Ferramenta: ");
        String guardarTexto2Ferramenta3 = caixaDeTexto.nextLine();
        System.out.println("Digite a Quantidade da Ferramenta: ");
        int guardarNumeroFerramenta3 = caixaDeTexto.nextInt();

        EquipamentosNinja ferramenta3 = new EquipamentosNinja();
        ferramenta3.setNome(guardarTexto1Ferramenta3);
        ferramenta3.setDano(guardarTexto2Ferramenta3);
        ferramenta3.setQuantidade(guardarNumeroFerramenta3);

        //Array para guardar equipamentos
        CaixaDeFerramentasGenerica<EquipamentosNinja> arrayDeEquipamentos = new CaixaDeFerramentasGenerica<>();
        arrayDeEquipamentos.guardarFerramenta(ferramenta1);
        arrayDeEquipamentos.guardarFerramenta(ferramenta2);
        arrayDeEquipamentos.guardarFerramenta(ferramenta3);
        System.out.println(arrayDeEquipamentos);
























    }
}
