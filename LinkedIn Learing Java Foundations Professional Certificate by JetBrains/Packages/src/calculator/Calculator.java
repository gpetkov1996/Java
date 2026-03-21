package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        // Take inputs
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Choose option: "
        + "\n1. Add"
        + "\n2. Subtract"
        + "\n3. Multiply"
        + "\n4. Divide");
        int option = scanner.nextInt();
        double result = 0;

        switch (option){
            case 1:
                result = add(firstNumber,secondNumber);
                break;
            case 2:
                result = subtract(firstNumber,secondNumber);
                break;
            case 3:
                result = multiply(firstNumber,secondNumber);
                break;
            case 4:
                result = divide(firstNumber,secondNumber);
                break;
            default:
                break;
        }

        System.out.println("The result is: " + result);
    }

    // Add
    public static double add(int firstNumber, int secondNumber){
        return (double) firstNumber + secondNumber;
    }

    // Subtract
    public static double subtract(int firstNumber, int secondNumber){
        return (double)  firstNumber - secondNumber;
    }

    // Multiply
    public static double multiply(int firstNumber, int secondNumber){
        return (double) firstNumber * secondNumber;
    }

    // Divide
    public static double divide(int firstNumber, int secondNumber){
        return (double) firstNumber / secondNumber;
    }
}
