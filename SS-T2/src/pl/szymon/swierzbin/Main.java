package pl.szymon.swierzbin;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Autor> autorzy = new ArrayList<>();
        autorzy.add(new Autor("Krolewski", "Krolewski@gmail.com", 'M'));
        autorzy.add(new Autor("Krolewski","Krolewski2@gmail.com", 'M'));
        autorzy.add(new Autor("Anielewska","Anielewska@gmail.com", 'K'));
        autorzy.add(new Autor("Anielewska","Anielewska2@gmail.com", 'K'));


        ArrayList<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Ksiazka("Padecki", "marzecki@gmail.com", 'M',"Opowieści z narnii" ,85));
        ksiazki.add(new Ksiazka("Dostojewski", "Dostojewski@gmail.com", 'M',"Mroczna wieza" ,120));
        ksiazki.add(new Ksiazka("Korpowski", "Korpowski@gmail.com", 'M',"Metro2033" ,144));
        ksiazki.add(new Ksiazka("Przemielewska", "Przemielewska@gmail.com", 'K',"Katakumby" ,150));
        System.out.println(autorzy);
        Collections.sort(ksiazki);
        System.out.println(ksiazki);
        LinkedList<String>books=new LinkedList<>();
        books.add("Aladyn");
        books.add("Potop");
        books.add("Wesele");
        books.add("Piotrus pan");
        redukuj(books);

    }
    public static void redukuj(LinkedList <String>books){
        Scanner scn=new Scanner(System.in);
        System.out.println("Podaj n");
        Integer n=scn.nextInt();
        int s=books.size();
        for(int i=0;i<books.size();i++){
        if(i==n){
            books.remove(i);
            System.out.println(books);
        }
        if(n>s){
            System.out.println("Podano za duze n");
            break;
        }
            }
        }
    }
