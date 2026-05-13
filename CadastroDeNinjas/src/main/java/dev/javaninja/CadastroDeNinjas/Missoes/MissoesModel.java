package dev.javaninja.CadastroDeNinjas.Missoes;

import dev.javaninja.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String nome;

   private String dificuldade;

   @OneToMany(mappedBy = "missoes") //Uma missão para muitos ninjas
   private List<NinjaModel> ninjas;

   //Meus construtores
    public MissoesModel(){

    }

    //Meus getters e setters
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDificuldade(){
        return dificuldade;
    }
    public void setDificuldade(String dificuldade){
        this.dificuldade = dificuldade;
    }






}
