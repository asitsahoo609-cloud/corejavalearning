package shauryax.methodType.add;

public class Add_DoubleTwoNumberUserMethod {
    public static void main(String[] args){
        Double x = 50.2D;
        Double y = 60.2D;
        Double z = x + y;

        System.out.println("Sum of two Double number "+z);

        Add_DoubleTwoNumberUserMethod addtwodoubenumber = new Add_DoubleTwoNumberUserMethod();
        addtwodoubenumber.addition();

        addtwodoubenumber.additionByParameter(33.2, 10.2);

        Double siluValue = addtwodoubenumber.additionAndReturnValue();
        System.out.println("Sum of two Double numbers additionAndReturnValue = "+siluValue);

        Double asitValue = addtwodoubenumber.additionByParameterAndReturnValue(23.2D, 22.2D);
        System.out.println("Sum of two Double numbers additionByParameterAndReturnValue = "+asitValue);



    }
public void addition(){
    Double a = 55.2D;
    Double b = 60.2D;
    Double c = a + b;
    System.out.println("Sum of two Double number addition "+c);

}
    public void additionByParameter(Double k, Double l){
        Double f = k;
        Double g = l;
        Double y = f + g;
        System.out.println("Sum of two Double number addition "+y);

    }
    public double additionAndReturnValue(){
        Double h = 56.2D;
        Double k = 10.2D;
        Double y = h + k;
        return y;


    }
    public Double additionByParameterAndReturnValue(Double e, Double m ){
        Double s = e;
        Double r = m;
        Double x = s + r;
        return x;


    }
}
