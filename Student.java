
import java.util.Scanner;

//Student class
public class student {

    int admno;
    String sname;
    float eng, math, science, total;

    Scanner input = new Scanner(System.in);

    public void ctotal() {
        total = eng + math + science;
    }

    public void takeData() {
        System.out.println("Enter Admission Number: ");
        admno = input.nextInt();
        
        input.nextLine();

        System.out.println("Enter Name: ");
        sname = input.nextLine();

        System.out.println("Enter Eng marks: ");
        eng = input.nextFloat();

        System.out.println("Enter Science marks: ");
        science = input.nextFloat();

        System.out.println("Enter Math marks: ");
        math = input.nextFloat();

        System.out.println("\nPrinting results..........");
        System.out.println("\n");
        
    }

    public void showData() {
        System.out.println("Admission Number: " + admno);
        System.out.println("Name: " + sname);
        System.out.println("Eng marks: " + eng);
        System.out.println("Science marks: " + science);
        System.out.println("Math marks: " + math);
        System.out.println("Total : " + total);
    }

    public static void main(String args[]) {
        student stu = new student();
        stu.takeData();
        stu.ctotal();
        stu.showData();
    }
}
