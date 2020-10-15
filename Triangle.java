//Mark Ewert :)
//Oct 13, 2020

import java.util.Scanner;

public class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("What character do you want your triangle made of? ");
        String charToUse = sc.next();
        System.out.print("How tall do you want your triangle? ");
        int num = sc.nextInt();
        System.out.println("");
        System.out.println("Here's your triangle");
        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(charToUse);
            }
            System.out.println("");
        }
    }
}