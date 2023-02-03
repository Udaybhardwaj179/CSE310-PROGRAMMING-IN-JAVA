import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int a=s.length();
        int b=s1.length();
        int c=s2.length();
        if (a==b && b==c){
            System.out.println(-1);
            return;
        }
        {
            int d=Math.max(a,b);
            System.out.println(Math.max(d,c));
        }
    }
}//https://www.hackerrank.com/contests/cse310-k21gp-day15/challenges/cse310-21482-week3-2/copy-from/1355769764
