package shauryax.subtraction;

public class Sub_FloatNumber {
    public void subFloat(){
        Float a = 34.5F;
        Float b = 24.2F;
        Float c = a - b;
        System.out.println("Value of two Float numbers "+c);
    }
    public void subFloatByParameter(Float G,Float H){
        Float x = G;
        Float y = H;
        Float z = x - y;
        System.out.println("Value of two Float numbers "+z);


    }
    public Float subFloatAndReturnValue(){
        Float m = 39.2F;
        Float n = 20.1F;
        Float o = m - n;
        return o;

    }
    public Float subFloatAndReturnValueByParameter(Float t, Float r){
        Float p = t;
        Float f = r;
        Float l = p - f;
        return l;

    }

}
