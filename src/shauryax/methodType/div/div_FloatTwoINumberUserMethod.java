package shauryax.methodType.div;

public class div_FloatTwoINumberUserMethod {

    public static void main(String[] args){

        Float a = 56.20F;
        Float b = 8.2F;
        Float c = a / b;
        System.out.println("Divide two Float number "+c);
        div_FloatTwoINumberUserMethod divoftwofloatnumbers =  new div_FloatTwoINumberUserMethod();
        divoftwofloatnumbers.divison();

        divoftwofloatnumbers.divfloatNumberByParameter(20.5F, 4.3F);

        Float aarti = divoftwofloatnumbers.divAndReturnValue();
        System.out.println("Divide two Float number divAndReturnValue = "+aarti);

        Float suraj = divoftwofloatnumbers.divByParameterAndReturnValue(12.3F,4.5F);
        System.out.println("Divide two float number divByParameterAndReturnValue = "+suraj);


    }
    public void divison(){
        Float x = 60.10F;
        Float y = 5.2F;
        Float z = x / y;
        System.out.println("Divide two Float number "+z);


    }
    public void divfloatNumberByParameter(Float y, Float g){
        Float k = y;
        Float l = g;
        Float m = k / l;
        System.out.println("Divide two int number "+m);


    }
    public Float divAndReturnValue(){
        Float p = 20.5F;
        Float q = 4.3F;
        Float r = p / q;
        return r;


    }
    public Float divByParameterAndReturnValue(Float k, Float r){
        Float y = k;
        Float l = r;
        Float m = y / l;
        return m;


    }
}
