package shauryax.Divison;

public class DivTwodoubleNumbersTest {

    public static void main(String[] args){
        DivTwodoubleNumbers divdouble = new DivTwodoubleNumbers();
        divdouble.divison();
        divdouble.divisonByParamter(80.4d, 40.2d);

        double silu = divdouble.divAndReturnValue();
        System.out.println("div and return value "+silu);

        double rina = divdouble.divAndReturnValueByParameter(18.4d, 9.2d);
        System.out.println("div and return value by parameter"+rina);
    }
}
