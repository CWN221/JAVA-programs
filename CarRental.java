
/**
 *
 * @author BSE-01-0032/2024
 * Description: A Car Rental System
 */
import java.util.Scanner;

public class CarRental {

    //Data members
    float rate;
    int idNo, phNo, dur;
    double total, ptotal;
    String model, regno, custname, add;
    Scanner input = new Scanner(System.in);

    //User Login page
    public void login() {
        String uName, pwrd;
        int attempts = 3;

        System.out.println(".......Car Rental System.......");
        
        while (attempts > 0) {
            System.out.print("\nEnter Username(default:admin): ");
            uName = input.nextLine();

            System.out.print("Enter password(default:admin): ");
            pwrd = input.nextLine();

            if (uName.equals("admin") && pwrd.equals("admin")) {
                System.out.println("Login Successful");
                start();
            } else {
                attempts--;
                System.out.println("Wrong Username or Password.\nYou have " + attempts + " attempts remaining");
            }
        }
        System.out.println("Too many attempts!");
        exit();
    }

    public void start() {
        System.out.println("\nWELCOME");
        System.out.println("Enter choice;");
        System.out.println("    1. Rent Car");
        System.out.println("    2. Return Rental Car");
        System.out.println("    3. Add car to database");
        System.out.println("    4. Exit pragram");
        System.out.print("Choice: ");

        int decision = input.nextInt();

        switch (decision) {
            case 1:
                rentCar();
                break;
            case 2:
                rentalReturn();
                break;
            case 3:
                addCar();
                break;
            case 4:
                exit();
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

    public void rentCar() {
        car();
        customer();
        transactions();
        showData();
        start();
    }

    //Adding car to database
    public void addCar() {
        System.out.println("\nAdding new car...........");

        System.out.print("Car Manufacturer: ");
        String mfc = input.nextLine();

        input.nextLine();

        System.out.print("Car Model: ");
        model = input.nextLine();

        System.out.print("Car Registration: ");
        regno = input.nextLine();

        System.out.print("Number of passengers: ");
        int seats = input.nextInt();

        System.out.println("\n.....Done.....");
        
        System.out.println("Do you wish to exit program(Y/N)? ");
        char exitC = input.next().charAt(0);
        switch (exitC) {
            case 'Y':
            case 'y':
                exit();
                break;
            case 'N':
            case 'n':
                start();
                break;
            default:
                System.out.println("Invalid entry!");
        }

    }

    //Rental Car Details
    public void car() {
        System.out.println("Enter car details........\n");

        input.nextLine();

        System.out.print("Car Model: ");
        model = input.nextLine();
        //input.nextLine();

        System.out.print("Registration No. : ");
        regno = input.nextLine();
        //input.nextLine();

        System.out.println("");
    }

    //Customer Details
    public void customer() {
        System.out.println("Enter Customer's information.......\n");

        System.out.print("Customer's Name: ");
        custname = input.nextLine();
        //input.nextLine();

        System.out.print("Identification No. : ");
        idNo = input.nextInt();

        System.out.print("Home Address: ");
        add = input.nextLine();
        input.nextLine();

        System.out.print("Phone number: ");
        phNo = input.nextInt();
    }

    //Transactions Details
    public double transactions() {
        System.out.println("Transaction Details.....\n");

        rate = 40;
        System.out.println("Rental rate (per day) = $40.0");

        System.out.print("Rental duration(days): ");
        dur = input.nextInt();

        total = rate * dur;
        return 0;
    }

    //Rental Car return
    public void rentalReturn() {
        System.out.print("Registration No. : ");
        regno = input.nextLine();
        
        input.nextLine();

        System.out.println("Is the car in good condition?");
        System.out.println("1. Yes ");
        System.out.println("2. No ");
        int choice = input.nextInt();

        System.out.print("Duration(Days): ");
        dur = input.nextInt();

        total = 40 * dur;

        switch (choice) {
            case 1:
                System.out.println("No damage.");
                System.out.println("Total to be paid = $" + total);
                exit();
                break;
            case 2:
                System.out.println("Damage found. 30% penalty will be included.");
                ptotal = total + (0.30 * total);
                System.out.println("Total after penalty = $" + ptotal);
                exit();
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

    //Display results
    public void showData() {
        System.out.println("..........Results..........");
        System.out.println("Customer Name: " + custname);
        System.out.println("ID No. : " + idNo);
        System.out.println("Phone Number: " + phNo);
        System.out.println("Car Rented: " + model);
        System.out.println("Reg No.: " + regno);
        System.out.println("Rent Duration: " + dur);
        System.out.println("Total = $" + total);
        System.out.println("\n.....Done.....");

        System.out.println("Do you wish to exit program(Y/N)? ");
        char exitC = input.next().charAt(0);
        switch (exitC) {
            case 'Y':
            case 'y':
                exit();
                break;
            case 'N':
            case 'n':
                start();
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }    

    public void exit() {
        System.out.println("Exitting program........");
        System.exit(0);
    }

    public static void main(String args[]) {
        CarRental rent = new CarRental();
        rent.login();
    }
}
