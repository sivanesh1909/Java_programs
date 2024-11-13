import java.util.Scanner;

// Step 1: Define an interface for calculating the area
interface Shape {
    double area();  // Abstract method to calculate area
}

// Step 2: Implement the Shape interface for Rectangle
class Rectangle implements Shape {
    private double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

// Step 3: Implement the Shape interface for Triangle
class Triangle implements Shape {
    private double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Step 4: Implement the Shape interface for Circle
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class to handle user input and interaction
public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nChoose a shape to calculate the area:");
            System.out.println("1. Rectangle");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Shape shape = null;  // Declare a Shape reference

            switch (choice) {
                case 1:
                    System.out.print("Enter length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter breadth of the rectangle: ");
                    double breadth = scanner.nextDouble();
                    shape = new Rectangle(length, breadth);
                    break;

                case 2:
                    System.out.print("Enter base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter height of the triangle: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    break;

                case 3:
                    System.out.print("Enter radius of the circle: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    continue;
            }

            if (shape != null) {
                System.out.printf("The area is: %.2f\n", shape.area());
            }
        } while (choice != 4);

        scanner.close();
    }
}
