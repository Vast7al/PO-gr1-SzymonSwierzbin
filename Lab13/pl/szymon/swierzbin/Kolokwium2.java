package pl.szymon.swierzbin;

import java.util.TreeMap;

public class Kolokwium2 {
    private TreeMap<Student, String> oceny;
    private TreeMap<Integer, Student> UnikalnyIdentyfikator;

    public Kolokwium2() {
        this.UnikalnyIdentyfikator = new TreeMap<>();
        this.oceny = new TreeMap<>();
    }

    public void dodaj(Student student, String ocena) {
        this.oceny.put(student, ocena);
        this.UnikalnyIdentyfikator.put(student.getId(), student);
    }

    public void usun(int id) {
        for (int z : this.UnikalnyIdentyfikator.keySet()) {
            if (z == id) {
                this.oceny.remove(this.UnikalnyIdentyfikator.get(id));
            }
        }
        this.UnikalnyIdentyfikator.remove(id);
    }

    public void zmien(int id, String ocena) {
        for (Student student : this.oceny.keySet()) {
            if (student.getId() == id) {
                this.oceny.replace(this.UnikalnyIdentyfikator.get(id), ocena);
            }
        }
    }

    public void wypisz() {
        for (Student student : this.oceny.keySet()) {
            System.out.println(student.getNazwisko() + "  " + student.getImie() + " " + student.getId() + " : "
                    + this.oceny.get(student));
        }
        System.out.println();
    }
}
