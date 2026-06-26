package com.projetoAi.MagicFridgeAi.Controller;

import com.projetoAi.MagicFridgeAi.DTO.FoodItemDTO;
import com.projetoAi.MagicFridgeAi.Service.FoodItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/food")
public class FoodItemController {
    //Injeção de dependência
    FoodItemService service;
    public FoodItemController(FoodItemService service){
        this.service = service;
    }

    //Buscar Todos
    @GetMapping("buscar")
    public ResponseEntity<List<FoodItemDTO>> buscarTodos(){
        List<FoodItemDTO> items = service.buscar();
        return ResponseEntity.status(HttpStatus.OK).body(items);
    }


    //Buscar Por Id
    @GetMapping("buscar/{id}")
    public ResponseEntity<?> buscarPorId(@PathVariable Long id){
        FoodItemDTO foodExiste = service.buscarPorId(id);

        if(foodExiste != null){
            return ResponseEntity.status(HttpStatus.OK).body(foodExiste);
        }
        return ResponseEntity.status(HttpStatus.OK).body("Comida não encontrada!");
    }

    //Cadastrar
    @PostMapping("cadastrar")
    public ResponseEntity<String> cadastrarFood(@RequestBody FoodItemDTO foodItemDTO){
        service.cadastrar(foodItemDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body("Alimento cadastrado com sucesso!");
    }

    //Excluir
    @DeleteMapping("deletar/{id}")
    public ResponseEntity<String> excluirComida(@PathVariable Long id){
        FoodItemDTO foodExiste = service.buscarPorId(id);

        if(foodExiste != null){
            service.excluir(id);
            return ResponseEntity.status(HttpStatus.OK).body("Comida deletada com sucesso!");
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Comida não encontrada!" + " Id: " + id);
    }

    //Atualizar
    @PutMapping("atualizar/{id}")
    public ResponseEntity<?> atualizar(@PathVariable Long id, @RequestBody FoodItemDTO foodItemDTO){
        FoodItemDTO foodExiste = service.buscarPorId(id);
        if(foodExiste != null){
            service.atualizar(id, foodItemDTO);
            return ResponseEntity.status(HttpStatus.OK).body("Alimento atualizado com sucesso!");
        }

        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Alimento não encontrado!");
    }

}
