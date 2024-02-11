package com.algoritem;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] array = {8, 9, 4, 6, 9, 9, 12, 245, 134};
        System.out.println(Arrays.toString(sort(array)));

    }

    public static int[] sort(int[] array) {
       int[] sortedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
            sortedArray[i] = smallerNumber;
        }
        return sortedArray;
    }
}
