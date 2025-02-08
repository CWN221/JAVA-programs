import java.util.Scanner;

public class Shapes {
    
    double C, V, r;
    float cIn, vol;
    Scanner user = new Scanner(System.in);
        
        //Circumference
        public double circum() {
        System.out.print("Enter radius (circle): ");
        cIn = user.nextFloat();
        r = cIn;
        C = 2 * (22.0 / 7.0) * r;
        return C;
    }
         
        //Volume
        public double volume() {
        System.out.print("Enter radius (sphere): ");
        vol = user.nextFloat();
        r = vol;
        V = (4.0 / 3.0) * (22.0 / 7.0) * r * r * r;
        return V;
    }
    
    
    public static void main(String args[]) {
        Shapes circle = new Shapes();
        Shapes sphere = new Shapes();
        
        //Results
        double circumference = circle.circum();
        System.out.printf("The circumference of circle is %.2f\n", circumference); 
        
        double Volume = sphere.volume();
        System.out.printf("The volume of sphere is %.2f", Volume);
        

    }
}
