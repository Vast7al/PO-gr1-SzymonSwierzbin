package pl.szymon.swierzbin;
import java.time.LocalDate;
public class Student extends Osoba{
    private double sredniaOcen;
    private String kierunek;
    public Student(String nazwisko, String[] Imie, LocalDate Dataurodzenia, boolean plec, String kierunek, double SO)
    {
        super(nazwisko,Imie,Dataurodzenia,plec);
        this.kierunek = kierunek;
        this.sredniaOcen=SO;
    }
    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }
    public String getOpis()
    {
        return "Kierunek--> " + this.kierunek + "Średnia--> "+this.sredniaOcen;
    }
}