https://www.hackerrank.com/contests/cse310-k21gp-day2/challenges/cse310-20260-1 (problem link)


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i=0;i<a;i++){
            if(i*i*i ==a){
                System.out.println("Perfect Cube");
                return;
            }
            
        }
        
                 System.out.println("Not Perfect Cube");
            
    }
}
