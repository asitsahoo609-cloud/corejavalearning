package shauryax.Divison;

public class DivTwointgerNumbersTest {
    public static void main(String[] args){
    DivTwointgerNumbers divTwointgerNumber = new DivTwointgerNumbers();

    divTwointgerNumber.divison();
    divTwointgerNumber.divisonByParamter(15, 3);

   Integer adisk  = divTwointgerNumber.divAndReturnValue();
   System.out.println("value return of two intger number" +adisk);

   Integer silk = divTwointgerNumber.divAndReturnValueByParameter(45, 9);
   System.out.println("value return of two intger number" +silk);

    }
}
