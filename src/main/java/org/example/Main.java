package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverseWords("hello world"));
        System.out.println("result = " + "world hello");
//
//        System.out.println("");
//
//        System.out.println(getGrade(60,82,76));
//        System.out.println("result = " + "С");
//
//        System.out.println("");
//
//        System.out.println(getGrade(1,2,6));
//        System.out.println("result = " + "F");




    }

    public static String reverseWords(String str) {

//        String temp = "";
//
//        String[] arr = str.split(" ");
//
//        for (int i = arr.length-1;  i >= 0 ; i--) {
//
//            temp = temp + arr[i] + " ";
//        }
//
//        return temp.trim();
        return Arrays.stream(str.split(" ")).reduce((x, y) -> y + " " + x).get();

    }
}
