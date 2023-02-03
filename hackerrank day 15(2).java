import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        String s=Long.toString(num);
        if(num<0||num>2147483647){
            System.out.println("Invalid Number");
        }
        else
            System.out.println(s.length());
    }
}//https://www.hackerrank.com/contests/cse310-k21gp-day15/challenges/cse310-288845-w3-2/submissions/code/1355772262
