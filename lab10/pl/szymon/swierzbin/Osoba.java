package pl.szymon.swierzbin;

import java.time.LocalDate;

public class Osoba implements Cloneable,Comparable<Osoba>{
       public Osoba(String nazwisko2, LocalDate DataUrodzenia2){
           this.nazwisko=nazwisko2;
           this.DataUrodzenia=DataUrodzenia2;
       }
       public LocalDate getDataUrodzenia(){
           return this.DataUrodzenia;
       }
       public String getNazwisko(){
           return this.nazwisko;
       }
       public String toString(){
           return this.getClass().getSimpleName()+" [ "+this.nazwisko+", "+this.DataUrodzenia.toString()+" ] ";
       }
       public boolean equals(Object obj){
       Osoba osoba=(Osoba) obj;
       return(osoba.DataUrodzenia.equals(this.DataUrodzenia)&&osoba.nazwisko.equals(this.nazwisko));
       }
       public int compareTo(Osoba x){
           int porownaj_nazwisko=this.nazwisko.compareTo(x.nazwisko);
           if(porownaj_nazwisko==0){
               return this.DataUrodzenia.compareTo(x.DataUrodzenia);
           }
           else{
               return porownaj_nazwisko;
           }
       }
    












       private LocalDate DataUrodzenia;
       private String nazwisko;
}