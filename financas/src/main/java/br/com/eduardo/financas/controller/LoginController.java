package br.com.eduardo.financas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "Login page";
    }

    @GetMapping("/login/oauth2/code/github")
    public String secured(){
        return "Secured page";
    }

}
