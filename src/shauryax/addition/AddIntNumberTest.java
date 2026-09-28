package shauryax.addition;

public class AddIntNumberTest {
    public static void main(String[] args){

        AddintNumber addIntegerNumber = new AddintNumber();
        addIntegerNumber.addition();
        addIntegerNumber.additionByParameter(12, 5);
        int asitval = addIntegerNumber.addtionAndReturnValue();
        System.out.println("Value of two integer return val addtionAndReturnValue ="+asitval);
        int silkval = addIntegerNumber.additionByParameterAndReturnValue(23,5);
        System.out.println("Value of two integer return val additionByParameterAndReturnValue "+silkval);
    }

}
