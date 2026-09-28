package shauryax.methodType.mod;

public class modintnumbers {
    public static void main(String[] args){
        int a = 10;
        int b = 3;
        int c = a % b;
        System.out.println("Vallue of two mod numbers "+c);

        modintnumbers modintnumbers = new modintnumbers();

        modintnumbers.divison();
        modintnumbers.modByParameter(10, 7);

        int asitValue = modintnumbers.modReturnValue();
        System.out.println("Value of modintnumber modReturnValue "+asitValue);

        int siluvalue = modintnumbers.modReturnValueByParameter(78,12);
        System.out.println("Value of modintnumber modReturnValueByParameter "+siluvalue);

    }
    public void divison(){
        int c = 90;
        int d = 13;
        int e = c % d;
        System.out.println("Vallue of two mod numbers "+c);



    }

    public void modByParameter(int t, int q){
        int l = t;
        int m = q;
        int k = l % m;
        System.out.println("Vallue of two mod numbers "+k);



    }
    public int modReturnValue(){
        int w = 13;
        int b = 8;
        int r = w % b;
        return r;




    }
    public int modReturnValueByParameter(int q, int l){
        int g = q;
        int i = l;
        int t = g % i;
        return t;




    }






}
