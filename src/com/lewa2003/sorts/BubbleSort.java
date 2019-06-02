package com.lewa2003.sorts;

import static com.lewa2003.sorts.Utils.*;

class BubbleSort {
    public static <T extends Comparable<T>> void sort(T array[]) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (greater(array[j], array[j + 1])) {
                    swap(array, j, j+1);
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        Integer[] array = {10, 35, 14, 2, 100, 53, 1};
        BubbleSort.sort(array);
        print(array);

        String[] arrayS = {"abc", "aeb", "csdsd", "baa", "aaz", "aazz"};
        BubbleSort.sort(arrayS);
        print(arrayS);
    }
}
