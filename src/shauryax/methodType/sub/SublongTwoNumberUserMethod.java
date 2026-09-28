package shauryax.methodType.sub;

public class SublongTwoNumberUserMethod {
    public static void main(String[] args){

        long x = 54l;
        long y = 20l;
        long z = x - y;

        System.out.println("Value of two long subtraction " +z);

        SublongTwoNumberUserMethod subtwolongnumbers = new SublongTwoNumberUserMethod();
        subtwolongnumbers.subtraction();

        subtwolongnumbers.subtractionByParameter(556l, 200l);

        long asit = subtwolongnumbers.subtractionAndRetunValue();
        System.out.println("Value of two long subtractionAndRetunValue " +asit);

        long silu = subtwolongnumbers.subByParameterAndReturnValue(23l,8l);
        System.out.println("Value of two long subByParameterAndReturnValue " +silu);

    }
    public void subtraction(){

        long a = 45l;
        long b = 22l;
        long c = a - b;

        System.out.println("Value of two long subtraction " +c);



    }
    public void subtractionByParameter(long s, long p){

        long z = s;
        long q = p;
        long r = z - q;

        System.out.println("Value of two long subtractionByParameter " +r);



    }
    public long subtractionAndRetunValue(){

        long t = 23l;
        long r = 20l;
        long p = t - r;
        return p;




    }
    public long subByParameterAndReturnValue(long r,long g ){

        long q = r;
        long e = g;
        long y = q - e;
        return y;




    }
}
