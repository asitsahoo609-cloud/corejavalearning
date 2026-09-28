package shauryax.subtraction;

public class Sub_FloatNumberTest {
    public static void main(String[] args){

        Sub_FloatNumber subFloatNumber = new Sub_FloatNumber();
        subFloatNumber.subFloat();
        subFloatNumber.subFloatByParameter(50.5F,12.2F);

        Float silu = subFloatNumber.subFloatAndReturnValue();
        System.out.println("Value of two Float numbers subFloatAndReturnValue "+silu);

        Float asit = subFloatNumber.subFloatAndReturnValueByParameter(84.5F, 34.2F);
        System.out.println("Value of two Float numbers subFloatAndReturnValueByParameter "+asit);
    }
}
