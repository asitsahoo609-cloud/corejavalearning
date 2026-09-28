package shauryax.mul;

import java.util.Scanner;

public class MulTwoLongUserInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number =");
        long a = scanner.nextLong();

        System.out.print("enter 2nd number =");
        long b = scanner.nextLong();

        long c = a * b;

        System.out.println("multiplying two long numbers  " +c);


    }
}
