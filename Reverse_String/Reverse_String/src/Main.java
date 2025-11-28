void main() {
    // Get string input
    IO.print("Enter a string: ");
    Scanner sc = new Scanner(System.in);
    String userInput = sc.nextLine();

    // Get reversed string
    String output = reverseString(userInput);

    // Print reversed string
    IO.println("Reversed string: " + output);

    sc.close();
}

private static String reverseString(String input) {
    char[] inputToArray = input.toCharArray();
    char[] reversedString = new char[input.length()];

    int i = 0;
    for (int j = input.length() - 1; j >= 0; j--) {
        reversedString[i++] = inputToArray[j];
    }

    return new String(reversedString);
}
