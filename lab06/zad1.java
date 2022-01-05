
public class zad1 {
    public static void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        saver1.setRocznaStopaProcentowa(0.04);
        System.out.println(saver1);
        System.out.println("Miesieczne odsetki--> " + saver1.obliczMiesieczneOdsetki());
        System.out.println(saver1);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        saver2.setRocznaStopaProcentowa(0.05);
        System.out.println(saver2);
        System.out.println("Miesieczne odsetki--> " + saver2.obliczMiesieczneOdsetki());
        System.out.println(saver2);

    }
}

class RachunekBankowy {
    double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo) {
        this.saldo = saldo;
    }

    public double obliczMiesieczneOdsetki() {
        double odsetki = (saldo * rocznaStopaProcentowa) / 12;
        saldo += odsetki;
        return odsetki;
    }

    public void setRocznaStopaProcentowa(double nowa) {
        rocznaStopaProcentowa = nowa;
    }

    public String toString() {
        return "RachunekBankowy {" +
                "rocznaStopaProcentowa= " + rocznaStopaProcentowa +
                ", saldo= " + saldo +
                '}';
    }

    public void main(String[] args) {
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        saver1.setRocznaStopaProcentowa(0.04);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        saver2.setRocznaStopaProcentowa(0.04);
        System.out.println(saver1);
        System.out.println(saver1.obliczMiesieczneOdsetki());
        System.out.println(saver1);
        System.out.println(saver2);
        System.out.println(saver2.obliczMiesieczneOdsetki());
        System.out.println(saver2);
    }
}
