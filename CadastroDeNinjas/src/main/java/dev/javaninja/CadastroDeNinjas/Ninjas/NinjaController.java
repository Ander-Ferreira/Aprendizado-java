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
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        //Requestbody me permitirá receber como json os parâmetros do objeto NinjaModel
        return ninjaService.cadastrarNinja(ninja); //Aqui estou salvando
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/buscar")
    public List<NinjaModel> buscarTodosNinjas(){
        return ninjaService.listarNinjas();

    }

    //Mostrar Ninja por Id (READ)
    @GetMapping("/buscar/{id}")
    //O PathVariable pegará um valor diretamente do id diretamente da url como parâmetro
    //Para que possa ser usado em minha busca
    public NinjaModel mostrarNinjaPorId(@PathVariable Long id){
        return ninjaService.buscarPorId(id);
    }

    //Atualizar Ninja (UPDATE)
    @PutMapping("/atualizar")
    public String atualizarNinja(){
        return "Ninja atualizado";
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinja(id);
        System.out.println("Ninja deletado com sucesso!");
    }

}
