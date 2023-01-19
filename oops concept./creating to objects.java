class Demo1{
int a;
static int b;
void m1(){
System.out.println("a : "+a);
System.out.println("b : "+b);
}
}

class Demo{
public static void main(String arv[]){
Demo1 obj = new Demo1();
Demo1 obj2 = new Demo1();

obj.a = 10;
obj.b = 20;

obj.m1();
obj2.m1();
System.out.println(Demo1.b);
}
}
