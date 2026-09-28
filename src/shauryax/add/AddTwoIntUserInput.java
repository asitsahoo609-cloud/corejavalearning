package shauryax.add;

import java.util.Scanner;

public class AddTwoIntUserInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number = ");
        int x = scanner.nextInt();

        System.out.print("enter  2nd number = ");
        int y = scanner.nextInt();

        int z = x + y;

        System.out.println("sum  ="+z);


    }

}
