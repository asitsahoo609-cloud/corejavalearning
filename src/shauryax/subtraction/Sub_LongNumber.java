package shauryax.subtraction;

public class Sub_LongNumber {
   public void subLogNum(){
    Long a = 38L;
    Long b = 70L;
    Long c = a - b;
    System.out.println("Value of two Long number" +c);
   }
    public void subtwolongnumByParameter(long e, long s){
        Long g = e;
        Long l = s;
        Long y = g - l;
        System.out.println("Value of two sublong numbers " +y);
    }
    public Long subAndReturnValue(){
        Long x = 35l;
        Long y = 25l;
        Long z = x - y;
        return z;

    }
    public Long subAndReturnValueByParameter(Long g, Long h){
        Long i = g;
        Long r = h;
        Long k = i - r;
        return k;

    }
}
