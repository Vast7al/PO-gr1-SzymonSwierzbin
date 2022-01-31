package pl.szymonswierzbin.Z1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
public void main(String[] args) throws Exception{
    ArrayList<Integer> list=new ArrayList<Integer>(
     Arrays.asList(1,2,3,4,5,6,7));
    ArrayList<Integer> list2=new ArrayList<Integer>(
     Arrays.asList(1,2,3,2,1));
    if (Palindrom.jestPalindronem(list)) {
        System.out.println("Jest palindronem");
        }
    else{
        System.out.println("Nie jest");
    }
    if (Palindrom.jestPalindronem(list2)) {
        System.out.println("Jest palindronem");
    }
    else{
        System.out.println("Nie jest");
    }
    ArrayList<LocalTime> lista3=new ArrayList<LocalTime>(
            Arrays.asList(
                    LocalTime.of(10,43,12),
                    LocalTime.of(10,11,12),
                    LocalTime.of(10,43,12)));
    ArrayList<LocalTime> lista4=new ArrayList<LocalTime>(
            Arrays.asList(
            LocalTime.of(10,43,12),
            LocalTime.of(10,11,12),
            LocalTime.of(10,43,11)));
    if (Palindrom.jestPalindronem(lista3)) {
        System.out.println("Jest palindronem");
    }
    else{
        System.out.println("Nie jest");
    }
    if (Palindrom.jestPalindronem(lista4)) {
        System.out.println("Jest palindronem");
    }
    else{
        System.out.println("Nie jest");
    }
}
}
