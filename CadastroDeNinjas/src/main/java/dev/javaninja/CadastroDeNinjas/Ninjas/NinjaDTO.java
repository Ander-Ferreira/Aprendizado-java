package dev.javaninja.CadastroDeNinjas.Ninjas;

import dev.javaninja.CadastroDeNinjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//O DTO serve para tirar a responsabilidade da minha entidade NinjaModel, todos atributos que NinjaModel tem, o DTO também vai ter
//Essa camada de abstração ajuda na defesa do meu banco de dados
public class NinjaDTO {
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String imgUrl;
    private String rank;
    private MissoesModel missoes;
}
