import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // 1. Convert to uppercase
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);

        // 2. Find length
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 3. Replace a character with another
        System.out.print("Enter a character to replace: ");
        char charToReplace = scanner.next().charAt(0);
        System.out.print("Enter a replacement character: ");
        char replacementChar = scanner.next().charAt(0);
        String replacedStr = str.replace(String.valueOf(charToReplace), String.valueOf(replacementChar));
        System.out.println("String after replacement: " + replacedStr);

        // 4. Extract a substring
        System.out.print("Enter the starting index of the substring: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the ending index of the substring: ");
        int endIndex = scanner.nextInt();
        String substring = str.substring(startIndex, endIndex);
        System.out.println("Extracted substring: " + substring);

        scanner.close();
    }
}


