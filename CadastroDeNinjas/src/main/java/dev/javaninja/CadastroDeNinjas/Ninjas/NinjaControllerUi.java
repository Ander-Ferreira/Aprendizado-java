package dev.javaninja.CadastroDeNinjas.Ninjas;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import java.util.List;

@Controller //Uso Controller para sinalizar que esta classe é um Controller MVC que será responsável por receber requisições HTTP e retornar páginas HTML
@RequestMapping("ninja/ui")
//Estas serão as rotas que estarei usando o Thymleaf para renderizar as informações na tela de forma mais amigável via UI
public class NinjaControllerUi {
    //Injeção de dependencia
    private NinjaService ninjaService;
    public NinjaControllerUi(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    @GetMapping("/buscar")
    //O objeto model é como uma mochila que levará informações para a página HTML
    public String buscarNinjas(Model model){
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        //Aqui estou colocando a lista dentro do Model, "ninjas" é a chave e a lista de ninjas será o valor desta chave
        model.addAttribute("ninjas", ninjas);
        return "listarNinjas"; //Aqui estou retornando a lista de ninjas para a view em templates/listarNinjas.html
    }

    //Delete aqui também será Get, porque estarei fazendo um Get da lista sem o ninja ao redirecionar
    @GetMapping("/deletar/{id}")
    public String deletarNinja(@PathVariable Long id) {
        ninjaService.deletarNinja(id);
        //No retorno redireciono para a lista de ninja que já mostrará a lista sem o ninja
        return "redirect:/ninja/ui/buscar";

    }

    //Mostrar Ninja por Id
    @GetMapping("/buscar/{id}")
    public String mostrarNinjaPorId(@PathVariable Long id, Model model) {
        NinjaDTO ninjaEncontrado = ninjaService.buscarPorId(id);

        if (ninjaEncontrado != null) {
            model.addAttribute("ninja", ninjaEncontrado);
            return "detalhesNinja";
        }

        return "listarNinjas";
    }

    //Criar Ninja (CREATE)
    @PostMapping("/cadastrar")
    public String criarNinja(@ModelAttribute NinjaDTO ninja, RedirectAttributes redirectAttributes) {
        ninjaService.cadastrarNinja(ninja);
        redirectAttributes.addFlashAttribute("mensagem", "Ninja cadastrado com sucesso!");
        return "redirect:/ninja/ui/buscar";
    }

    //Get para direcionar para a página de cadastro, toda página de post precisa de um Get para a página
    @GetMapping("/adicionar")
    public String mostrarFormularioDeCadastro(Model model){
            model.addAttribute("ninja", new NinjaDTO());
            return "cadastrarNinja";
    }

    //Get e Post para alterar Ninja
    //Esta rota renderiza a página de cadastro, também usará o mesmo formulário de pesquisa de cadastrar ninja
    @GetMapping("/alterar/{id}")
    public String mostrarFormularioAlteracao(@PathVariable Long id, Model model) {
        NinjaDTO ninja = ninjaService.buscarPorId(id);

        model.addAttribute("ninja", ninja);

        return "cadastrarNinja";
    }
    //Esta rota faz a ação de salvar o ninja e por fim redireciona novamente para a lista de ninjas
    @PostMapping("/alterar")
    public String alterarNinjas(@ModelAttribute NinjaDTO ninjaDTO){
        ninjaService.alterarNinja(ninjaDTO.getId(), ninjaDTO);
        return "redirect:/ninja/ui/buscar";
    }

}
