package com.algoritem;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 7, 9};
        System.out.println(getIndex(6, numbers));

    }

    public static int getIndex(int item, int[] sortedNumbers) {

        int low = 0;
        int high = sortedNumbers.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;
            int guess = sortedNumbers[mid];

            if (guess == item)
                return mid;

            if (guess > item)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return -1;
    }
}
