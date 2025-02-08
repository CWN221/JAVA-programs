import java.util.Scanner;

public class WeightManagementApp {

        float initialWeight, dailyWeight;
        Scanner input = new Scanner(System.in);
        
        void compute()
        {
        // Prompt the user for input
        System.out.print("Enter your initial weight (in kg): ");
        initialWeight = input.nextFloat();
        
        double totalWeightLoss = 0;

        // Loop for 10 days to get the weight for each day
        for (int day = 1; day <= 10; day++) {
            System.out.print("Enter your weight for day " + day + " (in kg): ");
            dailyWeight = input.nextFloat();

            // Calculate weight loss for the day
            double weightLossForDay = initialWeight - dailyWeight;
            totalWeightLoss += weightLossForDay;

            // Update the initial weight for the next day's input
            initialWeight = dailyWeight;
        }

        // Calculate the average daily weight loss
        double averageDailyWeightLoss = totalWeightLoss / 10;

        // Display the results
        System.out.printf("\nTotal weight loss after 10 days: %.2f\n", totalWeightLoss);
        System.out.println("Average daily weight loss: " + averageDailyWeightLoss + " kg");
        
        }
    

    public static void main(String args[])
    {
        WeightManagementApp app = new WeightManagementApp();
        app.compute();
    }
}
