package com.m2i.med.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class loginController {

    @GetMapping
    public String login(Model model){
        String titre = "page d'accueil";
        model.addAttribute("accueil", titre);
        return "login/login";
    }
}
