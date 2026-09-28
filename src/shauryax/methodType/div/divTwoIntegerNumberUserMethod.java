package shauryax.methodType.div;

public class divTwoIntegerNumberUserMethod {
    public static void main(String[] args){

        Integer a = 56;
        Integer b = 8;
        Integer c = a / b;
        System.out.println("Divide two Integer number "+c);
        divTwoIntegerNumberUserMethod divoftwointnumbers =  new divTwoIntegerNumberUserMethod();
        divoftwointnumbers.divison();

        divoftwointnumbers.divintNumberByParameter(12, 4);

        Integer amar = divoftwointnumbers.divAndReturnValue();
        System.out.println("Divide two Integer number divAndReturnValue = "+amar);

        Integer ok = divoftwointnumbers.divByParameterAndReturnValue(12,4);
        System.out.println("Divide two Integer number divByParameterAndReturnValue = "+ok);


    }
    public void divison(){
        Integer x = 60;
        Integer y = 5;
        Integer z = x / y;
        System.out.println("Divide two Integer number "+z);


    }
    public void divintNumberByParameter(Integer y, Integer g){
        Integer k = y;
        Integer l = g;
        Integer m = k / l;
        System.out.println("Divide two int number "+m);


    }
    public Integer divAndReturnValue(){
        Integer p = 20;
        Integer q = 4;
        Integer r = p / q;
        return r;


    }
    public Integer divByParameterAndReturnValue(Integer k, Integer r){
        int y = k;
        int l = r;
        int m = y / l;
        return m;


    }
}
