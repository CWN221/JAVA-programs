import java.util.Scanner;

public class HydrationTracker {

    int days = 7;
    int totalNum = 0;

    void compute()
    {
        //Ask the user for input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of glasses taken in a week: ");
    
        for (int i = 1; i <= days; i++)
            {
                System.out.print("Day " + i + " = ");
                int no = input.nextInt();
                totalNum += no;
            }
    
        //Calculate the total number of glasses taken
        System.out.println("The total number of glasses taken in a week = " + totalNum);

        //Calculate average daily consumption
        double avg = totalNum / 7;
        System.out.println("Average daily consumption = " + avg + " glasses");
    
    }
    
    public static void main(String args[]) {
        HydrationTracker ht = new HydrationTracker();
        ht.compute();
        
    }
}
