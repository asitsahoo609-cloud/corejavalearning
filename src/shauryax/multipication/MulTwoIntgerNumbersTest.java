package shauryax.multipication;

public class MulTwoIntgerNumbersTest {

    public static void main(String[] args){

        MulTwoIntgerNumbers multwointnumber = new MulTwoIntgerNumbers();
        multwointnumber.multipication1();
        multwointnumber.mulByParameter(6, 7);

        int asit =  multwointnumber.mulAndReturnValue();
        System.out.println("mul val of two int numbers "+asit);

        int silu = multwointnumber.mulByParameterAndReturnValue(25,5);
        System.out.println("mul val of two int numbers "+silu);




    }

}
