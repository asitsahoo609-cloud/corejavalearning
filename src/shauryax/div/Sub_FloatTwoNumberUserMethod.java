package shauryax.div;



public class Sub_FloatTwoNumberUserMethod {

    public static void main(String[] args){


        Float x = 54.4F;
        Float y = 20.2F;
        Float z = x - y;

        System.out.println("Value of two float subtraction " +z);

        //objet we have to make like this
        Sub_FloatTwoNumberUserMethod suboftwoFloatnumbers = new Sub_FloatTwoNumberUserMethod();

        suboftwoFloatnumbers.subtraction();

        suboftwoFloatnumbers.subtractionByParameter(20.5F, 10.3F);

        Float asitValue = suboftwoFloatnumbers.subtractionAndReturnValue();
        System.out.println("Value of two float subtractionAndReturnValue " +asitValue);

        Float silu = suboftwoFloatnumbers.subByParameterAndReturnValue(45.3f,21.2f);
        System.out.println("Value of two float subByParameterAndReturnValue " +silu);

    }
    public void subtraction(){
        Float a = 56.5F;
        Float b = 20.3F;
        Float c = a - b;

        System.out.println("Value of two float subtraction " +c);


    }
    public void subtractionByParameter(Float k, Float m){
        Float a = k;
        Float b = m;
        Float c = a - b;

        System.out.println("Value of two float subtraction " +c);


    }

    public Float subtractionAndReturnValue(){
        Float j = 45.5F;
        Float m = 20.3F;
        Float n = j - m;
        return n;



    }
    public Float subByParameterAndReturnValue(Float r, Float s ){
        Float b = r;
        Float k = s;
        Float t = b - k;
        return t;



    }
}
