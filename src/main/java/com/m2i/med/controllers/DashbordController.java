package com.m2i.med.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DashbordController {

    @RequestMapping("")
    public String getDashbord(Model model){
        String title = "Dashbord";
        model.addAttribute("dashbord", title);
        return "dashbord/dashbord";
    }
}
