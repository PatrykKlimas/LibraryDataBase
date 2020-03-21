package MojaGrupa.BazaDanych.controllers;

import MojaGrupa.BazaDanych.repositories.PisarzeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PisarzeController {

    private PisarzeRepository pisarzeRepository;

    public PisarzeController(PisarzeRepository pisarzeRepository){
        this.pisarzeRepository=pisarzeRepository;
    }
    @RequestMapping("/pisarze")
    public String GetPisarze(Model model){

        model.addAttribute ("pisarze", pisarzeRepository.findAll());
        return "pisarze";
    }
}
