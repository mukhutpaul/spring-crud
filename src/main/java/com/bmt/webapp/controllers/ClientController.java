package com.bmt.webapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bmt.webapp.models.ClientDto;
import com.bmt.webapp.repositoty.ClientRepository;


import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping({"","/"})
    public String getClients(Model model) {
        var clients =clientRepository.findAll(Sort.by(Sort.Direction.DESC,"id"));
        
        model.addAttribute("clients", clients);

        return "clients/index";
    }

    @GetMapping("/create")
    public String createClient(Model model){
        ClientDto clientDto = new ClientDto();

        model.addAttribute("clientDto", clientDto);

        return "clients/create";
    }
    



}
