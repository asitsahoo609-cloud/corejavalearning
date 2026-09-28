package shauryax.multipication;

public class MulTwo_LongNumbers {

    public void multipication1(){
        Long a = 30L;
        Long b = 60L;
        Long c = a * b;
        System.out.println("mul of two number is "+c);

    }
    public void mulByParameter(Long k,  Long l){
        Long t = k;
        Long q = l;
        Long r = t * q;
        System.out.println("parameter mul of two number is  "+ r);
    }

    public Long mulAndReturnValue(){
        Long x = 7L;
        Long y = 6L;
        Long z = x * y;
        return z;
    }

    public Long mulByParameterAndReturnValue(Long u, Long v){
        Long o = u;
        Long w = v;
        Long n = o * w;
        return n;
    }

}
