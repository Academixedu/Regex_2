import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890
public static void validatePhoneNumber(String  phonenumber){
    System.out.println("phone number validtion: ");
    String pattern = "^(\\d{3}[- ]?\\d{3}[- ]?\\d{4})$";
    
    Pattern p = Pattern.compile(pattern);
    Matcher m = p.matcher(phonenumber);

    if(m.matches()){
        System.out.println("valid phone number :"+phonenumber );
    }
    else{
        System.out.println("not a valid phone number:"+phonenumber);
    }
}
public static void main(String[] args){

validatePhoneNumber("9014720938");
validatePhoneNumber("901-472-0938");
validatePhoneNumber("901 472 0938");
validatePhoneNumber("12-3456-7890");
}
}
