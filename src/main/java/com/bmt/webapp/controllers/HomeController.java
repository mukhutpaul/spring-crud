package com.bmt.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home/index"; // Renvoie le nom de la vue (index.html)
    }
    
}
