package dev.javaninja.CadastroDeNinjas.Missoes;
import dev.javaninja.CadastroDeNinjas.Ninjas.NinjaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
//Meu objeto de transferência de dados, é uma representação dos dados da minha entidade MissoesModel
public class MissoesDTO {
    private Long id;
    private String nome;
    private String dificuldade;
    private List<NinjaModel> ninjas;
}
