import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"

    public static void main(String[] args) {

        String input = "def,xyz,123abc";
        String pattern = "[^abc]";
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);
        System.out.println("Matches: ");
        while (matcher.find()) {
            System.out.println("Does  match: ");
       
        }
        
       

}}
