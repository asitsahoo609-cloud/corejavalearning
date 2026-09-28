package shauryax.methodType.mul;

public class muldoubleTwoNumberUserMethod {

    public static void main(String[] args){
        double a = 3.1d;
        double b = 2.2d;
        double c = a * b;

        System.out.println("multiplying  of two double numbers "+c);
        muldoubleTwoNumberUserMethod multwodoublenumbers = new muldoubleTwoNumberUserMethod();
        multwodoublenumbers.mulTwodoublenumbers();

        multwodoublenumbers.muldoubleNumberByParameter(20.1d, 2.2d);

        double ommval = multwodoublenumbers.mulAndReturnValue();
        System.out.println("Multiplying of two double digits mulAndReturnValue ="+ommval);

        double jsw = multwodoublenumbers.mulByParameterAndReturnValue(12.1d, 10.1d);
        System.out.println("Multiplying of two double digits mulByParameterAndReturnValue ="+jsw);

    }
    public void mulTwodoublenumbers(){

        double d = 35.1d;
        double e = 24.2d;
        double f = d * e;
        System.out.println("multiplying  of two double numbers "+f);


    }
    public void muldoubleNumberByParameter(double d, double e){

        double x = d;
        double y = e;
        double z = x * y;
        System.out.println("multiplying  of two double numbers "+z);


    }
    public double mulAndReturnValue(){

        double m = 20.5d;
        double n = 6.2d;
        double o = m * n;
        return o;


    }
    public double mulByParameterAndReturnValue(double k, double r){

        double y = k;
        double l = r;
        double m = y * l;
        return m;


    }
}
