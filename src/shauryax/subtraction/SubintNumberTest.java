package shauryax.subtraction;

public class SubintNumberTest {
    public static void main(String[] args){
        SubintNumber subintnumber = new SubintNumber();
        subintnumber.subtractionwoint();
        subintnumber.subByParameter(13, 5);

        int shiva = subintnumber.subAndReturnValue();
        System.out.println("Value of two int number subAndReturnValue= " +shiva);

        int krish = subintnumber.subByParameterAndReturnValue(25,5);
        System.out.println("Value of two int number subByParameterAndReturnValue =" +krish);


    }

}
