package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(countBy(1, 10)));
        System.out.println("result = " + "1,2,3,4,5,6,7,8,9,10");

        System.out.println("");

        System.out.println(Arrays.toString(countBy(2, 5)));
        System.out.println("result = " + "2,4,6,8,10");

        System.out.println("");


    }

    public static int[] countBy(int x, int n) {
       int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1)*x;
        }
        return arr;
    }
}

