import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner (System.in);
        int a= sc.nextInt();
        if (a<9 || a>9999){
            System.out.print("invalid input");
            return;
            
        }
        int reminder=0;
        int reversed=0;
        int n=a;
        while(n>0){
             reminder=n%10;
            reversed=reversed*10+reminder;
            n=n/10;
        }
        if (reversed==a){
            System.out.print("number is palindrome");
        }
        else{
            System.out.print("number is not palindrome");
        }
        
    }
}

