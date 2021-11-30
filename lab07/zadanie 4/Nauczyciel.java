package pl.szymonswierzbin.zadanie 4;

public class Nauczyciel extends Osoba {

    private double pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, double pensja) {
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public double Pensja() {
        return pensja;
    }
}