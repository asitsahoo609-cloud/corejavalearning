package shauryax.methodType.mul;

public class mulIntegerTwoNumberUserMethod {
    public static void main(String[] args){

        Integer a = 50;
        Integer b = 2;
        Integer c =  a * b;

        System.out.println("mutiplying value of two integer " +c);

        mulIntegerTwoNumberUserMethod multipicationoftwointnumbers = new mulIntegerTwoNumberUserMethod();
        multipicationoftwointnumbers.multipication();

        multipicationoftwointnumbers.mulByParameter(25, 3);

        Integer kumar =  multipicationoftwointnumbers.mulAndReturnValue();
        System.out.println("Multiplying two number and retuen value mulAndReturnValue " +kumar);

        Integer sahoo =  multipicationoftwointnumbers.mulByParameterAndReturnValue(23,5);
        System.out.println("Multiplying two number and retuen value  mulByParameterAndReturnValue "  +sahoo);
    }
    public void multipication(){

        Integer p = 25;
        Integer q = 2;
        Integer r =  p * q;

        System.out.println("mutiplying value of two integer " +r);


    }
    public void mulByParameter(Integer a , Integer b){

        Integer p = a;
        Integer q = b;
        Integer r =  p * q;

        System.out.println("mutiplying value of two integer " +r);


    }
    public Integer mulAndReturnValue(){
        int z = 5;
        int m = 10;
        int r = z * m;
        return r;


    }
    public Integer mulByParameterAndReturnValue(Integer u, Integer v){
        int w = u;
        int x = v;
        int z = w * x;
        return z;

    }
}
