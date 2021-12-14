package pl.szymonswierzbin;
import pl.szymonswierzbin.Instrumenty.Instrument;
import pl.szymonswierzbin.Instrumenty.Skrzypce;
import pl.szymonswierzbin.Instrumenty.Fortepian;
import pl.szymonswierzbin.Instrumenty.Flet;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {


        ArrayList<Instrument> orchestry = new ArrayList<Instrument>();
        orchestry.add(new Skrzypce("Michalina", LocalDate.now()));
        orchestry.add(new Flet("Maciej", LocalDate.now()));
        orchestry.add(new Fortepian("Zuzanna", LocalDate.now()));
        orchestry.add(new Flet("Piotr", LocalDate.now()));

        for(int i = 0; i <= orchestry.size()-1; i++){
            orchestry.get(i).dzwiek();

        }

    }
}