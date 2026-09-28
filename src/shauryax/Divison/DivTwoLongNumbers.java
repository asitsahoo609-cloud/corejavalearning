package shauryax.Divison;

public class DivTwoLongNumbers {

    public void divison(){
        Long a = 35L;
        Long b = 7L;
        Long c = a / b;
        System.out.println("value of div two Long num" +c);

    }
    public void divisonByParamter(Long j, Long k){
        Long x = j;
        Long y = k;
        Long z = x / y;
        System.out.println("value of div two Long num" +z);

    }


    public Long divAndReturnValue(){
        Long m = 40L;
        Long n = 4L;
        Long l = m / n;
        return l;

    }

    public Long divAndReturnValueByParameter(Long p, Long q){
        Long j = p;
        Long k = q;
        Long n = j / k;
        return k;


    }
}
