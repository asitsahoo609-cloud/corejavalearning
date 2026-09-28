package shauryax.multipication;

public class MulTwolongNumbersTest {
    public static void main(String[] args){
        MulTwolongNumbers mulnumbers = new MulTwolongNumbers();

        mulnumbers.multipication1();
        mulnumbers.mulByParameter(12l, 5l);
        long asit =  mulnumbers.mulAndReturnValue();
        System.out.println("value of two long numbers "+asit);

        long gudu = mulnumbers.mulByParameterAndReturnValue(24l,2l);
        System.out.println("value of two long numbers "+gudu);




    }
}
