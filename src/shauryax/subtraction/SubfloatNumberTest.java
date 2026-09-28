package shauryax.subtraction;

public class SubfloatNumberTest {
    public static void main(String[] args){
        SubfloatNumber subtwofloatnumber = new SubfloatNumber();

        subtwofloatnumber.subfloatnumber();
        subtwofloatnumber.subtwofloatnumByParameter(25.5f,20.3f);
        float sima = subtwofloatnumber.subAndReturnValue();
        System.out.println("Value of subAndReturnValue "+sima);
        float rima = subtwofloatnumber.subAndReturnValueByParameter(32.5f, 20.2f);
        System.out.println("Value of subAndReturnValue "+rima);

    }

}
