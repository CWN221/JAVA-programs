import java.util.Scanner;

public class Wage {
    
    /*
    bs = basic salary
    hrs = No. of hours
    hr = hourly rate
    gs = gross salary
    np = net pay
    la = lunch allowance
    bp = basic pay
    */
    float hr = 15, bs, gs;
    double tax, np;
    int hrs;
    int la = 200;
    
    Scanner input = new Scanner(System.in);
    
    void calculations()
    {
        
        //No of hours worked
        System.out.print("Enter No. of hours: ");
        hrs = input.nextInt();
        
        //Lunch allowance
        System.out.println("Lunch allowance = $200");
        
        //Hourly rate
        System.out.println("Hourly rate = $15");
        
        bs = hrs * hr;
        System.out.println("Basic salary is $" + bs);
        
        gs = bs + la;
        System.out.println("Gross salary is $" + gs);
        
        tax = 0.30 * gs;
        System.out.printf("Income Tax: $%.2f\n", tax);
        
        np = gs - tax;
        System.out.printf("Net Pay: $%.2f\n", np);
    }

    public static void main(String args[]) {
        
        Wage calc = new Wage();
        calc.calculations();
    }
}
