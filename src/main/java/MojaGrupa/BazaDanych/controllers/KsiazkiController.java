package MojaGrupa.BazaDanych.controllers;

import MojaGrupa.BazaDanych.repositories.KsiazkiRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KsiazkiController {
    private KsiazkiRepository ksiazkiRepository;

    public KsiazkiController(KsiazkiRepository ksiazkiRepository){
        this.ksiazkiRepository=ksiazkiRepository;
    }
    @RequestMapping("/ksiazki")
    public String GetKsiazki(Model model){

        model.addAttribute ("ksiazki", ksiazkiRepository.findAll());
        return "ksiazki";
    }
}
