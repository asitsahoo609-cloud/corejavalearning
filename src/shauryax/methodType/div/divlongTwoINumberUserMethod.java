package shauryax.methodType.div;

public class divlongTwoINumberUserMethod {

    public static void main(String[] args){
        long a = 365l;
        long b= 12l;
        long c = a / b;
        System.out.println("Value of two div long numbers "+c);
        divlongTwoINumberUserMethod divtwolongnumbers = new divlongTwoINumberUserMethod();
        divtwolongnumbers.divison();

        divtwolongnumbers.divisonByParameter(60l, 12l);

        long asitvalue = divtwolongnumbers.divAndReturnValue();
        System.out.println("Value of two div long numbers divAndReturnValue ="+asitvalue);

        long siluvalue = divtwolongnumbers.divByParameterAndReturnValue(90l, 15l);
        System.out.println("Value of two div long numbers divByParameterAndReturnValue ="+siluvalue);
    }

    public void divison(){

        long x =  12l;
        long y = 4l;
        long z = x / y;
        System.out.println("Value of two div long numbers "+z);


    }
    public void divisonByParameter(long l, long q){

        long m = l;
        long n = q;
        long o = m / n;
        System.out.println("Value of two div long numbers "+o);


    }
    public long divAndReturnValue(){

        long p = 35l;
        long w = 7l;
        long s = p / w;
        return s;

    }
    public long divByParameterAndReturnValue(long y, long n){

        long i = y;
        long b = n;
        long g = i / b;
        return g;

    }




}
