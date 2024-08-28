import java.util.regex.*;
import java.util.Scanner;
public class Reg1{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String m = sc.nextLine();
        String regex = "^(\\d{3}[- ]?\\d{3}[- ]?\\d{4})$";
        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(m);
        if(m1.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }


       
    }
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890
}
