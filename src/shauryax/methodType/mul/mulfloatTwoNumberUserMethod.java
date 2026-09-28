package shauryax.methodType.mul;

public class mulfloatTwoNumberUserMethod {
    public static void main(String[] args){

        float a = 35.1f;
        float b = 2.2f;
        float c = a * b;

        System.out.println("multiplying  of two float numbers "+c);
        mulfloatTwoNumberUserMethod muloftwofloatnumbers = new mulfloatTwoNumberUserMethod();
        muloftwofloatnumbers.multipication();

        muloftwofloatnumbers.mulfloatNumberByParameter(50.1f,2.2f);

        float guduValue = muloftwofloatnumbers.mulAndReturnValue();
        System.out.println("multiplying  of two float numbers mulAndReturnValue "+guduValue);

        float siluVlaue = muloftwofloatnumbers.mulByParameterAndReturnValue(2.2f, 3.2f);
        System.out.println("multiplying  of two float numbers mulByParameterAndReturnValue "+siluVlaue);
    }
public void multipication(){

    float x = 33.2f;
    float y = 2.2f;
    float z = x * y;

    System.out.println("multiplying  of two float numbers "+z);

}
public void mulfloatNumberByParameter(float b, float c){

    float m = b;
    float n = c;
    float y = m * n;

}
    public float mulAndReturnValue(){

        float p = 30.2f;
        float q = 2.1f;
        float r = p * q;
        return r;
    }

    public float mulByParameterAndReturnValue(float e, float f){

        float i = e;
        float b = f;
        float g = i * b;
        return g;

    }
}
