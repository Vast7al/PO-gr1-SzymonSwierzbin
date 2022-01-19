package pl.szymon.swierzbin;

public class Autor implements Cloneable, Comparable<Autor> {
    public Autor(String imie, String email, char plec) {
        this.imie = imie;
        this.email = email;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public String getEmail() {
        return email;
    }

    public char getPlec() {
        return plec;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "[" + this.imie + "," + this.email + "," + this.plec + "]";
    }

    public int compareTo(Autor compare) {
        int wynik = this.imie.compareTo(compare.imie);
        if (wynik == 0) {
            wynik = Integer.compare(this.plec, compare.plec);
        }
        return wynik;
    }

    private String imie;
    private String email;
    private char plec;
}



