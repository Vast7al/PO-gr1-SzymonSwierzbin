package pl.szymonswierzbin.zadanie 4;

public class Osoba {

    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(int rokUrodzenia, String nazwisko) {
        this.rokUrodzenia = rokUrodzenia;
        this.nazwisko = nazwisko;
    }
    public int RokUrodzenia() {
        return rokUrodzenia;
    }
    public String Nazwisko() {
        return nazwisko;
    }

    public String Printed(){
        return nazwisko + ", " + rokUrodzenia;

    }
}