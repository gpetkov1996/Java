import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String word = scanner.nextLine().toLowerCase();

        System.out.print("Enter the input: ");
        String input = scanner.nextLine().toLowerCase();

        int result = countWords(word, input);

        System.out.println("The word can be formed " + result + " times.");

        scanner.close();
    }

    public static int countWords(String word, String input) {

        // Convert input to a mutable list of characters
        List<Character> availableChars = new ArrayList<>();

        for (char c : input.toCharArray()) {
            availableChars.add(c);
        }

        int counter = 0;

        while (true) {

            boolean wordFound = true;

            // Try to build the word one character at a time
            for (char targetChar : word.toCharArray()) {

                int index = availableChars.indexOf(targetChar);

                if (index == -1) {
                    wordFound = false;
                    break;
                }

                // Remove the found character so it cannot be reused
                availableChars.remove(index);
            }

            if (wordFound) {
                counter++;
            } else {
                break;
            }
        }

        return counter;
    }
}