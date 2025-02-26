
/**
 *
 * @author BSE-01-0032/2024
 * A java program illustrating hierarchy
 */
class shape {

    int a, b;

    void values() {
        a = 14;
        b = 8;
    }

}

class Triangle extends shape {

    void area() {
        values();
        //double area = a * b;
        System.out.printf("Area of triangle is %.2f\n", 0.5 * (a * b));
    }

}

class Rectangle extends shape {

    void area() {
        values();
        System.out.printf("Area of rectangle is %d", a * b);
    }
}

public class SHAPE {
    public static void main(String args[]) {
        // TODO code application logic here
        Triangle tri = new Triangle();
        Rectangle rect = new Rectangle();

        tri.area();
        rect.area();
    }
}
