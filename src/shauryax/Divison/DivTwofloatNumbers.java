package shauryax.Divison;

public class DivTwofloatNumbers {

    public void divison(){
        float a = 35.28f;
        float b = 7.4f;
        float c = a / b;
        System.out.println("value of div two float num" +c);

    }
    public void divisonByParamter(float j, float k){
        float x = j;
        float y = k;
        float z = x / y;
        System.out.println("value of div two float num" +z);

    }


    public float divAndReturnValue(){
        float m = 40.4f;
        float n = 4.2f;
        float l = m / n;
        return l;

    }

    public float divAndReturnValueByParameter(float p, float q){
        float j = p;
        float k = q;
        float n = j / k;
        return k;


    }
}
