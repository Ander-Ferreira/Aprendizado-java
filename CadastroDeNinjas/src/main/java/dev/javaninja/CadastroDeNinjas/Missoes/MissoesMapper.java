package dev.javaninja.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Component;

@Component
//Mapeador, responsável por converter meu Model em DTO e meu DTO em Model
public class MissoesMapper {

    //Conversão do Model para DTO
    MissoesModel map(MissoesDTO missoesDTO){
        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missoesDTO.getId());
        missoesModel.setNome(missoesDTO.getNome());
        missoesModel.setDificuldade(missoesDTO.getDificuldade());
        missoesModel.setNinjas(missoesDTO.getNinjas());
        return missoesModel;

    }

    //Conversão do DTO para Model
    MissoesDTO map(MissoesModel missoesModel){
        MissoesDTO missoesDTO = new MissoesDTO();
        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNome(missoesModel.getNome());
        missoesDTO.setDificuldade(missoesModel.getDificuldade());
        missoesDTO.setNinjas(missoesModel.getNinjas());
        return missoesDTO;
    }



}
