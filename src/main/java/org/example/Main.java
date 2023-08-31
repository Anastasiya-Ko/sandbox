package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println(getGrade(95,90,93));
        System.out.println("result = " + "А");

        System.out.println("");

        System.out.println(getGrade(60,82,76));
        System.out.println("result = " + "С");

        System.out.println("");

        System.out.println(getGrade(1,2,6));
        System.out.println("result = " + "F");



//        System.out.println("");
//
//        System.out.println(rps("rock", "rock"));
//        System.out.println("result = " + "Draw!");


    }

    public static char getGrade(int s1, int s2, int s3) {

        double average = IntStream.of(s1, s2, s3).average().getAsDouble();

        if (isBetween(average, 90, 101)) return 'A';
        if (isBetween(average, 80, 90)) return 'B';
        if (isBetween(average, 70, 80)) return 'C';
        if (isBetween(average, 60, 70)) return 'D';
        else return 'F';

    }

    public static boolean isBetween(double x, int lower, int upper) {
        return lower <= x && x < upper;
    }


}
/*
"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
* */