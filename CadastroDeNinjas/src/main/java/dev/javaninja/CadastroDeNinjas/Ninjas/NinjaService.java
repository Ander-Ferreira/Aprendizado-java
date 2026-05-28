package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    //Injeção de dependencia para trazer o objeto NinjaRepository com os métodos do JPA
    private NinjaRepository ninjaRepository;
    public NinjaService (NinjaRepository ninjaRepository){
        this.ninjaRepository = ninjaRepository;
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

    //Método para criar ninja
    public NinjaModel cadastrarNinja(NinjaModel ninja){
        //Recebo o ninja com todos os parâmetros do NinjaModel e salvo
        return ninjaRepository.save(ninja);
    }

    //Método para deletar ninja - é void porque não estou retornando nada
    public void deletarNinja(Long id){
        ninjaRepository.deleteById(id);
    }

}
