//Mark Ewert
//Oct 14, 2020

import java.util.Scanner;

public class GuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int chosenNumber = (int)(Math.random()*100)+1;
        int guessTally = 0;
        int guess = 0;

        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        while(guess!= chosenNumber){
            System.out.print("What is your guess? ");
            guess = sc.nextInt();
            if (guess < 1 || 100 < guess) System.out.println("It's between 1 and 100 remember?");
            else if (guess > chosenNumber) System.out.println("Too high...");
            else if (guess < chosenNumber) System.out.println("Too low... ");
            guessTally++;
        }
        System.out.println("");
        System.out.print("You've guessed my number! Good job! ");
        System.out.println("It only took you " + guessTally + " tries");
    }
}