package pl.szymonswierzbin.Z1;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Palindrom {
    public static <T extends Comparable> boolean jestPalindronem(ArrayList<T> tab) {
        int i = 0, j = tab.size() - 1;
        while (i < j) {
            if (tab.get(i) != tab.get(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}

