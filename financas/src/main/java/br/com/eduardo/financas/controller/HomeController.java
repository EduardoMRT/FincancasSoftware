package br.com.eduardo.financas.controller;

import br.com.eduardo.financas.model.Pessoa;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/user")
    public String getUserDetails(@AuthenticationPrincipal OAuth2User principal, Model model) {
        Pessoa pessoa = new Pessoa();
        Map<String, Object> attributes = principal.getAttributes();
        if (attributes.containsKey("name")) {
            pessoa.setNome((String) attributes.get("name"));
        }

        System.out.println("Usuário criado: " + pessoa);
        model.addAttribute("nome", pessoa.getNome());
        return "inicio";
    }


}
