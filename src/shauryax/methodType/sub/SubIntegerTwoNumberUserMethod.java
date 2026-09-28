package shauryax.methodType.sub;

public class SubIntegerTwoNumberUserMethod {
    public static void main(String[] args){

        Integer v = 367;
        Integer t = 20;
        Integer z = v - t;

        System.out.println("Value of two integer subtraction " +z);

        SubIntegerTwoNumberUserMethod subIntwoftwonumbers = new SubIntegerTwoNumberUserMethod();
        subIntwoftwonumbers.subtraction();

        subIntwoftwonumbers.subtractionByParameter(23,5);

        Integer guluValue = subIntwoftwonumbers.subtractionAndReturnValue();
        System.out.println("Value of two integer subtractionAndReturnValue " +guluValue);

        Integer siluValue = subIntwoftwonumbers.subByParameterAndReturnValue(34,30);
        System.out.println("Value of two integer subByParameterAndReturnValue " +siluValue);

    }
    public void subtraction() {

        Integer y = 310;
        Integer m = 215;
        Integer l = y - m;

        System.out.println("Value of two integer subtraction " + l);
    }
    public void subtractionByParameter(Integer p, Integer r) {

        Integer q = p;
        Integer s = r;
        Integer x = q - s;

        System.out.println("Value of two integer subtractionByParameter " + x);
    }
    public int subtractionAndReturnValue(){
        Integer h = 56;
        Integer k = 10;
        Integer y = h - k;
        return y;


    }
    public int subByParameterAndReturnValue(int e, int m ){
        Integer s = e;
        Integer r = m;
        Integer x = s - r;
        return x;


    }


}