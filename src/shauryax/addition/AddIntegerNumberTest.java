package shauryax.addition;

public class AddIntegerNumberTest {
    public static void main(String[] args){

        AddIntegerNumber addIntegerNumber = new AddIntegerNumber();
        addIntegerNumber.addition();
        addIntegerNumber.additionByParameter(6,8);
        Integer ramu = addIntegerNumber.addtionAndReturnValue();
        System.out.println("add two Integer value addtionAndReturnValue = "+ramu);
        Integer silkvalue = addIntegerNumber.additionByParameterAndReturnValue(35, 40);
        System.out.println("add two Integer value additionByParameterAndReturnValue = "+silkvalue);




    }




}
