package pl.szymon2.swierzbin;

public class Osoba {
    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String toString() {
        return this.nazwisko + " " + this.rokUrodzenia;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public int getrokUrodzenia() {
        return this.rokUrodzenia;
    }

    private String nazwisko;
    private int rokUrodzenia;
}
