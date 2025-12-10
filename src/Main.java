import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation.");
        Main m1 = new Main();
        //constructor - a special method / function used to create object of the class
        Line l1 = new Line(m1.getPoint(), m1.getPoint());
        l1.calculateLength();
        Line l2 = new Line(m1.getPoint(),m1.getPoint());
        l2.calculateLength();

        int compareResult = Double.valueOf(l1.length).compareTo(Double.valueOf(l2.length));
        if(compareResult == 0){
            System.out.println("Line 1 is equal to Line 2");
        }
        else if(compareResult > 0){
            System.out.println("Line 1 is greater than Line 2");
        }
        else{
            System.out.println("Line 1 is less than Line 2");
        }
    }

    public Point getPoint() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x co-ordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter y co-ordinate: ");
        double y = sc.nextDouble();
        return new Point(x,y);
    }
}