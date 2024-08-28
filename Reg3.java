import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void main(String[] args) {
    String regex = "^[^abc].*";
    String[] strings = {"def", "xyz", "123abc", "apple", "bat", "cat"};

    Pattern pattern = Pattern.compile(regex);

    for (String s: strings) {
        Matcher matcher = pattern.matcher(s);
        if (matcher.matches()) {
            System.out.println(s + " matches");
        } else {
            System.out.println(s + " does not match");
        }
    }
}
}


