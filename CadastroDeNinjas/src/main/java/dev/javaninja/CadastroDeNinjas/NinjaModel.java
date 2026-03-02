package dev.javaninja.CadastroDeNinjas;

import jakarta.persistence.*;


@Entity //Aqui estou transformando esta classe em entidade para meu banco de dados
@Table(name = "tb_cadastro") //Aqui estou colocando o nome da minha tabela
public class NinjaModel {

    @Id //irá gerar id no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia para enumerar meus Id's na tabela (usa o auto increment do banco)

   private Long id;
   private String nome;
   private String email;
   private int idade;

    //Meus construtores
    public NinjaModel(){

    }
    public NinjaModel(String nome, String email, int idade){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    //Meus getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }


}
