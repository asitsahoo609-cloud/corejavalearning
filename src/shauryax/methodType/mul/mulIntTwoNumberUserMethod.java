package shauryax.methodType.mul;

public class mulIntTwoNumberUserMethod {
public static void main(String[] args){

    int a = 50;
    int b = 2;
    int c =  a * b;

    System.out.println("mutiplying value of two integer " +c);

    mulIntTwoNumberUserMethod multipicationoftwointnumbers = new mulIntTwoNumberUserMethod();
    multipicationoftwointnumbers.multipication();

    multipicationoftwointnumbers.mulByParameter(25, 3);

    int kumar =  multipicationoftwointnumbers.mulAndReturnValue();
    System.out.println("Multiplying two number and retuen value mulAndReturnValue " +kumar);

    int sahoo =  multipicationoftwointnumbers.mulByParameterAndReturnValue(23,5);
    System.out.println("Multiplying two number and retuen value  mulByParameterAndReturnValue "  +sahoo);
}
public void multipication(){

    int p = 25;
    int q = 2;
    int r =  p * q;

    System.out.println("mutiplying value of two integer " +r);


}
    public void mulByParameter(int a , int b){

        int p = a;
        int q = b;
        int r =  p * q;

        System.out.println("mutiplying value of two integer " +r);


    }
    public int mulAndReturnValue(){
        int z = 5;
        int m = 10;
        int r = z * m;
        return r;


    }
    public int mulByParameterAndReturnValue(int u, int v){
        int w = u;
        int x = v;
        int z = w * x;
        return z;

    }


}
