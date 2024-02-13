package com.algoritem;

public class SumWithDAndC {

    public static void main(String[] args) {


        int[] test = {1, 2, 3, 4};
        System.out.println(sum(test, test.length - 1));
    }

    public static int sum(int[] array, int index) {

        if (index == 0) {
            return array[index];
        }
        else {
            return array[index] + sum(array, index - 1);
        }
    }
}
