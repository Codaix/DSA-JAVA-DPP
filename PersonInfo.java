import java.util.Scanner;

public class PersonInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input name, age, height
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height (in feet, e.g., 5.9): ");
        float height = sc.nextFloat();

        // Output
        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);
    }
}

// To run this class, you need to right-click and "Run SwapValues" or set it as the main class in your IDE
class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        // Swapping without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Output
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
