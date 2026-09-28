package shauryax.subtraction;

public class SubIntegerNumberTest {
    public static void main(String[] args){
    SubIntegerNumber subintegernumber = new SubIntegerNumber();

   subintegernumber.subInteger();
   subintegernumber.subByParameter(278, 268);

   Integer asit = subintegernumber.subAndReturnValue();
   System.out.println("Value of two Sub Integer number subAndReturnValue "+asit);


   Integer silu = subintegernumber.subByParameterAndReturnValue(23, 9);
   System.out.println("Value of two Sub Integer number subByParameterAndReturnValue "+silu);

    }
}
