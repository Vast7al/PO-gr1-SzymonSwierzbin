package pl.szymon.swierzbin;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Kolokwium1 ProgramowanieObiektowe = new Kolokwium1();
        ProgramowanieObiektowe.dodaj("Malucki", "dst");
        ProgramowanieObiektowe.dodaj("Swierzbin", "dst+");
        ProgramowanieObiektowe.dodaj("Palecki", "bdb");
        ProgramowanieObiektowe.dodaj("Pioterski", "db+");
        ProgramowanieObiektowe.wypisz();
        // ProgramowanieObiektowe.usun("Pioterski");
        ProgramowanieObiektowe.zmiana("Palecki", "dst");
        ProgramowanieObiektowe.wypisz();
        Kolokwium2 ProgramowanieObiektowe2 = new Kolokwium2();
        ProgramowanieObiektowe2.dodaj(new Student("Szymon", "Swierzbin", 4), "bdb");
        ProgramowanieObiektowe2.dodaj(new Student("Patryk", "Zarzecki", 3), "db");
        ProgramowanieObiektowe2.dodaj(new Student("Albert", "Padecki", 1), "dst");
        ProgramowanieObiektowe2.dodaj(new Student("Tomasz", "Rokowski", 2), "ndst");
        ProgramowanieObiektowe2.wypisz();
        ProgramowanieObiektowe2.usun(3);
        ProgramowanieObiektowe2.zmien(2, "dst+");
        ProgramowanieObiektowe2.wypisz();

        // FMieszająca funkcja= new FMieszająca("alice30.txt");
    }
}