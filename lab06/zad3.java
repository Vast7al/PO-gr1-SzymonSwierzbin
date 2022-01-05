import java.time.LocalDate;
import java.util.*;

public class zad3 {
    public zad3(String nazwisko, double pobory, int rok, int miesiac, int dzien) {
        this.nazwisko = nazwisko;
        this.pobory = pobory;

        GregorianCalendar calendar = new GregorianCalendar(rok, miesiac - 1, dzien);

        this.dataZatrudnienia = LocalDate.of(rok, miesiac, dzien);
    }

    public String nazwisko() {
        return this.nazwisko;
    }

    public double pobory() {
        return this.pobory;
    }

    public LocalDate dataZatrudnienia() {
        return this.dataZatrudnienia;
    }

    public void zwiekszPobory(double procent) {
        double podwyzka = this.pobory * procent / 100;
        this.pobory += podwyzka;
    }

    public static void main(String[] args) {
        zad3[] personel = new zad3[3];
        personel[0] = new zad3("Karol Krakowski", 48000, 2000, 4, 13);
        personel[1] = new zad3("Jerzy Zagloba", 52000, 2001, 7, 12);
        personel[2] = new zad3("Gabriel Belmond", 38000, 2004, 1, 12);
        for (zad3 e : personel) {
            e.zwiekszPobory(20);
        }
        for (zad3 e : personel) {
            System.out.print("nazwisko = " + e.nazwisko() + "\tpobory = " + e.pobory());
            System.out.printf("\tdataZatrudnienia = %tF\n", e.dataZatrudnienia());
        }
        System.out.println();

    }

    private String nazwisko;
    private double pobory;
    private LocalDate dataZatrudnienia;
}
