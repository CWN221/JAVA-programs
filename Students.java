import java.util.Scanner;

public class Students {

    int points;
    Scanner input = new Scanner(System.in);
    
    void compute()
    {
      //Take user input
        System.out.println("Enter points: ");
        points = input.nextInt();
        
        switch(points) {
            case 1:
                System.out.println("Distinction");
                break;
            case 2:
                System.out.println("Excellent");
                break;
            case 3:
                System.out.println("Good");
                break;
            case 4:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }    
 
    public static void main(String args[]) {
        Students stu = new Students();
        stu.compute();
    }
}
