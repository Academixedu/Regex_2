import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String pattern = sc.nextLine();
        String regex = "^[^abcABC].*";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern);
        
        if (pattern.matches(regex)) {
            System.out.println(pattern + " Matches.");
        } else {
            System.out.println(pattern + " Does Not Match.");
        }
    }   
}
