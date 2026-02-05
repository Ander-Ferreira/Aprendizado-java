package Desafio1;

public class Uchiha extends Ninja{
    //        2. Crie uma subclasse chamada Uchiha que herda
//        de Ninja. Adicione um atributo adicional
//        habilidadeEspecial (String) e um método
//        chamado mostrarHabilidadeEspecial() para exibir
//        a habilidade especial do ninja.
//        3. Sobrescreva o método mostrarInformacoes() na
//        classe Uchiha para incluir também a habilidade
//                especial

    private String habilidadeEspecial;

    //Meu construtor
    public Uchiha(String nome, String missao, String nivelDificuldade, String statusMissao, int idade, String habilidadeEspecial){
        super(nome, missao, nivelDificuldade, statusMissao, idade);
        this.habilidadeEspecial = habilidadeEspecial;

    }

    //Getter e Setter de Mostrar Habilidade Especial
    public String getHabilidadeEspecial(){
        return habilidadeEspecial;
    }
    public void setHabilidadeEspecial(String habilidadeEspecial){
        this.habilidadeEspecial = habilidadeEspecial;
    }




    //Meu método mostrar Habilidade Especial
    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidadeEspecial();
    }
}
