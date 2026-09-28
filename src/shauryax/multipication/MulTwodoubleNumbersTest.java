package shauryax.multipication;

public class MulTwodoubleNumbersTest {

    public static void main(String[] args){
        MulTwodoubleNumbers mulnumbers = new MulTwodoubleNumbers();

        mulnumbers.multipication1();
        mulnumbers.mulByParameter(12.2d, 5.3d);
        double asit =  mulnumbers.mulAndReturnValue();
        System.out.println("value of two long numbers "+asit);

        double gudu = mulnumbers.mulByParameterAndReturnValue(24.2d,2.2d);
        System.out.println("value of two long numbers "+gudu);




    }


}
