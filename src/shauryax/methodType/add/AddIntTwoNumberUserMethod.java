package shauryax.methodType.add;

public class AddIntTwoNumberUserMethod {

    public static void main(String[] args){

    int x = 35;
    int y = 35;
    int z = x + y;

    System.out.println("Value sum of x and y "+z);

    //addition()
    AddIntTwoNumberUserMethod addTwoNumber = new AddIntTwoNumberUserMethod();
    addTwoNumber.addition();

    addTwoNumber.additionByParameter(7, 8);

    int asitValue = addTwoNumber.additionAndReturnValue();
    System.out.println("sum of asit  = "  +asitValue);

    int siluValue = addTwoNumber.additionByParameterAndReturnValue(100, 200);
    System.out.println("sum of siluValue  = "  +siluValue);

    }

    public void addition(){

        int a = 25;
        int b = 35;
        int c = a + b;
        System.out.println("addition of two number " +c);
    }

    public void additionByParameter(int a, int b){

        int m = a;
        int n = b;
        int o = m + n;
        System.out.println("parameter addition of two number " +o);
    }

    public int additionAndReturnValue(){
        int a = 5;
        int b = 10;
        int c = a + b;
        return c;


    }

    public int additionByParameterAndReturnValue(int u, int v){

        int w = u;
        int x = v;
        int z = w + x;
        return z;



    }












}
