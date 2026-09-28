package shauryax.methodType.div;

public class div_LongTwoINumberUserMethod {

    public static void main(String[] args){
        Long a = 365l;
        Long b= 12l;
        Long c = a / b;
        System.out.println("Value of two div Long numbers "+c);
        div_LongTwoINumberUserMethod divtwolongnumbers = new div_LongTwoINumberUserMethod();
        divtwolongnumbers.divison();

        divtwolongnumbers.divisonByParameter(60L, 12L);

        Long asitvalue = divtwolongnumbers.divAndReturnValue();
        System.out.println("Value of two div Long numbers divAndReturnValue ="+asitvalue);

        Long siluvalue = divtwolongnumbers.divByParameterAndReturnValue(90L, 15L);
        System.out.println("Value of two div Long numbers divByParameterAndReturnValue ="+siluvalue);
    }

    public void divison(){

        Long x =  12l;
        Long y = 4l;
        Long z = x / y;
        System.out.println("Value of two div Long numbers "+z);


    }
    public void divisonByParameter(Long l, Long q){

        Long m = l;
        Long n = q;
        Long o = m / n;
        System.out.println("Value of two div Long numbers "+o);


    }
    public Long divAndReturnValue(){

        long p = 35l;
        long w = 7l;
        long s = p / w;
        return s;

    }
    public Long divByParameterAndReturnValue(Long y, Long n){

        long i = y;
        long b = n;
        long g = i / b;
        return g;

    }

}
