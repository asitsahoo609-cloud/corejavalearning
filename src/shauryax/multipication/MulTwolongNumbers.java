package shauryax.multipication;

public class MulTwolongNumbers {

    public void multipication1(){
        long a = 30l;
        long b = 60l;
        long c = a * b;
        System.out.println("mul of two number is "+c);

    }
    public void mulByParameter(long k,  long l){
        long t = k;
        long q = l;
        long r = t * q;
        System.out.println("parameter mul of two number is  "+ r);
    }

    public long mulAndReturnValue(){
        long x = 7l;
        long y = 6l;
        long z = x * y;
        return z;
    }

    public long mulByParameterAndReturnValue(long u, long v){
        long o = u;
        long w = v;
        long n = o * w;
        return n;
    }

}
