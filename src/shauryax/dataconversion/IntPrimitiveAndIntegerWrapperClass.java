package shauryax.dataconversion;

public class IntPrimitiveAndIntegerWrapperClass {
    public static void main(String[] args){

    int x = 10;
    System.out.println("value of int x = " +x);

    Integer y = 20;
    System.out.println("value of Integer" +y);


    x = y;

    System.out.println("value of y assign to x =" +x);

    int maxValue = Integer.MAX_VALUE;
    int minValue =  Integer.MIN_VALUE;

    System.out.println("max value of integer is " +Integer.MAX_VALUE);
    System.out.println("max value of integer is " +Integer.MIN_VALUE);


    int maxData = Integer.max(5, 6);
    System.out.println("max value in 5 and 6 is " +Integer.MAX_VALUE);

    int minData = Integer.min(5, 6);
    System.out.println("max value in 5 and 6 is " +Integer.MIN_VALUE);

    int sum = Integer.sum(7, 8);
    System.out.println("sum value of 7 and 8 is " +sum);



 //convert String to Integer
    String Value = "5";
    int z = 10;

//converting String value to Integer
    int value1 = Integer.parseInt(Value);

    int add = z + value1;
    System.out.println("sum value of 10 and 5 is " +add);



    }

}
