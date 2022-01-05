package pl.szymon2.swierzbin;

public class Student extends Osoba {

  public Student(String nazwisko, int rokUrodzenia, String kierunek) {
    super(nazwisko, rokUrodzenia);
    this.kierunek = kierunek;
  }

  public String getKierunek() {
    return this.kierunek;
  }

  public String toString() {
    return super.toString() + " " + this.kierunek;
  }

  private String kierunek;
}
