package pl.szymon.swierzbin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;

public class zadanie3 {
    public static void main(String[] args) {
        ArrayList<Osoba> Osoby = new ArrayList<>(6);
        Osoby.add(new Osoba("Makowski", LocalDate.of(1977, 2, 4)));
        Osoby.add(new Osoba("Falczyk", LocalDate.of(1986, 7, 1)));
        Osoby.add(new Osoba("Polkowska", LocalDate.of(2001, 2, 8)));
        Osoby.add(new Osoba("Matecki", LocalDate.of(1944, 12, 24)));
        Osoby.add(new Osoba("Opolski", LocalDate.of(1989, 6, 8)));
        Osoby.add(new Osoba("Brzozowski", LocalDate.of(1979, 3, 1)));
        System.out.println(Osoby.get(0).equals(Osoby.get(2)));
        System.out.println(Osoby.get(0).equals(Osoby.get(3)));
        System.out.println(Osoby.get(0));
        System.out.println(Osoby);
        Collections.sort(Osoby);
        System.out.println(Osoby);
        ///////////////////////// zadanie 2.
        ArrayList<Osoba> Studenci = new ArrayList<>(6);
        Studenci.add(new Student("Falczyk", LocalDate.of(1986, 7, 1), 3.22));
        Studenci.add(new Student("Polkowska", LocalDate.of(2001, 2, 8), 4.76));
        Studenci.add(new Student("Matecki", LocalDate.of(1944, 12, 24), 3.1));
        Studenci.add(new Student("Brzozowski", LocalDate.of(1979, 3, 1), 4.2));
        Studenci.add(new Student("Opolski", LocalDate.of(1989, 6, 8), 3.13));
        Studenci.add(new Student("Makowski", LocalDate.of(1977, 2, 4), 3.55));
        System.out.println(Studenci);
        Collections.sort(Studenci);
        System.out.println(Studenci);
        ///////////////////////// zadanie 3.
        if (args.length != 0) {
            ArrayList<String> zadanie3 = new ArrayList<>();
            try {
                File Plik = new File(args[0]);
                Scanner zczytywanie = new Scanner(Plik);
                while (zczytywanie.hasNextLine()) {
                    zadanie3.add(zczytywanie.nextLine());
                }
                zczytywanie.close();
            } catch (FileNotFoundException e) {
                System.out.println("Brak takiego pliku");
                e.printStackTrace();
            }

            System.out.println(zadanie3);
            Collections.sort(zadanie3);
            System.out.println(zadanie3);
        }

    }

}
