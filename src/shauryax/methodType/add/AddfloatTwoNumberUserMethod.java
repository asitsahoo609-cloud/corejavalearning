package shauryax.methodType.add;

public class AddfloatTwoNumberUserMethod {
    public static void main(String[] args){
    float x = 70.2f;
    float y = 80.2f;
    float z = x + y;
    System.out.println("Sum of two float numbers =" +z);

    AddfloatTwoNumberUserMethod addtwofloatnumber = new AddfloatTwoNumberUserMethod();
    addtwofloatnumber.addition();

    addtwofloatnumber.additionByParameter(5.2f, 2.3f);

    float siluValue = addtwofloatnumber.additionAndReturnValue();
    System.out.println("sum Value of two float numbers = "+siluValue);

    float asitValue = addtwofloatnumber.additionByParameterAndReturnValue(12.2f,22.2f);
    System.out.println("sum Value of two float numbers = " +asitValue);

    }
  public void addition(){
      float a = 25.8f;
      float b = 35.8f;
      float c = a + b;
      System.out.println("addition of two number " +c);

  }
  public void additionByParameter(float k, float l){

      float t = k;
      float q = l;
      float b = t + q;

  }
  public float additionAndReturnValue(){
      float d = 73.5f;
      float e = 90.3f;
      float f = d + e;
      return f;


  }
  public float additionByParameterAndReturnValue(float f,float k){
      float y = f;
      float e = k;
      float t =  y + e;
      return t;

  }

}
