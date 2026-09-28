package shauryax.multipication;

public class MulTwo_LongNumbersTest {
    public static void main(String[] args){
        MulTwo_LongNumbers mulnumbers = new MulTwo_LongNumbers();

        mulnumbers.multipication1();
        mulnumbers.mulByParameter(12L, 5L);
        Long asit =  mulnumbers.mulAndReturnValue();
        System.out.println("value of two long numbers "+asit);

        Long gudu = mulnumbers.mulByParameterAndReturnValue(24L,2L);
        System.out.println("value of two long numbers "+gudu);




    }
}
