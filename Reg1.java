import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890
public static void phonenumbervalidation(String number){
    String pattern = "^(\\d{3}[- ]?\\d{3}[- ]?\\d{4})$";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(number);
    if(m.matches()){
        System.out.println("valid phno: "+number);

    }else{
        System.out.println("in valid: "+number);
    }
}
    public static void main(String[] args){
        phonenumbervalidation("123-456-7890");
        phonenumbervalidation("123 456 7890");
        phonenumbervalidation("12-3456-7890");
        phonenumbervalidation("123-45-67890");
    }
}

