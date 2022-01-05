package pl.szymon.swierzbin.Instrumenty;

import java.time.LocalDate;

public class Flet extends Instrument {

    public Flet(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public void dzwiek() {
        System.out.println("dzwiekFleta.mp3");

    }
}