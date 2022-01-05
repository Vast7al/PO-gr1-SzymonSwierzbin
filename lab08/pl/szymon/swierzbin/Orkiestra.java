package pl.szymon.swierzbin;

import pl.szymon.swierzbin.Instrumenty.Instrument;
import pl.szymon.swierzbin.Instrumenty.Skrzypce;
import pl.szymon.swierzbin.Instrumenty.Fortepian;
import pl.szymon.swierzbin.Instrumenty.Flet;
import java.util.ArrayList;
import java.time.LocalDate;

public class Orkiestra {

    public static void main(String[] args) {

        ArrayList<Instrument> orchestry = new ArrayList<Instrument>();
        orchestry.add(new Skrzypce("Michalina", LocalDate.now()));
        orchestry.add(new Flet("Maciej", LocalDate.now()));
        orchestry.add(new Fortepian("Zuzanna", LocalDate.now()));
        orchestry.add(new Flet("Piotr", LocalDate.now()));

        for (int i = 0; i <= orchestry.size() - 1; i++) {
            orchestry.get(i).dzwiek();

        }

    }
}