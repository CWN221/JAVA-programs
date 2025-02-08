import java.util.Scanner;
public class Volume {

    float r,h;
    Scanner calc = new Scanner(System.in);
    void compute()
    {
        System.out.println("Enter radius: ");
        r = calc.nextFloat();
        
        System.out.println("Enter height: ");
        h = calc.nextFloat();
        
        double total = 3.142 * r * r * h;
        System.out.println("The volume of cylinder is " + total + " cc");
    }

    public static void main(String args[]) {
        Volume vol = new  Volume();
        vol.compute();
    }
}
