package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Controlador para APIrest -> aqui falo para o java que isto é um controller
@RequestMapping("ninja") //Aqui estou mapeando minhas rotas
public class NinjaController {


    //Injeção de dependencia para traser o objeto NinjaService com todos os métodos que criei
    NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    //Criar Ninja (CREATE)
    @PostMapping("/cadastrar")
    public String criarNinja(){
        return "Ninja criado!";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public List<NinjaModel> buscarTodosNinjas(){
        return ninjaService.listarNinjas();

    }

    //Mostrar Ninja por Id (READ)
    @GetMapping("/buscarid")
    public String mostrarNinjaPorId(){
        return "ninja por id";
    }

    //Atualizar Ninja (UPDATE)
    @PutMapping("/atualizar")
    public String atualizarNinja(){
        return "Ninja atualizado";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar")
    public String deletarNinja(){
        return "ninja deletado";
    }

}
