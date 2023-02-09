import java.io.*;
import java.util.*;

public class Solution {
     enum Day{
            Monday,
            Tuesday,
            Wednesday,
            Thrusday,
            Friday,
            Saturday;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();    
    
    switch(s){    
      
    case "Monday": System.out.print("8:30 5:30");  
    break;    
    case "Tuesday":   
    break;    
    case "Wednesday":System.out.print("8:30 5:30");  
    break;    
    case "Thrusday":System.out.print("8:30 5:30"); 
    break;    
    case "Friday":System.out.print("8:30 5:30"); 
    break;    
    case "Saturday": System.out.print("9:30 4:30"); 
    break;    
      
    default:System.out.println("Library is closed");    
    }   
    }
}
