class demo1{
int a=1;
int b=2;
void m1(){
System.out.print("this is the method without parameter.");
}
void m1(int a){
System.out.print("this is the method with parameter.");
System.out.print(a);
}
}

class demo{
  public static void main(String arv[]){
  demo1 obj = new demo1();
  obj.m1();
  obj.m1(10);
  }
}
  
