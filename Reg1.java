import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890

public static void main(String[] args) {    
    String input = "123-456-7890|123 456 7890|1234567890";
    String pattern = "[0-9]{3}-[0-9]{3}-[0-9]{4}|[0-9]{3} [0-9]{3} [0-9]{4}";
    Pattern compiledPattern = Pattern.compile(pattern);
    Matcher matcher = compiledPattern.matcher(input);
    System.out.println("Input: " + input);
    System.out.println("Matches: " + matcher.matches());
     if (matcher.matches()) {
        System.out.println("Valid phone number");
    } else {
        System.out.println("Invalid phone number");
    }
}
}
