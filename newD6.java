//Mark Ewert
//Oct 13, 2020

import java.util.Scanner;

public class newD6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean continuing = true;
        while (continuing) {
            int total = 0;

            System.out.print("How many D6's do you want to roll? ");
            int rolls = sc.nextInt();
            System.out.println("");
            System.out.print("You rolled: ");
            for (int i = 0; i < rolls; i++){
                int currentRoll = (int)(Math.random()*6)+1;
                System.out.print(currentRoll + " ");
                total += currentRoll;
            }
            System.out.println("");
            System.out.println("Total: " + total);
            System.out.println("");
            System.out.print("Again? [y, n] ");
            String response = sc.next();
            if ("y".equals(response)) System.out.println("");
            else continuing = false;
        }
    }
}