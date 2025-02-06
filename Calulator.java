import java.util.Scanner;

public class Calulator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Prompt the user to choose an operation
        System.out.print("Enter '+' for addition, '-' for subtraction, '*' for multiplication, or '/' for division: ");
        char operation = scanner.next().charAt(0);

        // Perform the chosen operation
        switch (operation) {
            case '+':
                // Calculate and display the sum
                double sum = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
                break;
            case '-':
                // Calculate and display the difference
                double difference = num1 - num2;
                System.out.println("The difference between " + num1 + " and " + num2 + " is " + difference);
                break;
            case '*':
                // Calculate and display the product
                double product = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + product);
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    // Calculate and display the quotient
                    double quotient = num1 / num2;
                    System.out.println("The quotient of " + num1 + " divided by " + num2 + " is " + quotient);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                // Handle invalid operation input
                System.out.println("Invalid operation. Please enter '+', '-', '*', or '/'.");
                break;
        }

        // Close the scanner
}
