package br.com.eduardo.financas.controller;

import br.com.eduardo.financas.model.Pessoa;
import br.com.eduardo.financas.model.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Inicio";
    }

    @GetMapping("/user")
    public Map<String, Object> getUserDetails(@AuthenticationPrincipal OAuth2User principal) {
        Pessoa pessoa = new Pessoa();
        Map<String, Object> attributes = principal.getAttributes();
        if (attributes.containsKey("name")) {
            pessoa.setNome((String) attributes.get("name"));
        }

        System.out.println("Usuário criado: " + pessoa);
        return attributes;
    }
}
