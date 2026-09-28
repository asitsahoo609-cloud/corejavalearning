package shauryax.addition;

public class AddfloatNumberTest {
    public static void main(String[] args){

        AddfloatNumber addfloatNumber = new AddfloatNumber();
        addfloatNumber.addition();
        addfloatNumber.additionByParameter(23.5f,25.7f);
        float guluvalue = addfloatNumber.addtionAndReturnValue();
        System.out.println("addition of two float number addtionAndReturnValue =" + guluvalue);

        float siluvalue = addfloatNumber.additionByParameterAndReturnValue(30.3f,20.2f);
        System.out.println("addition of two float number additionByParameterAndReturnValue =" + guluvalue);




    }

}
