package pl.szymon.swierzbin;

public class Ksiazka extends Autor {
    public Ksiazka(String imie, String email,char plec,String tytul,double cena){
        super(imie,email,plec);
        this.tytul=tytul;
        this.cena=cena;
    }
    public String getTytul() {
        return tytul;
    }
    public Autor getAutor(){
        return autor;
    }
    public double getCena(){
        return cena;
    }
    public void setTytul(String tytul) {
        this.tytul =tytul;
    }
    public void setAutor(Autor autor){
        this.autor=autor;
    }
    public void setCena(double cena){
        this.cena=cena;
    }
    public int compareTo(Ksiazka book){
        int wynik=this.getImie().compareTo(book.getImie());
        if (wynik==0){
            wynik=this.tytul.compareTo(book.tytul);
        }
        if (wynik==0){
            wynik=Double.compare(this.cena,book.cena);
        }
        return wynik;
    }
    public String toString() {
        return this.getClass().getSimpleName() + "[" + getImie() + "," + getEmail() + "," + getPlec() +","+this.tytul+","+this.cena+"]";
    }
    private String tytul;
    private Autor autor;
    private double cena;
}
