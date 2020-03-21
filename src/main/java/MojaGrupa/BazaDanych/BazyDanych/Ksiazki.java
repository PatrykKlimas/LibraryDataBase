package MojaGrupa.BazaDanych.BazyDanych;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ksiazki {

    @Id
    private long ISBN;
    private String tytul;


    // Niektore ksiazki np naukowe maja wiecej niz jednego autora
    @ManyToMany(mappedBy = "ksiazki")
    private Set<Pisarze> pisarze = new HashSet<>();

    // Kazda jest wydawana przez pewne wydawnictwa literacki

    @ManyToOne
    private Wydawnictwo wydawnictwo;

    //Kazda ksiazka jest czytana przez pewnych czytelnikow
    @ManyToMany (mappedBy = "ksiazki")
    private Set<Czytelnicy> czytelnicy = new HashSet<>();

    public Ksiazki(String tytul, long ISBN) {
        this.tytul = tytul;
        this.ISBN = ISBN;
    }

    public Ksiazki(String tytul, long ISBN, Wydawnictwo wydawnictwo){
        this.tytul=tytul;
        this.ISBN=ISBN;
        this.wydawnictwo=wydawnictwo;
    }

    public Ksiazki(String tytul, long ISBN, Wydawnictwo wydawnictwo, Set<Czytelnicy> czytelnicy){
        this.tytul=tytul;
        this.ISBN=ISBN;
        this.wydawnictwo=wydawnictwo;
        this.czytelnicy=czytelnicy;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }


    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public Set<Pisarze> getPisarze() {
        return pisarze;
    }

    public void setPisarze(Set<Pisarze> pisarze) {
        this.pisarze = pisarze;
    }

    public Wydawnictwo getWydawnictwo() {
        return wydawnictwo;
    }

    public void setWydawnictwa(Wydawnictwo wydawnictwo) {
        this.wydawnictwo = wydawnictwo;
    }

    public Set<Czytelnicy> getCzytelnicy() {
        return czytelnicy;
    }

    public void setCzytelnicy(Set<Czytelnicy> czytelnicy) {
        this.czytelnicy = czytelnicy;
    }

    @Override
    public String toString(){
        return "Ksiazka("+
                "Tytuł: "+ tytul +
                ", ISBN: " + ISBN + ")";
    }
}
