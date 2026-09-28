package shauryax.subtraction;

public class SubdoubleNumberTest {
    public static void main(String[] args){

        SubdoubleNumber subdoubleNumber = new SubdoubleNumber();
        subdoubleNumber.subFloat();
        subdoubleNumber.subFloatByParameter(50.5d,12.2d);

        double silu = subdoubleNumber.subdoubleAndReturnValue();
        System.out.println("Value of two double numbers subFloatAndReturnValue "+silu);

        double asit = subdoubleNumber.subdoubleAndReturnValueByParameter(84.5d, 34.2d);
        System.out.println("Value of two double numbers subFloatAndReturnValueByParameter "+asit);
    }

}
