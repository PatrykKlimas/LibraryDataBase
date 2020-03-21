package MojaGrupa.BazaDanych.BazyDanych;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Wydawnictwo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nazwa;


    //Wydawnictwo wydaje pewna ksiazki

    @OneToMany
    private Set<Ksiazki> ksiazki = new HashSet<>();

    public Wydawnictwo( String nazwa){
        this.nazwa = nazwa;
    }

    public Wydawnictwo( String nazwa, Set<Ksiazki> ksiazki){
        this.nazwa = nazwa;
        this.ksiazki = ksiazki;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Set<Ksiazki> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(Set<Ksiazki> ksiazki) {
        this.ksiazki = ksiazki;
    }

    @Override
    public String toString(){
        return "Wydawnictwo " + nazwa;
    }
}
