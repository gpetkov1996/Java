package instant_gredit_check;

import java.util.Scanner;

public class InstantCreditCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Get input
        System.out.println("Enter income: ");
        double income = scanner.nextDouble();
        System.out.println("Enter credit score: ");
        int creditScore = scanner.nextInt();

        // Check is the client approved
        System.out.println("Is the client approved: " + isApproved(income,creditScore));


    }

    public static boolean isApproved(double income, int creditScore){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if(income >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        }else{
            return false;
        }
    }
}
