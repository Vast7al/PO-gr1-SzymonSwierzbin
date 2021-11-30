package pl.szymonswierzbin.zadanie 4;

public class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, int rokUrodzenia, String kierunek) {
        super(nazwisko, rokUrodzenia);
        this.kierunek = kierunek;

    }

    public String Kierunek() {
        return kierunek;
    }


}
