package shauryax.methodType.div;

public class divdoubleTwoINumberUserMethod {

    public static void main(String[] args){

        double a = 56.20d;
        double b = 8.2d;
        double c = a / b;
        System.out.println("Divide two Float number "+c);
        divdoubleTwoINumberUserMethod divoftwodoublenumbers =  new divdoubleTwoINumberUserMethod();
        divoftwodoublenumbers.divison();

        divoftwodoublenumbers.divintNumberByParameter(20.5d, 4.3d);

        double aarti = divoftwodoublenumbers.divAndReturnValue();
        System.out.println("Divide two Float number divAndReturnValue = "+aarti);

        double suraj = divoftwodoublenumbers.divByParameterAndReturnValue(12.3d,4.5d);
        System.out.println("Divide two float number divByParameterAndReturnValue = "+suraj);


    }
    public void divison(){
        double x = 60.10F;
        double y = 5.2F;
        double z = x / y;
        System.out.println("Divide two Float number "+z);


    }
    public void divintNumberByParameter(double y, double g){
        double k = y;
        double l = g;
        double m = k / l;
        System.out.println("Divide two int number "+m);


    }
    public double divAndReturnValue(){
        double p = 20.5d;
        double q = 4.3d;
        double r = p / q;
        return r;


    }
    public double divByParameterAndReturnValue(double k, double r){
        double y = k;
        double l = r;
        double m = y / l;
        return m;


    }
}
