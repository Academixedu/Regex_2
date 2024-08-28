import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
public static void main(String[] args) {
    String pattern="^\\d";
    String number="1abdhtf5r6565f";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(number);
    if(m.find()){
        System.out.println("valid");
    }
    else{
        System.out.println("invalid");
    }
}
}
