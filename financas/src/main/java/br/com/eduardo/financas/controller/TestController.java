package br.com.eduardo.financas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

   @GetMapping("/test")
    public String test(){
        return "inicio";
    }
}
