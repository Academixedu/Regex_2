import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String pattern = sc.nextLine();
        String regex = "^[0-9].*";
        
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(pattern);
        
        if (pattern.matches(regex)) {
            System.out.println(pattern + " Matches.");
        } else {
            System.out.println(pattern + " Does not Matches.");
        }
    }  
}
