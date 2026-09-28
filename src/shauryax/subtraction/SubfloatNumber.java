package shauryax.subtraction;

public class SubfloatNumber {

    public void subfloatnumber(){
        float a = 35.50f;
        float b = 28.3f;
        float c = a - b;
        System.out.println("Value of two float numbers "+c);


    }
    public void subtwofloatnumByParameter(float l,float m){

        float x = l;
        float y = m;
        float z = x - y;
        System.out.println("Value of two float numbers "+z);

    }
    public float subAndReturnValue(){

        float n = 45.2f;
        float l = 30.1f;
        float k = n - l;
        return k;


    }
    public float subAndReturnValueByParameter(float t, float r){

        float n = t;
        float l = r;
        float k = n - l;
        return k;


    }

}