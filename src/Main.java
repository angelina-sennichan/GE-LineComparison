import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation.");
        Main m1 = new Main();
        //constructor - a special method / function used to create object of the class
        Line l1 = new Line(m1.getPoint(), m1.getPoint());
        l1.calculateLength();
    }
    public Point getPoint(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x co-ordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y co-ordinate: ");
        double y = sc.nextDouble();
        return new Point(x,y);
    }
}