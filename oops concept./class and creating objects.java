class Demo1 {
  int a;
  int b;
  void m1(){
    
    System.out.println("a :"+a);
    System.out.println("b :"+b);
  }
}
// for creating the object we have to make a seprate class which contains the object of the main classes .
public class demo {
  public static void main (String arc[]){
    Demo1 obj =new Demo1();
    obj.m1();
  }
}
