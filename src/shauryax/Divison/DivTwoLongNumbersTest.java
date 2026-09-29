package shauryax.Divison;

public class DivTwoLongNumbersTest {
    public static void main(String[] args){

        DivTwoLongNumbers divTwoLongNumbers = new DivTwoLongNumbers();

        divTwoLongNumbers.divison();
        divTwoLongNumbers.divisonByParamter(45L, 9L);

        Long gudu = divTwoLongNumbers.divAndReturnValue();
        System.out.println("value return of two intger number divAndReturnValue" +gudu);

        Long asit = divTwoLongNumbers.divAndReturnValueByParameter(125L, 25L);
        System.out.println("value return of two intger number divAndReturnValueByParameter" +asit);


    }


}
