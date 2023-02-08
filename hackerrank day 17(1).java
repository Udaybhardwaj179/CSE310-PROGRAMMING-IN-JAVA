import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        if (n<3||n>29){
            System.out.print("Invalid Input");
            return;
        }
        int arr[]=new int[n];
        int a=sc.nextInt();
        arr[0]=a;
        int j=0;
        for (int i=1;i<n;i++){
            int s=sc.nextInt();
            if (s==arr[j]){
                continue;
            }
            arr[++j]=s;
        }
        for  (int i:arr){
            if (i!=0)
            System.out.print(i+" ");
        }
    }
}

// https://www.hackerrank.com/contests/cse310-k21gp-day18/challenges
