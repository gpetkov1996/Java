package decision_structures;

import java.util.Scanner;

public class QuotaChecker {

    public static void main(String[] args){

        //Initialize know values
        int quota = 10;

        // Get values for the unknown
        System.out.println("How many sales did te employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //Quick detour for the bonus earners
        if(sales > quota){
            System.out.println("Congrats! You've met your quota.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("you did not make your quota. You were " + salesShort + "sales short.");
        }
    }
}
