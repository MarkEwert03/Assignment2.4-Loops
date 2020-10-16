//Mark Ewert
//Oct 15, 2020

/*  ◻◻◻◼◻◻◻
 *  ◻◻◼◼◼◻◻
 *  ◻◼◼◼◼◼◻
 *  ◼◼◼◼◼◼◼
 */

import java.util.Scanner;

public class Triangle2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean spacesFinished = false;

        System.out.print("What character do you want your isosceles triangle made of? ");
        String charToUse = sc.next();
        System.out.print("How tall do you want your triangle? ");
        int height = sc.nextInt();
        num = (height*2)-1;
        System.out.println("");

        System.out.println("Here's your triangle");
        System.out.println("");
        for (int i = 1; i <= num; i++){
            if (i%2 != 0){
                
                for (int j = 1; j <= i; j++){
                    
                    if (!spacesFinished){
                        for (int k = 1; k <= (int)((num-i)/2); k++) System.out.print(" ");
                        spacesFinished = true;
                    }
                    System.out.print(charToUse);

                }
                System.out.println("");
                spacesFinished = false;
                
            }
        }
    }
}