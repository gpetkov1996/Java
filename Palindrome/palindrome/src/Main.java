//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;  // Import the Scanner class

void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter word:");

    String userInput = myObj.nextLine();  // Read user input
    System.out.println(isPalindrome(String.valueOf(isPalindrome(userInput))));
}

public boolean isPalindrome(String s) {
    // Convert to small letters and remove all non-alphanumeric characters
    String lowerCaseString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    for (int i = 0; i < lowerCaseString.length(); i++) {
        for (int j = lowerCaseString.length() - 1; j--) {
//            if (lowerCaseString[i])
        }
    }

    return false;
}
