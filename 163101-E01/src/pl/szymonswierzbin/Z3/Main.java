package pl.szymonswierzbin.Z3;

import java.io.File;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        for(var item:NoExtension.filesNoExtension("E:/Major")){
            System.out.println(item);
        }
    }
}
