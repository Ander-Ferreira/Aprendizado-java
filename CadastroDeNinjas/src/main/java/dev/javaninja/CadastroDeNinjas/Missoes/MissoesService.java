package dev.javaninja.CadastroDeNinjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    //Injeção de dependencia
    private MissoesRepository missoesRepository;
    private MissoesMapper missoesMapper;
    //As duas dependências que irei precisar nesse service
    MissoesService(MissoesRepository missoesRepository, MissoesMapper missoesMapper){
        this.missoesRepository = missoesRepository;
        this.missoesMapper = missoesMapper;
    }

    //Função para buscar todos
    public List<MissoesDTO> listarTodos(){
        //Uso meu model para buscar todas as missões e colocar em uma lista
        List<MissoesModel> missoes = missoesRepository.findAll();
        //Converto para DTO, converto em lista, e envio de volta
         return missoes.stream().map(missoesMapper::map).toList();
    }

    //Função para buscar por Id
    public MissoesDTO buscarPorId(Long id){
        //Façi uma busca para ver se a missão existe
        Optional<MissoesModel> missaoExiste = missoesRepository.findById(id);
        //Se existir retorno a missão, se não existir retorno null
        return missaoExiste.map(missoesMapper::map).orElse(null);
    }

    //Função para cadastrar
    public MissoesDTO cadastrarMissao(MissoesDTO missoesDTO){
        //Converto o DTO que recebo do usuário para uma entidade do banco
        MissoesModel missoesModel = missoesMapper.map(missoesDTO);
        //Salvo no banco
        missoesRepository.save(missoesModel);
        //Converto novamente em DTO e retorno
        return missoesMapper.map(missoesModel);

    }

    //Função para excluir
    public void excluirMissao(Long id){
        missoesRepository.deleteById(id);
    }


    //Função para atualizar
    public MissoesDTO atualizarMissao(Long id, MissoesDTO missoesDTO){
        //Faço uma busca
        Optional<MissoesModel> missaoExiste = missoesRepository.findById(id);
        //Se existir
        if (missaoExiste.isPresent()) {
            //Converto meu DTO em uma entidade do meu banco
            MissoesModel missaoAtualizada = missoesMapper.map(missoesDTO);
            //E salvo no meu banco
            missaoAtualizada.setId(id);
            missoesRepository.save(missaoAtualizada);
        }

        return null;
    }






}
