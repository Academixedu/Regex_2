import java.util.Scanner;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
        public static boolean doesNotStartWithABC(String input) {
   
        String regex = "^[^abc].*";
        return input.matches(regex);
    }

        public static void main(String[] args) {
            String[] testStrings = {"def", "xyz", "123abc", "apple", "bat", "cat"};

        
        for (String str : testStrings) {
            boolean matches = doesNotStartWithABC(str);
            System.out.println(str + ": " + (matches ? "Matches" : "Does Not Match"));
        }
        }
}
