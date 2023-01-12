## there are 4 ways for taking input in java:-

class Demo{
public static void main(String arv[]){
int i = Integer.parseInt(arv[0]);
int j = Integer.parseInt(arv[1]);
int k = i + j;
System.out.println(k);
}
}


import java.util.Scanner;
class Demo{
public static void main(String arv[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter String");
String s = sc.nextLine();
sc.nextLine();
System.out.println("Enter int");
int i = sc.nextInt();
System.out.println("Enter double");
double d = sc.nextDouble();
System.out.println("String : "+ s);
System.out.println("int : "+ i);
System.out.println("double : "+ d);

}
}
/*
java.util.Scanner

String nextLine();
String next();
byte nextByte();
short nextShort();
int nextInt();
long nextLong();
float nextFloat();
double nextDouble();
*/

