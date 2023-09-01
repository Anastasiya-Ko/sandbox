package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println(doubleChar("123"));
        System.out.println("result = " + "112233");

        System.out.println(" ");


    }

    public static String doubleChar(String s) {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builder.append(s.charAt(i)).append(s.charAt(i));
        }
        return builder.toString();
    }

}
