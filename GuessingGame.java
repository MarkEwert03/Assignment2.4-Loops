//Mark Ewert
//Oct 14, 2020

import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chosenNumber = (int)(Math.random()*100)+1;
        int guessTally = 0;

        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        System.out.print("What is your guess? ");
        int guess = sc.nextInt();
        if (chosenNumber < 1 || 100 < chosenNumber) System.out.println("It's between 1 and 100 remember?");
        else if (chosenNumber > guess) System.out.println("Too high...");
        else System.out.print("What is your guess? ");

    }
}