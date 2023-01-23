import java.io.*;
import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double temperature = sc.nextDouble();

        if (choice == 1) {
            // Fahrenheit to Celsius
            double celsius = (temperature - 32) * 5 / 9;
            
            System.out.println(String.format("%.2f",celsius ));
        } else if (choice == 2) {
            // Celsius to Fahrenheit
            double fahrenheit = (temperature * 9 / 5) + 32;
            
            
            System.out.println(fahrenheit);
        } else {
            System.out.println("INVALID CHOICE");
        }
    }
}
