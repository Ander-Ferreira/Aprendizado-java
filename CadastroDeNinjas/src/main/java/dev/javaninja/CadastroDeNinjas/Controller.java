package dev.javaninja.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Controlador para APIrest -> aqui falo para o java que isto é um controller
@RequestMapping //Aqui estou mapeando minhas
public class Controller {

    //Meu método de boas vindas
    @GetMapping("/boasvindas") // Aqui coloco a rota que quero mostrar minhas boas vindas
    public String boasVindas(){
        return "Bem-vindo a minha aplicação";
    }
}
