package shauryax.addition;

public class AddIntegerNumber {
    public void addition() {
        Integer a = 50;
        Integer b = 60;
        Integer c = a + b;

        System.out.println("addition of two number is " + c);
    }

    public void additionByParameter(Integer i, Integer k) {
        Integer d = i;
        Integer e = k;
        Integer f = d + e;

        System.out.println("addition of two number is " + f);

    }
    public Integer addtionAndReturnValue() {
        Integer k = 50;
        Integer l = 60;
        Integer m = k + l;
        return m;


    }
    public Integer additionByParameterAndReturnValue(Integer m,Integer n ) {
        Integer y = m;
        Integer j = n;
        Integer l = y + j;
        return l;


    }
}