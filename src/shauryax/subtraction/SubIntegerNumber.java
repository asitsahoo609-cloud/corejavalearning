package shauryax.subtraction;

public class SubIntegerNumber {

    public void subInteger(){
        Integer a = 23;
        Integer b = 18;
        Integer c = a - b;
        System.out.println("Value of two subInteger Number "+c);

    }

    public void subByParameter(Integer x, Integer y){
        Integer d = x;
        Integer e = y;
        Integer f = d - e;
        System.out.println("Value of two subInteger Number "+f);


    }
    public Integer subAndReturnValue(){
        Integer m = 23;
        Integer n = 7;
        Integer o = m - n;
        return o;

    }
    public Integer subByParameterAndReturnValue(Integer p,Integer q){
        Integer l = p;
        Integer r = q;
        Integer t = l - r;
        return t;

    }
}
