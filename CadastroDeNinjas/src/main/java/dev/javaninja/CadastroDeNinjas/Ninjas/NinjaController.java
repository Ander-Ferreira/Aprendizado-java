package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController //Controlador para APIrest -> aqui falo para o java que isto é um controller
@RequestMapping //Aqui estou mapeando minhas rotas
public class NinjaController {

    //Criar Ninja (CREATE)
    @PostMapping("/cadastrar")
    public String criarNinja(){
        return "Ninja criado!";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String buscarTodosNinjas(){
        return "todos os ninjas!";
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
