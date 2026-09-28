package shauryax.Divison;

public class DivTwointNumbers {

    public void multipication1(){
        int a = 30;
        int b = 6;
        int c = a / b;
        System.out.println("mul of two number is "+c);

    }
    public void mulByParameter(int k,  int l){
        int t = k;
        int q = l;
        int r = t / q;
        System.out.println("parameter mul of two number is  "+ r);
    }

    public int mulAndReturnValue(){
        int x = 8;
        int y = 4;
        int z = x / y;
        return z;
    }

    public int mulByParameterAndReturnValue(int u, int v){
        int o = u;
        int w = v;
        int n = o / w;
        return n;
    }




}
