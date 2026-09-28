package shauryax.methodType.add;

public class AddlongTwoNumberUserMethod {
    public static void main(String[] args){

        long x = 55l;
        long y = 55l;
        long z = x + y;

        System.out.println("Value sum of two long numbers "+z);

        AddlongTwoNumberUserMethod addtwolongnumbers = new AddlongTwoNumberUserMethod();
        addtwolongnumbers.addition();

        addtwolongnumbers.additionByParameter(20l,33l);

        long siluValue = addtwolongnumbers.additionAndReturnValue();
        System.out.println("Value sum of two long numbers "+siluValue);

        long asitValue = addtwolongnumbers.additionByParameterAndReturnValue(13l, 15l);
        System.out.println("Value sum of two long numbers "+asitValue);
    }
    public void addition(){

        long a = 125l;
        long b = 135l;
        long c = a + b;
        System.out.println("addition of two number " +c);
    }
    public void additionByParameter(long k, long m){

        long z = k;
        long y = m;
        long x = z + y;
        System.out.println("addition of two number " +x);
    }
    public long additionAndReturnValue(){
        long a = 5;
        long b = 10;
        long c = a + b;
        return c;


    }
    public long additionByParameterAndReturnValue(long d, long e){
        long c = d;
        long a = e;
        long b = c + a;
        return b;


    }
}
