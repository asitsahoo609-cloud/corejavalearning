package shauryax.Divison;

public class DivTwofloatNumbersTest {

    public static void main(String[] args){
        DivTwofloatNumbers divfloat = new DivTwofloatNumbers();
        divfloat.divison();
        divfloat.divisonByParamter(80.4f, 40.2f);

        float silu = divfloat.divAndReturnValue();
        System.out.println("div and return value "+silu);

        float rina = divfloat.divAndReturnValueByParameter(18.4f, 9.2f);
        System.out.println("div and return value by parameter"+rina);
    }

}
