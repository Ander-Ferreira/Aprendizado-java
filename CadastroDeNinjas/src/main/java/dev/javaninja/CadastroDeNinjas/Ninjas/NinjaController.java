package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Controlador para APIrest -> aqui falo para o java que isto é um controller
@RequestMapping("ninja") //Aqui estou mapeando minhas rotas
public class NinjaController {


    //Injeção de dependencia para traser o objeto NinjaService com todos os métodos que criei
    NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    //Criar Ninja (CREATE) - Refatorado para usar o meu DTO
    @PostMapping("/cadastrar")
    //Refatorando com ResponseEntity para gerar códigos de repostas para o usuário,
    //a resposta do meu ResponseEntity sempre deve correspeonder o tipo, que neste caso será uma String.
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        //Requestbody me permitirá receber como json os parâmetros do objeto NinjaModel
        ninjaService.cadastrarNinja(ninja); //Aqui estou salvando
        //Retornando status de criado com uma mensagem no corpo
        return ResponseEntity.status(HttpStatus.CREATED).body("Ninja criado com sucesso! " + "Nome: " + ninja.getNome());
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/buscar")
    //Refatorando com ResponseEntity para gerar códigos de repostas para o usuário,
    //aqui como pretendo listar todos os ninjas, o tipo do meu response entity será um List com todos os ninjas.
    public ResponseEntity<List<NinjaDTO>> buscarTodosNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.status(HttpStatus.OK).body(ninjas);

    }

    //Mostrar Ninja por Id (READ) - refatorado para usar dto
    @GetMapping("/buscar/{id}")
    //O PathVariable pegará um valor diretamente do id diretamente da url como parâmetro,
    //para que possa ser usado em minha busca.
    //Refatorando com ResponseEntity para gerar códigos de repostas para o usuário.
    //Uso um generic <?> para poder retornar qualquer tipo na resposta
    public ResponseEntity<?> mostrarNinjaPorId(@PathVariable Long id) {
        //Faço uma busca para encontrar o id
        NinjaDTO ninjaEncontrado = ninjaService.buscarPorId(id);
        //Se o id não for null, retorno o ninja encontrado
        if (ninjaEncontrado != null) {
            return ResponseEntity.status(HttpStatus.OK).body(ninjaEncontrado);
        }
        //Se for null, retorno a string com a mensagem de não encontrado
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado!" + "Id: " + id);
    }

    //Atualizar Ninja (UPDATE) - refatorado para usar DTO
    //Para esta requisição irei precisar do id e também precisarei enviar um body
    @PutMapping("/atualizar/{id}")
    //Refatorando com ResponseEntity para gerar códigos de repostas para o usuário
    //Uso um generic <?> para poder retornar qualquer tipo na resposta
    public ResponseEntity<?> atualizarNinja(@PathVariable Long id, @RequestBody NinjaDTO ninjaAtualizado) {

        //Primeiro já faço uma busca com o Id, caso ache o Id já atualizo o ninja se existir
        NinjaDTO ninja = ninjaService.alterarNinja(id, ninjaAtualizado);
        //Se o ninja existe, retorno a mensagem de alterado junto com o Id
        if (ninja != null) {
            return ResponseEntity.status(HttpStatus.OK).body(ninja);
        }
        //Se o ninja for null, retorno uma mensagem de não encontrado
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado!");


    }


    //Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    //Refatorando com ResponseEntity para gerar códigos de repostas para o usuário
    public ResponseEntity<String> deletarNinja(@PathVariable Long id) {
        //Faço uma busca
        NinjaDTO ninjaEncontrado = ninjaService.buscarPorId(id);

        //Se o ninja exite, deleto e retorno uma mensagem de excluído
        if (ninjaEncontrado != null) {
            ninjaService.deletarNinja(id);
            return ResponseEntity.status(HttpStatus.OK).body("Ninja deletado com sucesso!" + "Id: " + id);
        }

        //Se o ninja não for encontrado, retorno uma mensagem de não encontrado
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Ninja não encontrado!");

    }


}
