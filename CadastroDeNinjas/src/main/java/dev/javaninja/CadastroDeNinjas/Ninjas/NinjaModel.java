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
@Data //Cria  automaticamente meus getters e setters por baixo dos panos

public class NinjaModel {
    @Id //irá gerar id no banco de dados
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Estratégia para enumerar meus Id's na tabela (usa o auto increment do banco)

   private Long id;

   private String nome;

   @Column(unique = true) //Emails não podem ser repetidos
   private String email;

   private int idade;

   @ManyToOne //Muitos ninjas para uma missão
   @JoinColumn(name = "missoes_id") //Fusão da tabela de missões com a de ninja
   private MissoesModel missoes;




}
