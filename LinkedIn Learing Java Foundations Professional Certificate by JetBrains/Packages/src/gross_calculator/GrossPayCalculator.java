package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args){
        //1. Get the number of hours worked
        int hours = 0;
        System.out.println("How many hours did you work?");

        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        //2. Get the hourly pay rate
        double payRate = 0;
        System.out.println("What is your pay rate?");
        payRate = scanner.nextDouble();

        scanner.close();

        //3. Multiply hour and pay rate
        double grossPay = hours * payRate;

        //4. Display results
        System.out.println("Gross  pay: " + grossPay);

    }
}
