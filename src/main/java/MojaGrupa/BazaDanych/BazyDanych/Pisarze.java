package MojaGrupa.BazaDanych.BazyDanych;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Pisarze {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String imie;
    private String nazwisko;
    private String epoka;

    @ManyToMany
    private Set<Ksiazki> ksiazki = new HashSet<>();

    public Pisarze (  String imie, String nazwisko, String epoka ){
        this.nazwisko = nazwisko;
        this.imie=imie;
        this.epoka=epoka;
    }

    public Pisarze (  String imie, String nazwisko, String epoka, Set<Ksiazki> ksiazki){
        this.nazwisko = nazwisko;
        this.imie=imie;
        this.epoka=epoka;
        this.ksiazki = ksiazki;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEpoka() {
        return epoka;
    }

    public void setEpoka(String epoka) {
        this.epoka = epoka;
    }

    public Set<Ksiazki> getKsiazki() {
        return ksiazki;
    }

    public void setKsiazki(Set<Ksiazki> ksiazki) {
        this.ksiazki = ksiazki;
    }

    @Override
    public String toString(){
        return "Pisarz(" +
                " Imie: "+ imie+
                ", Naziwsko: " + nazwisko +
                ", Epoka: " + epoka + ")";
    }
}
