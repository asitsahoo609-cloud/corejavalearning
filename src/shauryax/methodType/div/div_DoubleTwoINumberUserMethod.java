package shauryax.methodType.div;

public class div_DoubleTwoINumberUserMethod {
    public static void main(String[] args){

        Double a = 56.20D;
        Double b = 8.2d;
        Double c = a / b;
        System.out.println("Divide two Double number "+c);
        div_DoubleTwoINumberUserMethod divoftwodoublenumbers =  new div_DoubleTwoINumberUserMethod();
        divoftwodoublenumbers.divison();

        divoftwodoublenumbers.divfloatNumberByParameter(20.5D, 4.3D);

        Double aarti = divoftwodoublenumbers.divAndReturnValue();
        System.out.println("Divide two double number divAndReturnValue = "+aarti);

        Double suraj = divoftwodoublenumbers.divByParameterAndReturnValue(12.3D,4.5D);
        System.out.println("Divide two double number divByParameterAndReturnValue = "+suraj);


    }
    public void divison(){
        Double x = 60.10D;
        Double y = 5.2D;
        Double z = x / y;
        System.out.println("Divide two Double number "+z);


    }
    public void divfloatNumberByParameter(Double y, Double g){
        Double k = y;
        Double l = g;
        Double m = k / l;
        System.out.println("Divide two Double number "+m);


    }
    public Double divAndReturnValue(){
        Double p = 20.5D;
        Double q = 4.3D;
        Double r = p / q;
        return r;


    }
    public Double divByParameterAndReturnValue(Double k, Double r){
        Double y = k;
        Double l = r;
        Double m = y / l;
        return m;


    }
}
