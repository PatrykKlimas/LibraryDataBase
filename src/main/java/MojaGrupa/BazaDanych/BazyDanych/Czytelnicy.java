package MojaGrupa.BazaDanych.BazyDanych;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Czytelnicy {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imie;
    private String naziwsko;


    //kazdy czytelnik ma wypozyczone jakies ksiazki

    @OneToMany
    private Set<Ksiazki> ksiazki= new HashSet<>();

    public Czytelnicy(String imie, String naziwsko){
        this.imie=imie;
        this.naziwsko=naziwsko;
    }

    public Czytelnicy(String imie, String naziwsko, Set<Ksiazki> ksiazki){
        this.imie=imie;
        this.naziwsko=naziwsko;
        this.ksiazki=ksiazki;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNaziwsko() {
        return naziwsko;
    }

    public void setNaziwsko(String naziwsko) {
        this.naziwsko = naziwsko;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Ksiazki> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(Set<Ksiazki> ksiazki) {
        this.ksiazki = ksiazki;
    }

    @Override
    public String toString(){
        return "Czytelnik("+
                "Imie: " + imie +
                ", Nazwisko:"+naziwsko+
                ", ID: "+id+")";
    }
}
