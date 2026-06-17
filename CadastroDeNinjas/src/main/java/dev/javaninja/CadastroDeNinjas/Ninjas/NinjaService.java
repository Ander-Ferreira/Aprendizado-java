package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class NinjaService {

    //Injeção de dependencia para trazer o objeto NinjaRepository com os métodos do JPA
    private NinjaRepository ninjaRepository;
    //Adicionando o Mapper à injeção de dependência para usar o DTO
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }




    //Método para listar todos os meus ninjas - refatorado com DTO
    public List<NinjaDTO> listarNinjas(){
        //Pego todos os ninjas e coloco em uma lista
        List<NinjaModel> ninjas = ninjaRepository.findAll();
        return ninjas.stream()
                .map(ninjaMapper::map) //Faço um map para cada ninja da minha lista ser transformado em DTO
                .collect(Collectors.toList()); //Coleto os itens e transformo novamente em uma lista
    }

    //Método para buscar ninja por id - refatorado para usar DTO
    public NinjaDTO buscarPorId(Long id){
        //Uso um optional quando um valor pode existir ou não
       Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        //O map do Optional é diferente do map do Stream
        //Se existir um NinjaModel dentro do Optional,
        //ele será convertido para NinjaDTO através do Mapper
        //Se o Optional estiver vazio, retornará o valor vazio
        return ninjaId.map(ninjaMapper::map).orElseThrow(null);
    }

    //Método para cadastrar ninja usando DTO
    public NinjaDTO cadastrarNinja(NinjaDTO ninjaDTO){

        //Converte o DTO para Model/Entity
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);

        //Salva o ninja no banco de dados
        ninjaModel = ninjaRepository.save(ninjaModel);

        //Converte o Model salvo para DTO e retorna
        return ninjaMapper.map(ninjaModel);
    }

    //Método para deletar ninja - é void porque não estou retornando nada
    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }

    //Método para atualizar ninja
    public NinjaDTO alterarNinja(Long id, NinjaDTO ninjaDTO){
        //Verifico se o ninja existe no meu banco
        Optional<NinjaModel> ninjaExiste = ninjaRepository.findById(id);
        if(ninjaExiste.isPresent()){
            //Se o ninja existe transformo meu DTO em um model
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            //Dou o id que foi passado para ele
            ninjaAtualizado.setId(id);
            //Guardo em uma variável e salvo no meu banco de dados
            NinjaModel ninjaSalvo =  ninjaRepository.save(ninjaAtualizado);
            //Retorno o DTO para o usuário
            return ninjaMapper.map(ninjaSalvo);
        }

        return null;
    }



}
