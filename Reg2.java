import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
 public static boolean startsWithDigit(String input) {
        
        String regex = "^[0-9].*";
        
       
        Pattern pattern = Pattern.compile(regex);
        
       
        Matcher matcher = pattern.matcher(input);
        
        
        return matcher.matches();
    }

    public static void main(String[] args) {
        
        String[] testStrings = {
            "123abc",
            "4you",
            "abc123",
            "you4"
        };

      
        for (String str : testStrings) {
            System.out.println("String: \"" + str + "\" starts with a digit: " + startsWithDigit(str));
        }
    }
}
