import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float arr[]=new float[n];
        for (int i=0;i<n;i++){
            int a=sc.nextInt();
            float sum=0;
            for (int j=0;j<a;j++){
                float b=sc.nextFloat();
                sum=sum+b;
            }
            arr[i]=sum/a;
        }
        int f=sc.nextInt();
        
        System.out.print("Average in Subject-"+f+" is "+arr[f-1]);
    }
}
// https://www.hackerrank.com/contests/cse310-k21gp-day19/challenges/w4-p2-16920/submissions/code/1356068399
