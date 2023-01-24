import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int num = a;
        int dec_value = 0;
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
 
            dec_value += last_digit * base;
 
            base = base * 2;
        }
 
        if (dec_value>=65 && dec_value <=90){
        String str = new Character((char) dec_value).toString();
        System.out.println(str);
        }
        else{
            System.out.println("INVALID PAPER CODE");
        }
       
    }
}
// https://www.hackerrank.com/contests/cse310-k21gp-day7/challenges/w2-p1-16920/submissions/code/1355255776
