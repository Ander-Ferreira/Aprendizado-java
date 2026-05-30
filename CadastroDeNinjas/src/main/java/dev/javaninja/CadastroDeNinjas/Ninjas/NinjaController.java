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

    //Criar Ninja (CREATE) - Refatorado para usar o meu DTO
    @PostMapping("/cadastrar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        //Requestbody me permitirá receber como json os parâmetros do objeto NinjaModel
        return ninjaService.cadastrarNinja(ninja); //Aqui estou salvando
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/buscar")
    public List<NinjaDTO> buscarTodosNinjas(){
        return ninjaService.listarNinjas();

    }

    //Mostrar Ninja por Id (READ) - refatorado para usar dto
    @GetMapping("/buscar/{id}")
    //O PathVariable pegará um valor diretamente do id diretamente da url como parâmetro
    //Para que possa ser usado em minha busca
    public NinjaDTO mostrarNinjaPorId(@PathVariable Long id){
        return ninjaService.buscarPorId(id);
    }

    //Atualizar Ninja (UPDATE) - refatorado para usar DTO
    //Para esta requisição irei precisar do id e também precisarei enviar um body
    @PutMapping("/atualizar/{id}")
    public NinjaDTO atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado){
        return ninjaService.alterarNinja(id, ninjaAtualizado);
    }

    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    public void deletarNinja(@PathVariable Long id){
        ninjaService.deletarNinja(id);
        System.out.println("Ninja deletado com sucesso!");
    }


}
