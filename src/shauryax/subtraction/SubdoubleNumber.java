package shauryax.subtraction;

public class SubdoubleNumber {
    public void subFloat(){
        double a = 34.5d;
        double b = 24.2d;
        double c = a - b;
        System.out.println("Value of two double numbers "+c);
    }
    public void subFloatByParameter(double G,double H){
        double x = G;
        double y = H;
        double z = x - y;
        System.out.println("Value of two double numbers "+z);


    }
    public double subdoubleAndReturnValue(){
        double l = 39.2d;
        double r = 20.1d;
        double w = l - r;
        return w;

    }
    public double subdoubleAndReturnValueByParameter(double t, double r){
        double g = t;
        double h = r;
        double i = g - h;
        return i;

    }
}
