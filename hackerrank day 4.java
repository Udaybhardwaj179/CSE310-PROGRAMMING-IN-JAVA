import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int d;
        int b= sc.nextInt();
        char c=sc.next().charAt(0);
        if (c=='+'){
            d=a+b;
            System.out.print(d);
            return;
        }
        if (c=='-'){
            if (a>b){
            d=a-b;
            System.out.print(d);
            return;
            }
            else{
                d=b-a;
                System.out.print(d);
                return;
            }
        }
        if (c=='*'){
            d=a*b;
            System.out.print(d);
            return;
        }
        if (c=='/'){
            d=b/a;
            System.out.print(d);
            return ;
        }
        if (c!='-'||c!='+'|| c!='*' || c!= '/'){
            System.out.print("Invalid arithmetic operators");
        }
        
    }
}
