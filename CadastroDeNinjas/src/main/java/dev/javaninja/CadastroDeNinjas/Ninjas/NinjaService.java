package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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




    //Método para listar todos os meus ninjas
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();

    }

    //Método para buscar ninja por id
    public NinjaModel buscarPorId(Long id){
        //Uso um optional quando um valor pode existir ou não
       Optional<NinjaModel> ninjaId = ninjaRepository.findById(id);
        //Também poderia funcionar assim NinjaModel ninjaId = ninjaRepository.findById(id).orElse(null);
        return ninjaId.orElse(null);
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
    public NinjaModel alterarNinja(Long id, NinjaModel ninjaAlterado){
        //Primeiro verifico se o ninja existe
        if(ninjaRepository.existsById(id)){
            ninjaAlterado.setId(id);
            ninjaRepository.save(ninjaAlterado);
        }
        //Caso não exista retorne null
        return null;
    }



}
