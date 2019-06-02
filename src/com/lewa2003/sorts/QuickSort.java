package com.lewa2003.sorts;

import static com.lewa2003.sorts.Utils.*;

public class QuickSort {
    public static <T extends Comparable<T>> void sort(T[] array) {
        doSort(array, 0, array.length-1);
    }

    private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int q = partition(array, left, right);
            doSort(array, left, q-1);
            doSort(array, q, right);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] array, int left, int right) {
        T middle = array[(left + right) / 2];
        int i = left;
        int j = right;

        while (i <= j) {
            while (greater(middle, array[i])) {
                i++;
            }
            while (greater(array[j], middle)) {
                j--;
            }
            if (i <= j){
                swap(array, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        Integer[] arrayI = {10, 35, 14, 2, 100, 53, 1};
        QuickSort.sort(arrayI);
        print(arrayI);

        String[] arrayS = {"abc", "aeb", "csdsd", "baa", "aaz", "aazz"};
        QuickSort.sort(arrayS);
        print(arrayS);
    }
}
