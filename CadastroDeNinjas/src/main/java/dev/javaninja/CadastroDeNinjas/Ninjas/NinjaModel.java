package dev.javaninja.CadastroDeNinjas.Ninjas;

import dev.javaninja.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity //Aqui estou transformando esta classe em entidade para meu banco de dados
@Table(name = "tb_cadastro") //Aqui estou colocando o nome da minha tabela

//Notações Lombok
@NoArgsConstructor //Cria um construtor sem argumentos por baixo dos panos
@AllArgsConstructor //Cria um construtor com todos os argumentos por baixo dos pontos, e atualiza com novos atributos

//Nunca modifique uma tabela por aqui depois que o banco de dados foi modificado, precisa ser via query no próprio banco

public class NinjaModel {
    @Id //irá gerar id no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia para enumerar meus Id's na tabela (usa o auto increment do banco)

   private Long id;

   @Column(name = "nome")
   private String nome;

   @Column(name = "email", unique = true) //Emails não podem ser repetidos
   private String email;

   @Column(name = "idade")
   private int idade;

   @Column(name = "img_url")
   private String imgUrl;

   @ManyToOne //Muitos ninjas para uma missão
   @JoinColumn(name = "missoes_id") //Fusão da tabela de missões com a de ninja
   private MissoesModel missoes;

   //Meus getters e setters na mão, notações Lombok não estão funcionando na versão 4.0.3 do spring
    public Long getId() {
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

    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getImgUrl(){
        return imgUrl;
    }
    public void setImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
    }
}
