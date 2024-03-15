import java.util.Scanner;

public class FinanceProgram {

    public static void main(String[] args) {

        /* Functions to be added:
        * 1. Store information in a file
        * 2. Add a date --> month and year
        * 3. Compare the results from this month to previous one
        * */

        // Initialize variables
        Scanner sc = new Scanner(System.in);
        int amount = 0;
        String label = "";
        boolean isEnd = false;
        int total_amount_food = 0;
        int total_amount_coffee = 0;
        int total_amount_other = 0;

        String food = "Food";
        String coffee = "Coffee";
        String other = "Other";

        while (!isEnd) {
            // Get amount
            System.out.print("Amount: ");
            amount = sc.nextInt();

            if (amount == 0) {
                isEnd = true;
                System.out.println("-".repeat(30));
            } else {
                // Get label
                System.out.print("Label: ");
                label = sc.next().toLowerCase();
            }

            if (label.equals("food")) {
                total_amount_food += amount;
            } else if (label.equals("coffee")) {
                total_amount_coffee += amount;
            } else if (label.equals("other")) {
                total_amount_other += amount;
            } else {
                System.out.println("No such category exists!");
                System.out.println(("Use one of the following:"));
                System.out.println(("1. Food"));
                System.out.println(("2. Coffee"));
                System.out.println(("3. Other"));
            }
        }

        // Display amount of money spent per category
        System.out.println("Money Spent:");
        System.out.println("Food --> " + total_amount_food);
        System.out.println(("Coffee --> " + total_amount_coffee));
        System.out.println(("Other --> " + total_amount_other));
    }
}
