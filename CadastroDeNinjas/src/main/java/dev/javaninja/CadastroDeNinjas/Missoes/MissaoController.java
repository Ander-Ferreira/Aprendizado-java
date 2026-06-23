package dev.javaninja.CadastroDeNinjas.Missoes;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("missoes") // vai redirecionar minhas requisições automaticamente para http://localhost:8080/missoes/
@Tag(name = "missoes", description = "Rota de missões") //Documentação para o swagger
public class MissaoController {

    //Injeção de dependência do meu MissoesService
    private MissoesService missoesService;
    MissaoController(MissoesService missoesService){
        this.missoesService = missoesService;
    }

    @GetMapping("/buscar")

    // ------ Documentação para o swagger -------
    @Operation(summary = "Busca todas as missões",
            description = "Retorna a lista de todas as missões cadastradas")
    @ApiResponse(responseCode = "200", description = "Missões listadas com sucesso")
    //-------------------------------------------

    //ResposeEntity me permiti retornar respostar http
    //O tipo será uma lista porque estarei recebendo e retornando uma lista de DTO
    public ResponseEntity<List<MissoesDTO>> buscarMissoes(){
        List<MissoesDTO> missoes = missoesService.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(missoes);
    }

    @GetMapping("/buscar/{id}")

    // ------ Documentação para o swagger -------
    @Operation(summary = "Buscar missão por id",
            description = "Busca a missão por id, se encontrada retorna a missão, caso não exista (seja null) retorna uma mensagem 404\"")
    @ApiResponse(responseCode = "200", description = "Missão encontrada")
    @ApiResponse(responseCode = "404", description = "Missão não encontrada")
    //-------------------------------------------

    //O tipo será um generic porque precisarei retornar tipos diferentes, DTO para caso ache,
    // mensagem String para caso não ache
    public ResponseEntity<?> buscarMissaoPorId(@PathVariable Long id){
        MissoesDTO missaoExiste = missoesService.buscarPorId(id);
        if(missaoExiste != null){
            return ResponseEntity.status(HttpStatus.OK).body(missaoExiste);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão não encontrada! " + "Id: " + id);
    }


    @PostMapping("/criar")

    // ------ Documentação para o swagger -------
    @Operation(summary = "Cadastro de missão", description = "Cadastro completo de missão")
    @ApiResponse(responseCode = "201", description = "Missão criada com sucesso")
    //-------------------------------------------

    public ResponseEntity<String> cadastrarMissao(@RequestBody MissoesDTO missoesDTO){
        missoesService.cadastrarMissao(missoesDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Missão criada com sucesso!");
    }

    @PutMapping("/atualizar/{id}")

    // ------ Documentação para o swagger -------
    @Operation(summary = "Atualiza missão por id",
            description = "Busca a missão por id, se encontrada retorna a missão, caso não exista (seja null) retorna uma mensagem 404")
    @ApiResponse(responseCode = "200", description = "Missão alterada com sucesso")
    @ApiResponse(responseCode = "404", description = "Missão não encontrada")
    //-------------------------------------------

    public ResponseEntity<?> atualizarMissao(@PathVariable Long id, @RequestBody MissoesDTO missoesDTO){
       MissoesDTO missaoExiste = missoesService.buscarPorId(id);
       if(missaoExiste != null){
           missoesService.atualizarMissao(id, missoesDTO);
           return ResponseEntity.status(HttpStatus.OK).body("Missão atualizada com sucesso!");
       }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão não encontrada! " + "Id: " + id);
    }

    @DeleteMapping("deletar/{id}")

    // ------ Documentação para o swagger -------
    @Operation(summary = "Deleta missão por id",
            description = "Busca a missão por id, se encontrada exclui-se a missão, caso não exista (seja null) retorna uma mensagem 404")
    @ApiResponse(responseCode = "200", description = "Missão excluída com sucesso")
    @ApiResponse(responseCode = "404", description = "Missão não encontrada")
    //-------------------------------------------

    public ResponseEntity<String> deletarMissao(@PathVariable Long id){
        //Faço uma busca
        MissoesDTO missaoExiste = missoesService.buscarPorId(id);
       //Se  for encontrada, deleto a missão e retorno a mensagem com sucesso
        if(missaoExiste != null){
           missoesService.excluirMissao(id);
            return ResponseEntity.status(HttpStatus.OK).body("Missao deletada com sucesso!");
       }
        //Se não for encontrada, retorno uma mensagem de missão não encontrada
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Missão não encontrada! " + "Id: " + id);
    }



}
