package shauryax.subtraction;

public class SublongNumberTest {
    public static void main(String[] args){
    SublongNumber sublongnum = new SublongNumber();
    sublongnum.subtwolongnum();
    sublongnum.subtwolongnumByParameter(34l, 24l);

    long silu = sublongnum.subAndReturnValue();
    System.out.println("Value of two sublong numbers " +silu);

    long asit = sublongnum.subAndReturnValueByParameter(13l,8l);
    System.out.println("Value of two sublong numbers " +asit);


    }
}
