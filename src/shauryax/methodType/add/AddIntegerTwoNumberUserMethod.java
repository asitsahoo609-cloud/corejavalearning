package shauryax.methodType.add;

public class AddIntegerTwoNumberUserMethod {
    public static void main(String[] args){

        Integer x = 75;
        Integer y = 35;
        Integer z = x + y;
        System.out.println("Value sum of x and y "+z);

        AddIntegerTwoNumberUserMethod addTwoIntegerNumber = new AddIntegerTwoNumberUserMethod();
        addTwoIntegerNumber.addition();

        addTwoIntegerNumber.additionByParameter(100,500);

        int asitValue = addTwoIntegerNumber.additionAndReturnValue();
        System.out.println("Sum of asitValue =" +asitValue);

        int siluValue = addTwoIntegerNumber.additionByParameterAndReturnValue(200, 100);
        System.out.println("Sum of siluValue =" +siluValue);

    }
    public void addition(){
        Integer a = 85;
        Integer b = 85;
        Integer c = a + b;
        System.out.println("Value sum of x and y "+c);

    }
    public void additionByParameter(int w, int s){
        Integer a = w;
        Integer b = s;
        Integer c = a + b;
        System.out.println("parameter addition of two number "+c);

    }
    public int additionAndReturnValue(){
        Integer x = 10;
        Integer y = 20;
        Integer p = x + y;
        return p;
    }

    public int additionByParameterAndReturnValue(int u, int v){
        int x = u;
        int y = v;
        int z = x + y;
        return z;



    }

}
