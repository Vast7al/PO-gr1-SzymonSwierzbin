package pl.szymon2.swierzbin;

public class Nauczyciel extends Osoba {
    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
        super(nazwisko, rokUrodzenia); // super pobiera z klasy Osoba wartosci nazwisko i rok urodzenia
        this.pensja = pensja;
    }

    public int getPensja() {
        return this.pensja;
    }

    public String toString() {
        return super.toString() + " " + this.pensja; // tutaj dajemy te swoje wartosci w super i uzywamy na nie to
                                                     // String;
    }

    private int pensja;

}
