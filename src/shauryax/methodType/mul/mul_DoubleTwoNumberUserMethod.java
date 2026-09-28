package shauryax.methodType.mul;

public class mul_DoubleTwoNumberUserMethod {
    public static void main(String[] args){
        Double a = 3.1D;
        Double b = 2.2D;
        Double c = a * b;

        System.out.println("multiplying  of two Double numbers "+c);
        mul_DoubleTwoNumberUserMethod multwodoublenumbers = new mul_DoubleTwoNumberUserMethod();
        multwodoublenumbers.mulTwodoublenumbers();

        multwodoublenumbers.muldoubleNumberByParameter(20.1D, 2.2D);

        Double ommval = multwodoublenumbers.mulAndReturnValue();
        System.out.println("Multiplying of two Double digits mulAndReturnValue ="+ommval);

        Double jsw = multwodoublenumbers.mulByParameterAndReturnValue(12.1D, 10.1D);
        System.out.println("Multiplying of two Double digits mulByParameterAndReturnValue ="+jsw);

    }
    public void mulTwodoublenumbers(){

        Double d = 35.1D;
        Double e = 24.2D;
        Double f = d * e;
        System.out.println("multiplying  of two Double numbers "+f);


    }
    public void muldoubleNumberByParameter(Double d, Double e){

        Double x = d;
        Double y = e;
        Double z = x * y;
        System.out.println("multiplying  of two Double numbers "+z);


    }
    public Double mulAndReturnValue(){

        Double m = 20.5d;
        Double n = 6.2d;
        Double o = m * n;
        return o;


    }
    public Double mulByParameterAndReturnValue(Double k, Double r){

        Double y = k;
        Double l = r;
        Double m = y * l;
        return m;


    }
}
