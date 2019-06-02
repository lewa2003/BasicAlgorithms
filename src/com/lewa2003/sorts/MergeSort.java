package com.lewa2003.sorts;


import static com.lewa2003.sorts.Utils.*;

public class MergeSort {
    public static <T extends Comparable<T>> void sort(T[] array){
        doSort(array,0, array.length-1);
    }

    private static <T extends Comparable<T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right)/2;
            doSort(array, left, middle);
            doSort(array, middle +1, right);
            merge(array, left, middle, right);
        }
    }

    private static <T extends Comparable<T>> void merge(T[] array, int left, int middle, int right){
        T[] temp = (T[]) new Comparable[array.length];
        System.arraycopy(array, left, temp, left, right - left + 1);

        int i = left;
        int j = middle+1;
        int k = left;

       while (i <= middle && j <= right) {
            if (greater(temp[i], temp[j])) {
                array[k++] = temp[j++];
            } else {
                array[k++] = temp[i++];
            }
        }

        while (i <= middle) {
            array[k++] = temp[i++];
        }

        while (j <= right) {
            array[k++] = temp[j++];
        }
    }


    public static void main(String[] args) {
        Integer[] arrayI = {10, 35, 14, 2, 100, 53, 1};
        MergeSort.sort(arrayI);
        print(arrayI);

        String[] arrayS = {"abc", "aeb", "csdsd", "baa", "aaz", "aazz"};
        MergeSort.sort(arrayS);
        print(arrayS);
    }
}
