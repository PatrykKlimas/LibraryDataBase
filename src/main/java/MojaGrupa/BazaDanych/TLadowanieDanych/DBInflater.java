package MojaGrupa.BazaDanych.TLadowanieDanych;

import MojaGrupa.BazaDanych.BazyDanych.Czytelnicy;
import MojaGrupa.BazaDanych.BazyDanych.Ksiazki;
import MojaGrupa.BazaDanych.BazyDanych.Pisarze;
import MojaGrupa.BazaDanych.BazyDanych.Wydawnictwo;
import MojaGrupa.BazaDanych.repositories.CzytelnicyRepository;
import MojaGrupa.BazaDanych.repositories.KsiazkiRepository;
import MojaGrupa.BazaDanych.repositories.PisarzeRepository;
import MojaGrupa.BazaDanych.repositories.WydawnictwoRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DBInflater implements ApplicationListener<ContextRefreshedEvent> {

    public DBInflater(CzytelnicyRepository czytelnicyRepository, KsiazkiRepository ksiazkiRepository, PisarzeRepository pisarzeRepository
                                , WydawnictwoRepository wydawnictwoRepository){
        this.czytelnicyRepository=czytelnicyRepository;
        this.ksiazkiRepository=ksiazkiRepository;
        this.pisarzeRepository=pisarzeRepository;
        this.wydawnictwoRepository=wydawnictwoRepository;
    }

    private CzytelnicyRepository czytelnicyRepository;
    private KsiazkiRepository ksiazkiRepository;
    private PisarzeRepository pisarzeRepository;
    private WydawnictwoRepository wydawnictwoRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }


    private void initData(){

        Wydawnictwo operon = new Wydawnictwo("Operon");
        Ksiazki pTadeusz = new Ksiazki("Pan Tadeusz", 12345678);
        Czytelnicy mateusz = new Czytelnicy("Mateusz", "Kowalski");
        Pisarze aMickiewicz = new Pisarze("Mickiewicz", "Adam", "Romantyzm");

        aMickiewicz.getKsiazki().add( pTadeusz);
        pTadeusz.getPisarze().add(aMickiewicz);
        pTadeusz.setWydawnictwa(operon);
        mateusz.getKsiazki().add(pTadeusz);
        
    }
}
