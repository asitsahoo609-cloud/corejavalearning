package shauryax.sub;

import java.util.Scanner;

public class SubTwoIntUserInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number = ");
        int x = scanner.nextInt() ;

        System.out.print("enter 2nd number = ");
        int y = scanner.nextInt() ;

        int z = x - y;

        System.out.println("Subtraction of two int numbers"  + z);









    }
}
