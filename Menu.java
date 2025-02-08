import java.util.Scanner;

public class Menu {
    int choice;
    
    Scanner input = new Scanner(System.in);
    
    void compute()
    {
        //Display choice
        System.out.println("Enter food choice");
        System.out.println("1. Pilau Plain");
        System.out.println("2. Githeri beef");
        System.out.println("3. Chapati chicken");
        System.out.println("4. Chips liver");
        System.out.println("5. Rice bean");
        System.out.println("Choice: ");
        //Take user choice
        choice = input.nextInt();
        
        switch(choice) {
            case 1:
                System.out.println("Pilau plain");
                break;
            case 2:
                System.out.println("Githeri beef");
                break;
            case 3:
                System.out.println("Chapati chicken");
                break;
            case 4:
                System.out.println("Chips liver");
                break;
            case 5:
                System.out.println("Rice bean");
                break;
            default:
                System.out.println("Any other selection");
        }
        
    }
   
    public static void main(String args[]) {
        Menu menu = new Menu();
        menu.compute();
    }
}
