package shauryax.sub;

import java.util.Scanner;

public class SubTwoDoubleUserInput {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number = ");
        double a = scanner.nextDouble();

        System.out.print("enter 2nd number = ");
        double b = scanner.nextDouble();

        double c = a - b;
        System.out.println("Subtraction of two double numbers " +c);
    }
}
