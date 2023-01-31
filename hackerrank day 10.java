import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);
        if ( Character.isLetter(x) && Character.isLetter(y) && x<y){
            for (char c=x;c<=y;c++ ){
                System.out.print(c+" ");
            }
        }
        else{
            System.out.println("ERROR");
        }
        
    }
}
// https://www.hackerrank.com/contests/cse310-k21gp-day12/challenges/29565-w3-p1/problem
