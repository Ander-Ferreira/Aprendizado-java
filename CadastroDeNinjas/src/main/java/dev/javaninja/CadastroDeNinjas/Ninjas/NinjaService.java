package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

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

}
