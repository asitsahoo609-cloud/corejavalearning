package shauryax.methodType.add;

public class Add_FloatTwoNumberUserMethod {
    public static void main(String[] args){

        Float x = 780.2f;
        Float y = 830.2f;
        Float z = x + y;
        System.out.println("Sum of two Float numbers =" +z);

        Add_FloatTwoNumberUserMethod addfloattwonumber = new Add_FloatTwoNumberUserMethod();
        addfloattwonumber.addition();

        addfloattwonumber.additionByParameter(34.5f, 20.3f);

        float siluValue = addfloattwonumber.additionAndReturnValue();
        System.out.println("Sum of two Float numbers =" +siluValue);

        float asitValue = addfloattwonumber.additionByParameterAndReturnValue(20.3f,10.3f);
        System.out.println("Sum of two Float numbers =" +asitValue);

    }
 public void addition(){
     Float a = 80.2f;
     Float b = 30.2f;
     Float c = a + b;
     System.out.println("Sum of two Float numbers =" +c);


 }
    public void additionByParameter(Float m, Float n){

        Float z = m;
        Float t = n;
        float b = z + t;

    }
    public Float additionAndReturnValue(){
        Float w = 5.3f;
        Float e = 3.3f;
        Float f = w + e;
        return f;


    }
    public Float additionByParameterAndReturnValue(float f, float g){
        Float r = f;
        Float s = g;
        Float a = r + s;
        return a;


    }

}
