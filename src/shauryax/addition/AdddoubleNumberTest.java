package shauryax.addition;

public class AdddoubleNumberTest {
    public static void main(String[] args){
        AdddoubleNumber adddoublenumber = new AdddoubleNumber();
        adddoublenumber.addition();
        adddoublenumber.additionByParameter(13.5d, 13.3d);

        double asit  = adddoublenumber.addtionAndReturnValue();
        System.out.println("addition of two double number addtionAndReturnValue  "+asit);
        double silu  = adddoublenumber.additionByParameterAndReturnValue(23.3d, 24.2d);
        System.out.println("addition of two double number additionByParameterAndReturnValue  "+silu);



    }
}
