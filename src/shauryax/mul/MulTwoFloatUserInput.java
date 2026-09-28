package shauryax.mul;

import java.util.Scanner;

public class MulTwoFloatUserInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number =");
        float a = scanner.nextFloat();

        System.out.print("enter 2nd number =");
        float b = scanner.nextFloat();

        float c = a * b;

        System.out.println("multiplying two float numbers  " +c);


    }
}
