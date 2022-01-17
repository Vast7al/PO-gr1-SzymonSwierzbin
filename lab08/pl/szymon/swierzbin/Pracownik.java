package pl.szymon.swierzbin;


import java.time.LocalDate;

public class Pracownik extends Osoba{
    private LocalDate DataZatrudnienia;
    private double pobory;
    public Pracownik(String nazwisko, String[] Imie, LocalDate Dataurodzenia, boolean plec, double pobory, LocalDate DZ)
    {
        super(nazwisko,Imie,Dataurodzenia,plec);
        this.pobory = pobory;
        this.DataZatrudnienia=DZ;
    }

    public double getPobory()
    {
        return pobory;
    }

    public LocalDate getDataZatrudnienia() {
        return DataZatrudnienia;
    }

    public String getOpis()
    {
        return String.format("pracownik zatrudniony %s z pensją %.2f zł", this.DataZatrudnienia.toString(),this.pobory);
    }
}