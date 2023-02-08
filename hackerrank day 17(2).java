import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String arr[]={"red","green","yellow","blue","white"};
        Scanner sc=new Scanner(System.in);
        String g=sc.nextLine();
        for (int i=0;i<arr.length;i++){
            if (arr[i].equalsIgnoreCase(g)){
                System.out.print(i);
                return;
            }
        }
    }
}
// https://www.hackerrank.com/contests/cse310-k21gp-day18/challenges/24906-w4-1/submissions/code/1356009518
