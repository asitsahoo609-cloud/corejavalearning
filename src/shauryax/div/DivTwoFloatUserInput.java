package shauryax.div;

import java.util.Scanner;

public class DivTwoFloatUserInput {
    public static void main(String[] args){



        Scanner scanner = new Scanner(System.in);

        System.out.print("enter 1st number = ");
        float a = scanner.nextFloat();

        System.out.print("enter 2nd number = ");
        float b = scanner.nextFloat();

        float c = a / b;

        System.out.println("Divide two float numbers  " +c);


    }



}
