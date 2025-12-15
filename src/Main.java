import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation.");
        Main m1 = new Main();
        System.out.println("Enter points for Line 1");
        Line l1 = new Line(m1.getPoint(), m1.getPoint());
        System.out.println("Length of Line 1: " + l1.length);
        System.out.println("Enter points for Line 2");
        Line l2 = new Line(m1.getPoint(), m1.getPoint());
        System.out.println("Length of Line 2: " + l2.length);

        if (l1.equals(l2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }

        int result = l1.compareTo(l2);
        if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else if (result < 0) {
            System.out.println("Line 1 is less than Line 2");
        } else {
            System.out.println("Line 1 and Line 2 are same");
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