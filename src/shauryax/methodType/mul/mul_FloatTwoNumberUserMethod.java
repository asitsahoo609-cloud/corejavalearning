package shauryax.methodType.mul;

public class mul_FloatTwoNumberUserMethod {

    public static void main(String[] args){

        Float a = 35.1F;
        Float b = 2.2F;
        Float c = a * b;

        System.out.println("multiplying  of two Float numbers "+c);
        mul_FloatTwoNumberUserMethod muloftwoFloatnumbers = new mul_FloatTwoNumberUserMethod();
        muloftwoFloatnumbers.multipication();

        muloftwoFloatnumbers.mulfloatNumberByParameter(50.1F,2.2F);

        Float guduValue = muloftwoFloatnumbers.mulAndReturnValue();
        System.out.println("multiplying  of two Float numbers mulAndReturnValue "+guduValue);

        Float siluVlaue = muloftwoFloatnumbers.mulByParameterAndReturnValue(2.2F, 3.2F);
        System.out.println("multiplying  of two Float numbers mulByParameterAndReturnValue "+siluVlaue);
    }
    public void multipication(){

        Float x = 33.2F;
        Float y = 2.2F;
        Float z = x * y;

        System.out.println("multiplying  of two Float numbers "+z);

    }
    public void mulfloatNumberByParameter(Float b, Float c){

        Float m = b;
        Float n = c;
        Float y = m * n;

    }
    public Float mulAndReturnValue(){

        Float p = 30.2F;
        Float q = 2.1F;
        Float r = p * q;
        return r;
    }

    public Float mulByParameterAndReturnValue(Float e, Float f){

        Float i = e;
        Float b = f;
        Float g = i * b;
        return g;

    }

}
