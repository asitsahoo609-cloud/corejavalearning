package shauryax.addition;

public class AddlongNumberTest {
    public static void main(String[] args){

        AddlongNumber addlongNumber =  new AddlongNumber();
        addlongNumber.addition();
        addlongNumber.additionByParameter(5l,6l);

        long asit = addlongNumber.addtionAndReturnValue();
        System.out.println("addition of two long number addtionAndReturnValue = " +asit);
        long silu = addlongNumber.additionByParameterAndReturnValue(23l,25l);
        System.out.println("addition of two long number additionByParameterAndReturnValue = " +silu);
    }
}
