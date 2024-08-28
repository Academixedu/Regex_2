import java.util.regex.Pattern;
public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
    public static void main(String[] args) {
        String regex = "^[^abc]";
        Pattern pattern = Pattern.compile(regex);
        String[] testStrings = {"def", "xyz", "123abc", "apple", "bat", "cat"};

        for (String str : testStrings) {
            if (pattern.matcher(str).find()) {
                System.out.println(str + " matches.");
            } else {
                System.out.println(str + " does not match.");
            }
        }
    }
}


    



