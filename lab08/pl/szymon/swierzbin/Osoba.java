package pl.szymon.swierzbin;
import java.time.LocalDate;

public abstract class Osoba {
    public Osoba(String nazwisko, String[] Imie, LocalDate Dataurodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona=Imie;
        this.DataUrodzenia=Dataurodzenia;
        this.plec=plec;
    }

    public abstract String getOpis();

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona() {
        return imiona;
    }

    public LocalDate getDataUrodzenia() {
        return DataUrodzenia;
    }

    public boolean isPlec() {
        return plec;
    }

    private String nazwisko;
    private String[] imiona;
    private LocalDate DataUrodzenia;
    private boolean plec;
}