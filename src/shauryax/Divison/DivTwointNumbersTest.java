package shauryax.Divison;

public class DivTwointNumbersTest {
    public static void main(String[] args){
        DivTwointNumbers divinttwonumber= new DivTwointNumbers();

        divinttwonumber.multipication1();
        divinttwonumber.mulByParameter(12, 3);
        int asit =  divinttwonumber.mulAndReturnValue();
        System.out.println("value of two long numbers "+asit);

        int gudu = divinttwonumber.mulByParameterAndReturnValue(24,2);
        System.out.println("value of two long numbers "+gudu);




    }

}
