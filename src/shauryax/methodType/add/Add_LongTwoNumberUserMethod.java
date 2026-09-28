package shauryax.methodType.add;

public class Add_LongTwoNumberUserMethod {
    public static void main(String[] args){

        Long x = 155L;
        Long y = 255L;
        Long z = x + y;

        System.out.println("Value sum of two long numbers "+z);

        Add_LongTwoNumberUserMethod addtwolongnumbers = new Add_LongTwoNumberUserMethod();
        addtwolongnumbers.addition();

        addtwolongnumbers.additionByParameter(34L, 89L);

        Long siluValue = addtwolongnumbers.additionAndReturnValue();
        System.out.println("Value sum of two long numbers "+siluValue);

        Long asitValue = addtwolongnumbers.additionByParameterAndReturnValue(45L, 45L);
        System.out.println("Value sum of two long numbers "+asitValue);

    }
    public void addition(){

        Long a = 125L;
        Long b = 135L;
        Long c = a + b;
        System.out.println("addition of two number " +c);
    }
    public void additionByParameter(Long k, Long m){

        Long z = k;
        Long y = m;
        Long x = z + y;
        System.out.println("addition of two number " +x);
    }
    public Long additionAndReturnValue(){
        Long z = 5L;
        Long q = 10L;
        Long d = z + q;
        return d;


    }

    public Long additionByParameterAndReturnValue(Long l, Long w){
        Long z = l;
        Long q = w;
        Long d = z + q;
        return d;


    }
}
