import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== SIMPLE CALCULATOR ===");
        System.out.print("Enter the first number: ");
        double firstNumber = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter the second number: ");
        double secondNumber = input.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = firstNumber - secondNumber;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = firstNumber * secondNumber;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = firstNumber / secondNumber;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, * or /.");
        }

        input.close();
    }
}
