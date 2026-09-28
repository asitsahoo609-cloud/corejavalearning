package shauryax.multipication;

public class MulTwodoubleNumbers {

    public void multipication1(){
        double a = 30.2d;
        double b = 6.2d;
        double c = a * b;
        System.out.println("mul of two number is "+c);

    }
    public void mulByParameter(double k,  double l){
        double t = k;
        double q = l;
        double r = t * q;
        System.out.println("parameter mul of two number is  "+ r);
    }

    public double mulAndReturnValue(){
        double x = 8.2d;
        double y = 6.2d;
        double z = x * y;
        return z;
    }

    public double mulByParameterAndReturnValue(double u, double v){
        double o = u;
        double w = v;
        double n = o * w;
        return n;
    }




}
