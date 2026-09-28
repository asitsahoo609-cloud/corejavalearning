package shauryax.multipication;

public class MulTwoIntNumbers {
    public void multipication1(){
        int a = 50;
        int b = 60;
        int c = a * b;
        System.out.println("mul of two number is "+c);

    }
    public void mulByParameter(int k,  int l){
        int t = k;
        int q = l;
        int r = t * q;
        System.out.println("parameter addition of two number is  "+ r);
    }

    public int mulAndReturnValue(){
        int x = 5;
        int y = 6;
        int z = x * y;
        return z;
    }

    public int mulByParameterAndReturnValue(int u, int v){
        int o = u;
        int w = v;
        int n = o * w;
        return n;
    }


}
