package shauryax.methodType.mul;

public class mul_LongTwoNumberUserMethod {
    public static void main(String[] args){

        Long x = 780L;
        Long y = 830L;
        Long z = x * y;
        System.out.println("Sum of two Long numbers =" +z);

        mul_LongTwoNumberUserMethod mutipicationoftwolongnumbers = new mul_LongTwoNumberUserMethod();
        mutipicationoftwolongnumbers.multipication();

        mutipicationoftwolongnumbers.mulByParameter(34L, 2L);

        Long siluValue = mutipicationoftwolongnumbers.mulAndReturnValue();
        System.out.println("mul of two Long numbers mulAndReturnValue =" +siluValue);

        Long asitValue = mutipicationoftwolongnumbers.mulByParameterAndReturnValue(20L,10L);
        System.out.println("mul of two Long numbers mulByParameterAndReturnValue = " +asitValue);

    }
    public void multipication(){
        Long a = 8L;
        Long b = 3L;
        Long c = a * b;
        System.out.println("Sum of two Float numbers =" +c);


    }
    public void mulByParameter(Long m, Long n){

        Long z = m;
        Long t = n;
        Long i = z * t;

    }
    public Long mulAndReturnValue(){
        Long w = 20L;
        Long e = 3L;
        Long f = w * e;
        return f;


    }
    public Long mulByParameterAndReturnValue(Long f, Long g){
        Long r = f;
        Long s = g;
        Long a = r * s;
        return a;


    }

}
