class Demo1{
static{
System.out.println("4");
}
Demo1(){
System.out.println("1");
}
Demo1(int c){
System.out.println("2");
}
void m1(){
System.out.println("3");
}
static void m2(){
System.out.println("5");
}
static{
System.out.println("6");
}
}
class Demo{
static{
System.out.println("Main-static");
}
public static void main(String arv[]){
Demo1 obj = new Demo1();
Demo1.m2();
obj.m1();
Demo1 obj2 = new Demo1(10);
obj2.m1();
}
}
