//Mark Ewert
//Oct 13, 2020

import java.util.Scanner;

public class RunningTally{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int total = 0;

        System.out.println("Let's add some numbers! [Type a negative number to quit]");
        System.out.println("");

        while(num >= 0){
            System.out.print("Add:  ");
            num = sc.nextInt();
            if (num >= 0) total += num;
        }
        System.out.println("");
        System.out.println("Your total is " + total);
    }
}