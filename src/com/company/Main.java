package com.company;


import java.util.Random;
import java.util.Scanner;
import java.lang.System;


public class Main {

    public static void main(String[] args) {

        System.out.println("You will have to choose a number in the beginning before you play the game");
        System.out.println("Then you will try to guess the number from the range of the number you picked");
        System.out.println("Pick a number: ");


        Scanner keyboard = new Scanner(System.in);
        int maximum;
        maximum = keyboard.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(maximum);
        int tries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;



    }
}
