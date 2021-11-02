package pl.edu.uwm.wmii.kotewa.laboratorium00;
import java.lang.StringBuffer;
import java.io.*;
import java.math.*;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //1.a
//        String s = "abrakadabra";
//        char c = 'e';
//        System.out.println("w napisie " + s+ " znak " + c + " wystepuje razy: " + countChar(s, c));
//        //1.b
//        String s = "abrakadabraabrakadabra";
//        String sub = "abra";
//
//        System.out.println(countSubStr(s, sub));

        //1.c
//
//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//
//        System.out.println(middle(s));
        //1.d

//        Scanner scn = new Scanner(System.in);
//        String s = scn.next();
//        System.out.println(repeat(s, 10));

        //1.e
//        String s = "adamakotaadamakota";
//        String sub = "ada";
//        int[] tab = where(s, sub);
//        for(int i = 0; i <=tab.length-1; i++){
//            System.out.println(tab[i]);
//        }

        //1.f






    }
    public static String change(String str){
        String changed = "";
        StringBuffer sb = new StringBuffer(str);



        return changed;
    }

    public static int[] where(String str, String subStr){
        int n = countSubStr(str, subStr);
        int[] where = new int[n];
        int j = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {
                    where[j] = i;
                    j++;

                }
            }
        }



        return where;
    }


    public static String repeat(String s, int n){
        StringBuffer sb = new StringBuffer();
        String str = s;
        for(int i = 0; i <= n-1; i++){
            sb.append(str);
        }

        return sb.toString();
    }


    public static String middle(String s){

        StringBuffer sb = new StringBuffer(s);
        StringBuffer str = new StringBuffer();
        if (sb.length()%2 == 0){
            str.append(sb.charAt(sb.length()/2-1)).append(sb.charAt(sb.length()/2));
        }
        if(s.length()%2 != 0){
            str.append(sb.charAt(sb.length()/2));
        }

        return str.toString();
    }

    public static int countSubStr(String str, String subStr){
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        if(subStr.length() > str.length())
            return 0;
        for(int i = 0; i <= sb.length()-1; i++){
            if((sb.length()-1) >= i+subStr.length()-1){
                String s = sb.substring(i, i+subStr.length());
                if(s.equals(subStr)) {

                    count++;
                }
            }
        }

        return count;

    }



    public static int countChar(String str, char c){
        int count = 0;
        StringBuffer sb = new StringBuffer(str);
        for(int i = 0; i <= sb.length()-1; i++){
            if(sb.charAt(i) == c)
                count++;
        }


        return count;
    }

}
