import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
 public static boolean startsWithExceptABC(String input) {
       
        String regex = "^[^abcABC].*";
        
       
        Pattern pattern = Pattern.compile(regex);
        
       
        Matcher matcher = pattern.matcher(input);
        
       
        return matcher.matches();
    }

    public static void main(String[] args) {
       
        String[] testStrings = {
            "def",
            "xyz",
            "123abc",
            "apple",
            "bat",
            "cat"
        };

       
        for (String str : testStrings) {
            System.out.println("String: \"" + str + "\" starts with a character except 'a', 'b', or 'c': " + startsWithExceptABC(str));
        }
    }
}
