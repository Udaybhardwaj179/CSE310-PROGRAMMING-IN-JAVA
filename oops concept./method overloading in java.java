// methods having the same name but different function with diffrent parameters.
// compile time plymorphism example is method overloading.
class Demo1 {
  vid m1(){
    System.out.print("hello");
  }
  void m1 (int a){
    System.out.print(a);
  }
}
class Demo{
  public static  void main(string arc[]){
    Demo1 obj =new Demo1();
    obj.m1();
    obj.m1(10);
  } 
}

      
