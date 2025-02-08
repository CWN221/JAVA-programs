
import java.util.Scanner;

public class Avg {
  
  public static void main(String[] arg)
  {
    
    Scanner scan = new Scanner(System.in);
    float average;
    float num1, num2;
    
    System.out.println("Enter two numbers");
    
    System.out.print("Num1: ");
    num1 = scan.nextFloat();
    System.out.println(num1);
    
    System.out.print("Num2: ");
    num2 = scan.nextFloat();
    System.out.println(num2);
    
    average = (num1 + num2) / 2;
    
    System.out.print("Average of num1 & num2 is " + average);
    
  }
  
}
