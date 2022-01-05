package pl.szymon.swierzbin.Instrumenty;

import java.time.LocalDate;

public class Skrzypce extends Instrument {
    public Skrzypce(String producent, LocalDate rokProdukcji) {
        super(producent, rokProdukcji);
    }

    public void dzwiek() {
        System.out.println("DzwiekSkrzypc.mp3");
    }
}
