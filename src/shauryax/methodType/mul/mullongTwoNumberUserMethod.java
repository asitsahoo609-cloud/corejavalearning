package shauryax.methodType.mul;

public class mullongTwoNumberUserMethod {
    public static void main(String[] args){

        long a = 50l;
        long b = 2l;
        long c =  a * b;

        System.out.println("mutiplying value of two integer " +c);

        mullongTwoNumberUserMethod multipicationoftwolongnumbers = new mullongTwoNumberUserMethod();
        multipicationoftwolongnumbers.multipication();

        multipicationoftwolongnumbers.mulByParameter(25, 3);

        long kumar =  multipicationoftwolongnumbers.mulAndReturnValue();
        System.out.println("Multiplying two number and retuen value mulAndReturnValue " +kumar);

        long sahoo =  multipicationoftwolongnumbers.mulByParameterAndReturnValue(23l,5l);
        System.out.println("Multiplying two number and retuen value  mulByParameterAndReturnValue "  +sahoo);
    }
    public void multipication(){

        long p = 25l;
        long q = 2l;
        long r =  p * q;

        System.out.println("mutiplying value of two long numbers " +r);


    }
    public void mulByParameter(long a , long b){

        long p = a;
        long q = b;
        long r =  p * q;

        System.out.println("mutiplying value of two long numbers " +r);


    }
    public long mulAndReturnValue(){
        long z = 5;
        long m = 10;
        long r = z * m;
        return r;


    }
    public long mulByParameterAndReturnValue(long u, long v){
        long w = u;
        long x = v;
        long z = w * x;
        return z;

    }

}
