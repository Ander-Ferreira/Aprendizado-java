package dev.javaninja.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes") // vai redirecionar minhas requisições automaticamente para http://localhost/missoes/requisicoes
public class MissaoController {

    @GetMapping("/buscarmissoes")
    public String buscarMissoes(){
        return "todas missões";
    }

    @GetMapping("/buscarid")
    public String buscarMissaoPorId(){
        return "missao por id";
    }

    @PostMapping("/cadastrar")
    public String cadastrarMissao(){
        return "missao cadastrada";
    }

    @PutMapping("/atualizar")
    public String atualizarMissao(){
        return "Missao atualizada";
    }

    @DeleteMapping
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }


}
