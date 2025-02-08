/**
 *
 * @author BSE-01-0032/2024
 */
import java.util.Scanner;

public class Login {

    Scanner input = new Scanner(System.in);
    String setPass, passRetry,setUname, uName, pass;

    public void setPassword() {
        System.out.print("Set Username: ");
        setUname = input.nextLine();
        
        System.out.print("Set Password: ");
        setPass = input.nextLine();
        System.out.print("Repeat password: ");
        passRetry = input.nextLine();

        if (!setPass.equals(passRetry)) {
            System.out.println("Passwords do not match!");
        } else {
            System.out.println("Password set");
            userLogin();
        }
    }

    public void userLogin() {
        int attempts = 3;
        System.out.println("..........LOGIN..........");     

        while (attempts > 0) {
            System.out.print("Enter Username: ");
            uName = input.nextLine();
            System.out.println("Enter password: ");
            pass = input.nextLine();

            if (pass.equals(setPass) && setUname.equals(uName)) {
                System.out.println("Login Successful");
                return;
            } else if (!pass.equals(setPass) || !setUname.equals(uName)) {
                attempts--;
                System.out.println("Wrong Username or Password.\nYou have " + attempts + " attempts remaining");
            }
        }
        System.out.println("Too many attempts.");
    }

    public static void main(String args[]) {
        Login log = new Login();
        log.setPassword();
    }
}
