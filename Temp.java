import java.util.Scanner;

public class Temp {
    
    int choice;
    float c;
    double fahrenheit, celsius;
    Scanner input = new Scanner(System.in);
    
    void compute()
    {
        //Take choice input
        System.out.println("Choose a method of conversion: ");
        System.out.println("1.Celsius to Fahrenheit.");
        System.out.println("2.Fahrenheit to Celsius.");
        choice = input.nextInt();
        
        //Convert Celsius to Fahrenheit
        if (choice == 1)
        {
            System.out.println("Enter Temperature (Celsius): ");
            c = input.nextFloat();
            fahrenheit = ((1.8 * c) + 32);
            System.out.println(+ c +"C = " + fahrenheit + " Fahrenheit");
        } 
        //Convert Fahrenheit to Celsius
        else if (choice == 2) 
        {
            System.out.println("Enter Temperature (Fahrenheit): ");
            c = input.nextFloat();
            celsius = (5.0 / 9.0 * (c - 32));
            System.out.printf("%.1f F = %.2f Celsius",c , celsius);
        }
        
    
    }

    public static void main(String args[]) {
        Temp temp = new Temp();
        temp.compute();
        
    }
}
