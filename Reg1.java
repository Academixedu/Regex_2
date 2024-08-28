import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890
public static void main(String args[]){
    String pattern="^\\d{3}[- ]?\\d{3}[- ]?\\d{4}$";
    String number="75-965-8865";
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(number);
    if(m.find())
    {
        System.out.println("valid");
    }
    else{
        System.out.println("invalid");
    }



    
}
}
