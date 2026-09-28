package shauryax.methodType.add;

public class AdddoubleTwoNumberUserMethod {
    public static void main(String[] args){
        double x = 255d;
        double y = 355d;
        double z = x + y;

        System.out.println("Value sum of two double numbers "+z);

        AdddoubleTwoNumberUserMethod addtwodoublenumbers = new AdddoubleTwoNumberUserMethod();
        addtwodoublenumbers.addition();

        addtwodoublenumbers.additionByParameter(2.3d, 5.1d);

        double siluValue = addtwodoublenumbers.additionAndReturnValue();
        System.out.println("Value sum of two double numbers additionreturnValue = "+siluValue);

        double asitValue = addtwodoublenumbers.additionByParameterAndReturnValue(24.2d, 25.2d);
        System.out.println("Value sum of two double numbers additionbyparameterreturn = "+asitValue);


    }
    public void addition(){
        double a = 12.5d;
        double b = 13.5d;
        double c = a + b;
        System.out.println("addition of two double number " +c);



    }
    public void additionByParameter(double d, double c ){
        double a = d;
        double b = c;
        double e = a + b;
        System.out.println("addition of two double number " +c);


    }
    public double additionAndReturnValue(){
        double z = 53.2d;
        double q = 10.2d;
        double d = z + q;
        return d;


    }
    public double additionByParameterAndReturnValue(double l, double w){
        double z = l;
        double q = w;
        double d = z + q;
        return d;


    }
}
