import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float r=sc.nextFloat();
        int t=sc.nextInt();
        int n =sc.nextInt();
        double compound;
        
        if (a<0 || n<0 || t<0 || r<0){
             System.out.print("0.0");
            return;
        }
        
        compound = a * (Math.pow(  (1 + r / n),n*t  )) ;
        System.out.print(compound);
    }
}
