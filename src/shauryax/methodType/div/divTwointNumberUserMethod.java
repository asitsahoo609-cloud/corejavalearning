package shauryax.methodType.div;

public class divTwointNumberUserMethod {
    public static void main(String[] args){

        int a = 56;
        int b = 8;
        int c = a / b;
        System.out.println("Divide two int number "+c);
        divTwointNumberUserMethod divoftwointnumbers =  new divTwointNumberUserMethod();
        divoftwointnumbers.divison();

        divoftwointnumbers.divintNumberByParameter(12, 4);

        int amar = divoftwointnumbers.divAndReturnValue();
        System.out.println("Divide two int number divAndReturnValue = "+amar);

        int ok = divoftwointnumbers.divByParameterAndReturnValue(12,4);
        System.out.println("Divide two int number divByParameterAndReturnValue = "+ok);


    }
    public void divison(){
        int x = 60;
        int y = 5;
        int z = x / y;
        System.out.println("Divide two int number "+z);


    }
    public void divintNumberByParameter(int y, int g){
        int k = y;
        int l = g;
        int m = k / l;
        System.out.println("Divide two int number "+m);


    }
    public int divAndReturnValue(){
        int p = 20;
        int q = 4;
        int r = p / q;
        return r;


    }
    public int divByParameterAndReturnValue(int k, int r){
        int y = k;
        int l = r;
        int m = y / l;
        return m;


    }
}
