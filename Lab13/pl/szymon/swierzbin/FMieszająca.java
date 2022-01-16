package pl.szymon.swierzbin;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FMieszająca {
    private HashMap<Integer, HashSet<String>> code;

    public FMieszająca(String plik) throws FileNotFoundException {
        this.code = new HashMap<>();
        File file = new File(plik);
        Scanner scan = new Scanner(file);
        while (scan.hasNext()) {
            String Word = scan.next();
            boolean i = false;
            for (int z : this.code.keySet()) {
                if (Word.hashCode() == z) {
                    i = true;
                    break;
                }
            }
            if (!i) {
                this.code.put(Word.hashCode(), new HashSet<>());
            }
            this.code.get(Word.hashCode()).add(Word);
        }
        this.wypisz();
    }

    public void wypisz() {
        for (int x : this.code.keySet()) {
            if (this.code.get(x).size() > 1) {
                System.out.print(x + ":");
                for (String word : this.code.get(x)) {
                    System.out.print(" " + word);
                }
                System.out.println();
            }
        }
    }
}
