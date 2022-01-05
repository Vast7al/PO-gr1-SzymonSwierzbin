public class Osoba {
    public class Student {
        private String nazwisko;
        private int rokUrodzenia;
        private String kierunek;

        public Student(String nazwisko, int rokUrodzenia, String kierunek) {
            this.nazwisko = nazwisko;
            this.rokUrodzenia = rokUrodzenia;
            this.kierunek = kierunek;
        }

        public String toString() {
            return this.nazwisko + " " + this.rokUrodzenia + " " + this.kierunek;
        }

        public String getKierunek() {
            return this.kierunek;
        }
    }

    public class Nauczyciel {
        private String nazwisko;
        private int rokUrodzenia;
        private int pensja;

        public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
            this.nazwisko = nazwisko;
            this.rokUrodzenia = rokUrodzenia;
            this.pensja = pensja;
        }

        public String toString() {
            return this.nazwisko + " " + this.rokUrodzenia + " " + this.pensja;
        }

        public int getPensja() {
            return this.pensja;
        }

    }

    public static void main(String args[]) {
        Osoba s1 = new Osoba();
        Osoba.Student s2 = s1.new Student("Kozuchowski", 1991, "Informatyka");
        Osoba n1 = new Osoba();
        Osoba.Nauczyciel n2 = n1.new Nauczyciel("Malinowska", 1966, 2700);
        System.out.println(s2);
        System.out.println(n2);
    }
}
