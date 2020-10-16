//Mark Ewert
//Oct 13, 2020

import java.util.Scanner;

public class Bar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What character do you want your bar made of? ");
        String charToUse = sc.next();
        
        System.out.print("How long do you want your bar? ");
        int x = sc.nextInt();
        
        System.out.println("");
        System.out.println("Here's your bar!");
        System.out.println("");
        for (int i = 0; i < x; i++){
          System.out.print(charToUse);
        }
    }
}