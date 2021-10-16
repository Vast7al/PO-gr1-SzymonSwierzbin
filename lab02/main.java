package pl.edu.uwm.wmii.kotewa.laboratorium00;

import java.util.Scanner;

import static java.lang.Math.*;

class Main {
    public Main() {
    }

    public static void main(String[] args) {
        // zadanie 1 a)
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n=scan.nextInt();
        // int wynik=0;
        // for (int i=1;i<=n;i++)
        // {
        // wynik+=i;
        // }
        // System.out.println(wynik);
        // zadanie 1 b)
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n=scan.nextInt();
        // int wynik2=1;
        // for (int i=1;i<=n;i++)
        // {
        // wynik2*=i;
        // }
        // System.out.println(wynik2);
        // zadanie 1 c)
        // double wynik;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // wynik = 0;
        // for (int i = 0; i <= liczby.length - 1; i++) {
        // liczby[i] = scn.nextDouble();
        // wynik += abs(liczby[i]);
        // }
        // System.out.println(wynik);
        // zadanie 1 d)
        // double wynik;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // wynik = 0;
        // for(int i = 0; i<=liczby.length-1; i++) {
        // liczby[i] = scn.nextDouble();
        // wynik+=sqrt(abs(liczby[i]));
        // }
        // System.out.println(wynik);
        // zadanie 1 e)
        // double wynik;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // wynik = 1;
        // for(int i = 0; i<=liczby.length-1; i++) {
        // liczby[i] = scn.nextDouble();
        // wynik*=abs(liczby[i]);
        // }
        // System.out.println(wynik);
        // zadanie 1 f)
        // double wynik;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // wynik = 0;
        // for(int i = 0; i<=liczby.length-1; i++) {
        // liczby[i] = scn.nextDouble();
        // wynik+=pow(liczby[i], 2);
        // }
        // System.out.println(wynik);
        // zadanie 1 g)
        // double wynik;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // wynik = 0;
        // double wynik2 = 1;
        // for(int i = 0; i<=liczby.length-1; i++) {
        // liczby[i] = scn.nextDouble();
        // wynik+=liczby[i];
        // wynik2*=liczby[i];
        // }
        // System.out.println(wynik + "\n"+wynik2);
        // zadanie 1 h)
        // double wynik;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // wynik = 0;
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // }
        // for(int i = 0; i<=liczby.length-1; i++) {
        // wynik+=pow(-1, i+1)*liczby[i];
        // }
        // System.out.println(wynik);
        // zadanie 1 i)
        // double wynik;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // wynik = 0;
        // int factorial = 1;
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // }
        // for(int i = 0; i<=liczby.length-1; i++) {
        //
        // factorial*=i+1;
        // wynik+=(pow(-1, i)*liczby[i])/factorial;
        // }
        // System.out.println(wynik);
        // zadanie 1.2
        // double[] liczby2 = new double[n];
        //
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // }
        // double jeden = liczby[0];
        // for(int i = 0; i<=liczby.length-2; i++) {
        //
        // liczby2[i] = liczby[i+1];
        //
        //
        // }
        // System.out.println("\n\n\n");
        // liczby2[liczby2.length-1] = jeden;
        // for(int i = 0; i <=liczby2.length-1; i++){
        // System.out.println(liczby2[i]);
        // }
        // zadanie 2
        // 2.a //sposrod wczytanych są liczbami nieparzystymi
        // int wynik = 0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];

        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(liczby[i] %2 != 0)
        // wynik++;
        // }
        // System.out.println( wynik);
        // zadanie 2.b
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(liczby[i] %3 == 0 && liczby[i]%5!=0)
        // wynik++;
        // }
        // System.out.println( wynik);
        // zadanie 2.c
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(sqrt(liczby[i]) %2 == 0)
        // wynik++;
        // }
        // System.out.println( wynik);
        // zadanie 2.d
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // for(int i = 0; i<=liczby.length-1; i++) {
        // liczby[i] = scn.nextDouble();
        //
        // }
        // for(int i = 1; i<=liczby.length-2; i++){
        // if(liczby[i] < (liczby[i-1]+liczby[i+1])/2)
        // wynik++;
        // }
        // System.out.println(wynik);
        // zadanie 2.e
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // int factorial = 1;
        // for (int i = 0; i <= liczby.length - 1; i++) {
        // liczby[i] = scn.nextDouble();
        //
        //
        // }
        // for (int i = 1; i <= liczby.length - 1; i++) {
        // factorial *= i;
        // if (pow(2, i) <= liczby[i] && liczby[i] <= factorial)
        // wynik++;
        // }
        // System.out.println(wynik);
        // zadanie 2.f
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double[] liczby = new double[n];
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(i+1%2 != 0 && liczby[i]%2==0)
        // wynik++;
        // }
        // System.out.println(wynik);

        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(liczby[i] %2 !=0 && liczby[i] >=0)
        // wynik++;
        // }
        // System.out.println(wynik);
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(abs(liczby[i]) < pow(i, 2))
        // wynik++;
        // }
        // System.out.println(wynik);
        // zadanie 2.2
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(liczby[i] > 0)
        // wynik+=2*liczby[i];
        // }
        // System.out.println(wynik);
        // zadanie 2.3
        // zadanie 2.3
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // int zeros = 0, plus = 0, minus = 0;
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        // if(liczby[i] == 0)
        // zeros++;
        // if(liczby[i] < 0)
        // minus++;
        // if(liczby[i] > 0)
        // plus++;
        // }
        // System.out.println(counter);
        // zadanie 2.4
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // double max, min;
        //
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        //
        // }
        // min = liczby[0];
        // max = liczby[0];
        // for(int i = 0; i<=liczby.length-1;i++)
        // if(i > 0) {
        // if (liczby[i] > max)
        // max = liczby[i];
        // if(liczby[i] < min)
        // min = liczby[i];
        // }
        //
        // System.out.println(min+ "\n" + max);
        // zadanie 2.5
        // int wynik=0;
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Podaj n");
        // int n = scn.nextInt();
        // for(int i = 0; i<=liczby.length-1; i++){
        // liczby[i] = scn.nextDouble();
        //
        // }
        // for(int i = 0; i<=liczby.length-2;i++){
        //
        //
        // if(liczby[i] > 0 && liczby[i+1] > 0)
        // counter++;
        // }
        //
        // System.out.println(counter);

    }
}