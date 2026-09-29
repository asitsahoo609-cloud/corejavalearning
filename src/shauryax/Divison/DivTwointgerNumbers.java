package shauryax.Divison;

public class DivTwointgerNumbers {
   public void divison(){
    Integer a = 34;
    Integer b = 34;
    Integer c = a / b;
    System.out.println("value of div two integer num" +c);

   }
    public void divisonByParamter(Integer j, Integer k){
        Integer x = j;
        Integer y = k;
        Integer z = x / y;
        System.out.println("value of div two integer num" +z);

    }


    public Integer divAndReturnValue(){
        Integer m = 35;
        Integer n = 5;
        Integer l = m / n;
        return l;

    }

    public Integer divAndReturnValueByParameter(Integer p, Integer q){
        Integer j = p;
        Integer k = q;
        Integer n = j / k;
        return k;


    }

}
