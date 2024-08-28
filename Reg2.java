import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
public static void checkStart(String input) {
    String pattern = "^\\d.*";
     Pattern pat = Pattern.compile(pattern);
      Matcher mat = pat.matcher(input);
      if (mat.matches()) {
        System.out.println("'" + input + "' starts with a digit.");
    } else {
        System.out.println("'" + input + "' does not start with a digit.");
    }
}
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string");
    String input = scan.nextLine();
    checkStart(input);
}
}
