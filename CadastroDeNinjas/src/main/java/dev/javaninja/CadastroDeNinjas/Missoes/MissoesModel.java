package dev.javaninja.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.javaninja.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")

//Notações Lombok
@NoArgsConstructor //Cria um construtor sem argumentos por baixo dos panos
@AllArgsConstructor //Cria um construtor com todos os argumentos por baixo dos pontos, e atualiza com novos atributos
@Data //Cria  automaticamente meus getters e setters por baixo dos panos

public class MissoesModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String nome;

   private String dificuldade;

   @OneToMany(mappedBy = "missoes") //Uma missão para muitos ninjas
   @JsonIgnore //Isso evita o looping de serialização quando tenho duas tabelas interligadas
   private List<NinjaModel> ninjas;








}
