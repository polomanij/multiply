package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! You must to solve 5 tasks.");

        Scanner scanner = new Scanner(System.in);

        int tasksAmount = 5;
        int correctAnswer = 0;

        for (int i = 1; i != tasksAmount + 1; i++) {
            int numberA = getRandomNumber(20);
            int numberb = getRandomNumber(20);

            System.out.printf(String.join("%n",
                    "%n Task number %1$d:",
                    "%2$5d * %3$d = "), i, numberA, numberb);

                    int custumerAnswer = scanner.nextInt();
                    int tryAnswer = numberA * numberb;

                    if (tryAnswer == custumerAnswer) {
                        System.out.println("You`re right!");
                        correctAnswer++;
                    } else {
                        System.out.println("It`s wrong!");
                        correctAnswer--;
                    }

        }

        System.out.printf("%nTest is compete.");

        if (correctAnswer == 5) {
            System.out.println("WELL DONE");
        } else if (correctAnswer <= 2) {
            System.out.println("You urgently need to learn multiplication table");
        } else {
            System.out.println("Not bad, but you need to train");
        }
    }

    static int getRandomNumber(int num) {
        Random random = new Random();

        int randomNumber = random.nextInt(num);

        return randomNumber;
    }
}
