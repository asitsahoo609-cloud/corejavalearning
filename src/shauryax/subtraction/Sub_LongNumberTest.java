package shauryax.subtraction;

public class Sub_LongNumberTest {
    public static void main(String[] args){

        Sub_LongNumber sublongnum = new Sub_LongNumber();
        sublongnum.subLogNum();

        sublongnum.subtwolongnumByParameter(25L, 20L);

        Long  siluvalue = sublongnum.subAndReturnValue();
        System.out.println("Value of two subLong numbers =" +siluvalue);

        Long  asitvalue = sublongnum.subAndReturnValueByParameter(35L, 25L);
        System.out.println("Value of two subLong numbers =" +asitvalue);






    }

}
