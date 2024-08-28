public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
 public static boolean startsWithDigit(String input){
    String regex = "^[0-9].*"; 
    return input.matches(regex);
 } 

        public static void main(String[] args) {
            String[] testStrings = {"123abc", "4you", "abc123", "you4"};
            for (String str : testStrings) {
                boolean matches = startsWithDigit(str);
                System.out.println(str + ": " + (matches ? "Matches" : "Does Not Match"));
            }
        }
}
