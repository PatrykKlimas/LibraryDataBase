package MojaGrupa.BazaDanych.controllers;

import MojaGrupa.BazaDanych.repositories.CzytelnicyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CzytelnicyController {

    private CzytelnicyRepository czytelnicyRepository;

    public CzytelnicyController(CzytelnicyRepository czytelnicyRepository){
        this.czytelnicyRepository=czytelnicyRepository;
    }
    @RequestMapping("/czytelnicy")
    public String GetCzytelnicy(Model model){

        model.addAttribute ("czytelnicy", czytelnicyRepository.findAll());
        return "czytelnicy";
    }
}
