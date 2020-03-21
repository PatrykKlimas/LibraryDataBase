package MojaGrupa.BazaDanych.controllers;


import MojaGrupa.BazaDanych.repositories.WydawnictwoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WydawnictwoController {
    private WydawnictwoRepository wydawnictwoRepository;

    public WydawnictwoController(WydawnictwoRepository wydawnictwoRepository){
        this.wydawnictwoRepository =wydawnictwoRepository;
    }
    @RequestMapping("/wydawnictwo")
    public String GetWydawnictwo(Model model){

        model.addAttribute ("wydawnictwo", wydawnictwoRepository.findAll());
        return "wydawnictwo";
    }
}
