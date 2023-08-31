package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println(rps("scissors", "paper"));
        System.out.println("result = " + "Player 1 won!");

        System.out.println("");

        System.out.println(rps("scissors", "rock"));
        System.out.println("result = " + "Player 2 won!");

        System.out.println("");

        System.out.println(rps("rock", "rock"));
        System.out.println("result = " + "Draw!");


    }

    public static String rps(String p1, String p2) {

        if (p1.equals(p2)) return  "Draw!";
        if (p1.equals("rock") && p2.equals("scissors")) return  "Player 1 won!";
        if (p1.equals("scissors") && p2.equals("paper")) return "Player 1 won!";
        if (p1.equals("paper") && p2.equals("rock")) return "Player 1 won!";
        else return "Player 2 won!";


    }


}
/*
"scissors", "paper" --> "Player 1 won!"
"scissors", "rock" --> "Player 2 won!"
"paper", "paper" --> "Draw!"
* */