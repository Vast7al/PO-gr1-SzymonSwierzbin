package pl.szymonswierzbin.zadanie2;
import java.util.Optional;

public class Adres {
    private String ulica;
    private String miasto;
    private Optional numerMieszkania;
    private String kod;
    private int numerDomu;
    
    

    public Adres(String ulica, int numerDomu, Optional numerMieszkania, String miasto, String kod) {
        this.kod = kod;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.numerDomu = numerDomu;
        this.ulica = ulica;
        
    }

    public Adres(String ulica, int numerDomu, String miasto, String kod) {
        this.kod = kod;
        this.miasto = miasto;
        this.numerDomu = numerDomu;
        this.ulica = ulica;
    }
    public void show(){
        System.out.print(kod + ", " + miasto + "\n"+ ulica + ", "+numerDomu+", "+ nrMieszkania);

        }

    public boolean przed(Adres a1, Adres a2){
        boolean sprawdzenie = false;
        if(a1.kod == a2.kod){
            sprawdzenie =  true;
        }
        return sprawdzenie;
    }



}