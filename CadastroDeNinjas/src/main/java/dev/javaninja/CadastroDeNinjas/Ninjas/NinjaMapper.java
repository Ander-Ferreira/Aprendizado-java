package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Component;

//O mapper é o que conecta minha Classe ao meu DTO
@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO){
        //Inicializo um objeto do tipo NinjaModel
        NinjaModel ninjaModel = new NinjaModel();
        //Agora coloco os atributos do meu ninjaDTO dentro do meu ninjaModel
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());

        //Retorno o ninjaModel com os atributos do DTO
        return ninjaModel;
    }

    //Agora estou colocando os atributos do meu NinjaModel dentro do meu DTO
    public NinjaDTO map(NinjaModel ninjaModel){
        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setImgUrl(ninjaModel.getImgUrl());
        ninjaDTO.setRank(ninjaModel.getRank());
        ninjaDTO.setMissoes(ninjaModel.getMissoes());

        //Retorno o DTO com os atributos do NinjaModel
        return ninjaDTO;

    }


}
