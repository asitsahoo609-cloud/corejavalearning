package shauryax.multipication;

public class MulTwoIntgerNumbers {

    public void multipication1(){
        Integer a = 50;
        Integer b = 60;
        Integer c = a * b;
        System.out.println("mul of two number is "+c);

    }
    public void mulByParameter(Integer k,  Integer l){
        Integer t = k;
        Integer q = l;
        Integer r = t * q;
        System.out.println("parameter addition of two number is  "+ r);
    }

    public Integer mulAndReturnValue(){
        Integer x = 5;
        Integer y = 6;
        Integer z = x * y;
        return z;
    }

    public Integer mulByParameterAndReturnValue(Integer u, Integer v){
        Integer o = u;
        Integer w = v;
        Integer n = o * w;
        return n;
    }

}
