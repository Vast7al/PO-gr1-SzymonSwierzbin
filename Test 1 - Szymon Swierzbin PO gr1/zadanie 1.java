package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        //1. Wczytaæ liczbê naturaln¹ n, a nastêpnie wczytuj¹c kolejno n liczb naturalnych,
        //        //napisz publiczn¹ statyczn¹ metodê findPrimes(int[] list) obliczaj¹c¹, ile liczb
        //        //pierwszych jest wœród nich.
        //zadanie 1
        //liczba naturalna n = x
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int tablica[] = new int[x];
        Random r = new Random();
        for (int i = 0; i <= x-1; i++) {
            tablica[i] = r.nextInt(100) + 1;
            System.out.println(tablica[i]);
            if (tablica[i] % x == 0) {
                System.out.println("Liczba pierwsza -> " + tablica[i]);
            }
        }
    }
}