problem link:-   https://www.hackerrank.com/contests/cse310-k21gp-day2/challenges/w1-p1-16920/problem
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        long acNumber = sc.nextLong();
        sc.nextLine();
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int amount = sc.nextInt();
        int balance = 20000;
        if(amount>balance){
            if(gender=='M'){
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+amount+".");
            }else{
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Insufficient Funds! You can not withdraw "+amount+".");
            }
        }else{
            balance-=amount;
            if(gender=='M'){
                System.out.println("Hi Mr. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+balance+".");
            }else{
                System.out.println("Hi Ms. "+name+"!");
                System.out.println("Your Account Balance after withdrawl is "+balance+".");
            }
        }
    }
}
