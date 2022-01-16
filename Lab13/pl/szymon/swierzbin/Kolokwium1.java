package pl.szymon.swierzbin;

import java.util.*;

public class Kolokwium1 {
    public Kolokwium1() {
        this.oceny = new TreeMap<>();
    }

    public void zmiana(String nazwisko, String ocena) {
        for (String naz : this.oceny.keySet()) {
            if (naz.equals(nazwisko)) {
                this.oceny.replace(nazwisko, ocena);
            }
        }
    }

    public void dodaj(String nazwisko, String ocena) {
        this.oceny.put(nazwisko, ocena);
    }

    public void usun(String nazwisko) {
        for (String naz : this.oceny.keySet()) {
            if (naz.equals(nazwisko)) {
                this.oceny.remove(nazwisko);
            }
        }
    }

    public void wypisz() {
        for (String uczen : this.oceny.keySet()) {
            System.out.println(uczen + " --> " + this.oceny.get(uczen));
        }
        System.out.println();
    }

    private TreeMap<String, String> oceny;
}