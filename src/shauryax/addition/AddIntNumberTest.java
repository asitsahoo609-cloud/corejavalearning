package shauryax.addition;

import java.util.Scanner;

public class AddIntNumberTest {
    public static void main(String[] args){

        AddintNumber addIntegerNumber = new AddintNumber();
        addIntegerNumber.addition();
        addIntegerNumber.additionByParameter(12, 5);


        int asitval = addIntegerNumber.addtionAndReturnValue();
        System.out.println("Value of two integer return val addtionAndReturnValue ="+asitval);


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number = ");
        int num1 = scanner.nextInt();

        System.out.println("enter 2nd number = ");
        int num2 = scanner.nextInt();

        addIntegerNumber.additionByParameter(num1,num2);



        int silkval = addIntegerNumber.additionByParameterAndReturnValue(23,5);
        System.out.println("Value of two integer return val additionByParameterAndReturnValue "+silkval);
    }

}
