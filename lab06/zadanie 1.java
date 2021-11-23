public class Main {
    public static void main(String[] args) {

        Rozliczenie saver1 = new Rozliczenie(2000);
        saver1.setRSP(0.04);
        System.out.println(saver1);
        System.out.println(saver1.Odsetki());
        System.out.println(saver1);

        Rozliczenie saver2 = new Rozliczenie(3000);
        saver2.setRSP(0.04);
        System.out.println(saver2);
        System.out.println(saver2.Odsetki());
        System.out.println(saver2);

        saver1.setRSP(0.05);
        saver2.setRSP(0.05);
        System.out.println(saver1.Odsetki());
        System.out.println(saver2.Odsetki());
        System.out.println(saver1);
        System.out.println(saver2);

    }
}

class Rozliczenie{
    double RSP;
    double bilans;
    public Rozliczenie(double bilans){
        this.bilans = bilans;

    }

    public double Odsetki(){
        double Odsetki = (bilans*RSP)/12;
        bilans += Odsetki;
        return Odsetki;
    }
    //RSP-Roczna stopa procentowa
    public void setRSP(double nowa){
        RSP = nowa;
    }
    public String toString() {
        return "RachunekBankowy{" +
                "Roczna stopa procentowa =" + RSP +
                ", bilans =" + bilans +
                '}';
    }

}