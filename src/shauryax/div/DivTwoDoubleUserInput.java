package shauryax.div;

import java.util.Scanner;

public class DivTwoDoubleUserInput {
    public static void main(String[] args){

        Scanner scanner =  new Scanner(System.in);

        System.out.print("enter 1st number  =");
        double m = scanner.nextDouble();

        System.out.print("enter 2nd number =");
        double n = scanner.nextDouble();

        double o  =  m / n;
        System.out.println("Divide two double numbers  "+o);





    }
}
