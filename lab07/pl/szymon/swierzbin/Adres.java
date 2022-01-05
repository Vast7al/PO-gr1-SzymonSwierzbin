package pl.szymon.swierzbin;

public class Adres {
    public Adres(String ulica, int numer_domu, String numer_mieszkania, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy) {
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }

    public void pokaz() {
        System.out.print(" Kod pocztowy--> " + this.kod_pocztowy + " Miasto---> " + this.miasto);
        System.out.print(this.ulica + " " + this.numer_domu);
        if (!this.numer_mieszkania.equals("")) {
            System.out.print("/" + this.numer_mieszkania);
        }
    }

    public boolean przed(Adres a1, Adres a2) {
        boolean spr = false;
        if (a1.kod_pocztowy == a2.kod_pocztowy) {
            spr = true;
        }
        return spr;
    }

    private String ulica;
    private int numer_domu;
    private String numer_mieszkania = "";
    private String miasto;
    private String kod_pocztowy;
}
