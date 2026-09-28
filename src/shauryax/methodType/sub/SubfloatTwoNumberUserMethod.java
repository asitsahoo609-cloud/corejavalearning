package shauryax.methodType.sub;

public class SubfloatTwoNumberUserMethod {
    public static void main(String[] args){


        float a = 73.4f;
        float c = 20.3f;
        float b = a - c;

        System.out.println("Value of two float subtraction " +b);

        SubfloatTwoNumberUserMethod suboftwofloatnumbers = new SubfloatTwoNumberUserMethod();

        suboftwofloatnumbers.subtraction();

      suboftwofloatnumbers.subtractionByParameter(56.6f,44.2f);

      float asitValue = suboftwofloatnumbers.subtractionAndReturnValue();
      System.out.println("Value of two float subtractionAndReturnValue " +asitValue);

      float siluValue = suboftwofloatnumbers.subByParameterAndReturnValue(45.2f, 20.1f );
      System.out.println("Value of two float subByParameterAndReturnValue " +siluValue);

    }
    public void subtraction(){
        float x = 178.4f;
        float c = 20.2f;
        float z = x - c;

        System.out.println("Value of two float subtraction " +z);


    }
    public void subtractionByParameter(float l, float k){
        float b = l;
        float v = k;
        float m = b - v;

        System.out.println("Value of two float subtraction " +m);


    }
    public float subtractionAndReturnValue(){
        float h = 56.8f;
        float k = 10.5f;
        float y = h - k;
        return y;

    }
    public float subByParameterAndReturnValue(float e, float m ){
        float s = e;
        float r = m;
        float x = s - r;
        return x;


    }

}
