import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg30{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void checkStarts(String input){
    String pattern = "^[^abcABC].*";
    Pattern compiled= Pattern.compile(pattern);
     Matcher matcher = compiled.matcher(input);
     if (matcher.matches()) {
        System.out.println("'" + input + "' starts with a character other than 'a', 'b', or 'c'.");
    } else {
        System.out.println("'" + input + "' starts with 'a', 'b', or 'c'");
    }
}
public static void main(String[] args) {
    Scanner sca = new Scanner(System.in);
    System.out.println("Enter a string");
    String input = sca.nextLine();
    checkStarts(input);
}
}
