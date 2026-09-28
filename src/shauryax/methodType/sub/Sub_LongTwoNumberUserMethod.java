package shauryax.methodType.sub;

public class Sub_LongTwoNumberUserMethod {

    public static void main(String[] args){

        Long x = 54L;
        Long y = 20L;
        Long z = x - y;

        System.out.println("Value of two long subtraction " +z);

        Sub_LongTwoNumberUserMethod subtwolongnumbers = new Sub_LongTwoNumberUserMethod();
        subtwolongnumbers.subtraction();

        subtwolongnumbers.subtractionByParameter(556L, 200L);

        Long asit1 = subtwolongnumbers.subtractionAndRetunValue();
        System.out.println("Value of two long subtractionAndRetunValue " +asit1);

        Long silu1 = subtwolongnumbers.subByParameterAndReturnValue(23L,8L);
        System.out.println("Value of two long subByParameterAndReturnValue " +silu1);

    }
    public void subtraction(){

        Long a = 45L;
        Long b = 22L;
        Long c = a - b;

        System.out.println("Value of two long subtraction " +c);



    }
    public void subtractionByParameter(Long s, Long p){

        Long z = s;
        Long q = p;
        Long r = z - q;

        System.out.println("Value of two long subtractionByParameter " +r);



    }
    public Long subtractionAndRetunValue(){

        Long t = 23L;
        Long r = 20L;
        Long p = t - r;
        return p;




    }
    public long subByParameterAndReturnValue(Long r,Long g ){

        Long q = r;
        Long e = g;
        Long y = q - e;
        return y;




    }

}
