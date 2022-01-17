package pl.szymon.swierzbin;

import java.time.*;

public class TestBrakujacych {
    public static void main(String[] args) {
        Osoba[] grupaOsob = new Osoba[2];
        grupaOsob[0] = new Pracownik("Marzecki", new String[] { "Piotr" }, LocalDate.of(2001, 6, 4), false, 25000,
                LocalDate.of(2015, 4, 1));
        grupaOsob[1] = new Student("Polkowska", new String[] { " Małgorzata " }, LocalDate.of(1990, 8, 12), true,
                " Geopolityka ", 3.3);

        for (Osoba z : grupaOsob) {
            for (String i : z.getImiona()) {
                System.out.print(i + " ");
            }
            System.out.print(
                    z.getNazwisko() + ": " + z.getOpis() + " DataUrodzenia : " + z.getDataUrodzenia() + ", Płeć: ");
            if (z.isPlec()) {
                System.out.println("Kobieta");
            } else {
                System.out.println("Mężczyzna");
            }
        }
    }
}
