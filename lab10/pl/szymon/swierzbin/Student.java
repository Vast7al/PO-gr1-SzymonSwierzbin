package pl.szymon.swierzbin;
import java.time.LocalDate;
public class Student extends Osoba implements Cloneable, Comparable<Osoba>{
    public Student(String nazwisko2, LocalDate DataUrodzenia2, double sOcen){
        super(nazwisko2,DataUrodzenia2);
        this.sredniaOcen=sOcen;
    }
    public String toString(){
    return this.getClass().getSimpleName()+"["+this.getNazwisko()+", "+this.getDataUrodzenia().toString()+", "+this.sredniaOcen+"]";
    }
    public int compareTo(Osoba o) {
        int last=super.compareTo((o));
        if((o instanceof Student)&&(last==0)){
            return -(int)Math.ceil(this.sredniaOcen-((Student) o).sredniaOcen);
        }
        return last;
    }



    private double sredniaOcen;
}
