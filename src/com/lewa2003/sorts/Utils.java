package com.lewa2003.sorts;

final class Utils {
    static <T extends Comparable<T>> boolean greater(T a, T b) {
        return a.compareTo(b) > 0;
    }

    static <T extends Comparable<T>> void swap(T[] array, int index1, int index2) {
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        return;
    }

    static <T> void print(T[] array) {
        int len = array.length;
        for (int i = 0; i < len - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
