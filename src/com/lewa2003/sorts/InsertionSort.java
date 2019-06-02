package com.lewa2003.sorts;

import static com.lewa2003.sorts.Utils.*;

class InsertionSort {
    public static <T extends Comparable<T>> void sort(T[] array){
        int len = array.length;
        for (int i = 1; i < len; i++) {
            int j = i-1;
            while (j >= 0 && greater(array[j], array[j+1])) {
                swap(array, j, j+1);
                j--;
            }
        }
    }

    public static void main(String[] args){
        Integer[] arrayI = {10, 15, 3, 214, 123, 1, 12};
        InsertionSort.sort(arrayI);
        print(arrayI);

        String[] arrayS = {"abc", "aeb", "csdsd", "baa", "aaz", "aazz"};
        InsertionSort.sort(arrayS);
        print(arrayS);
    }
}
