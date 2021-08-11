package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean userWin = false;

        do {
            int myNum = random.nextInt(20) + 1;
            System.out.println("I`m thinking of number from 1 to 20, try to guess it");
            for (int attempt = 1; attempt <= 10; attempt++) {
                System.out.println("Attempt " + attempt + " Enter quess");
                int userNum = scanner.nextInt();
                System.out.println(userNum);
                if (userNum < myNum) {
                    System.out.println("Your number is too low ");

                } else if (userNum > myNum) {
                    System.out.println("Your number is too high ");

                } else {
                    userWin = true;
                    System.out.println("You win! With " + attempt + " attempts");
                    break;
                }

            }

            if (! userWin) {
                System.out.println("You lost! My number was " + myNum);
            }

            System.out.println("Do you want to play again? y/m");
        }

        while (! scanner.next().equals("n"));

        System.out.println("Good bye!");

    }

}
