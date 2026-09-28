package shauryax.methodType.div;

public class divfloatTwoINumberUserMethod {

    public static void main(String[] args){

        float a = 56.20f;
        float b = 8.2f;
        float c = a / b;
        System.out.println("Divide two float number "+c);
        divfloatTwoINumberUserMethod divoftwofloatnumbers =  new divfloatTwoINumberUserMethod();
        divoftwofloatnumbers.divison();

        divoftwofloatnumbers.divintNumberByParameter(20.5f, 4.3f);

        float aarti = divoftwofloatnumbers.divAndReturnValue();
        System.out.println("Divide two float number divAndReturnValue = "+aarti);

        float suraj = divoftwofloatnumbers.divByParameterAndReturnValue(12.3f,4.5f);
        System.out.println("Divide two float number divByParameterAndReturnValue = "+suraj);


    }
    public void divison(){
        float x = 60.10f;
        float y = 5.2f;
        float z = x / y;
        System.out.println("Divide two float number "+z);


    }
    public void divintNumberByParameter(float y, float g){
        float k = y;
        float l = g;
        float m = k / l;
        System.out.println("Divide two int number "+m);


    }
    public float divAndReturnValue(){
        float p = 20.5f;
        float q = 4.3f;
        float r = p / q;
        return r;


    }
    public float divByParameterAndReturnValue(float k, float r){
        float y = k;
        float l = r;
        float m = y / l;
        return m;


    }


}
