package shauryax.methodType.sub;

public class SubIntTwoNumberUserMethod {
    public static  void main(String[] args){

        int v = 30;
        int t = 20;
        int z = v - t;

        System.out.println("Value of two integer subtraction " +z);
        SubIntTwoNumberUserMethod subintoftwonumbers = new SubIntTwoNumberUserMethod();
        subintoftwonumbers.subtraction();

        subintoftwonumbers.subtractionByParameter(23,8);


        int siluValue = subintoftwonumbers.subtractionAndReturnValue();
        System.out.println("Value of two integer additionAndReturnValue " +siluValue);

        int asit = subintoftwonumbers.subByParameterAndReturnValue(45, 5);
        System.out.println("Value of two integer subByParameterAndReturnValue " +asit);

    }
    public  void subtraction(){

        int x = 30;
        int y = 25;
        int m = x - y;

        System.out.println("Value of two integer subtraction " +m);

    }
    public  void subtractionByParameter(int m, int l){

        int x = m;
        int y = l;
        int k = x - y;

        System.out.println("Value of two integer subtractionByParameter " +k);

    }
    public int subtractionAndReturnValue(){
        int h = 56;
        int k = 10;
        int y = h - k;
        return y;


    }
    public int subByParameterAndReturnValue(int e, int m ){
        int s = e;
        int r = m;
        int x = s - r;
        return x;


    }

}
