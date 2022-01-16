package pl.szymon.swierzbin;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtilMain {
    public static void main(String[] args) {
        ArrayList<LocalDate> array = new ArrayList<>();
        array.add(LocalDate.of(2001, 4, 3));
        array.add(LocalDate.of(2001, 6, 6));
        array.add(LocalDate.of(2001, 12, 2));
        System.out.println(ArrayUtil.isSorted(array));
        Collections.sort(array);
        System.out.println(ArrayUtil.isSorted(array));
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(2);
        array2.add(7);
        array2.add(4);
        array2.add(5);
        array2.add(2);
        System.out.println(ArrayUtil.isSorted(array2));
        Collections.sort(array2);
        System.out.println(ArrayUtil.isSorted(array2) + "\n");
        System.out.println(ArrayUtil.binSearch(array2, 8));
        System.out.println(ArrayUtil.binSearch(array2, 10));
        System.out.println(ArrayUtil.binSearch(array, LocalDate.of(2001, 5, 4)));
        System.out.println(ArrayUtil.binSearch(array, LocalDate.of(2001, 8, 7)) + "\n");
        ArrayUtil.selectionSort(array);
        ArrayUtil.selectionSort(array2);
        ArrayUtil.mergeSort(array);
        ArrayUtil.mergeSort(array2);
        System.out.println(array);
        System.out.println(array2 + "\n");

    }
}