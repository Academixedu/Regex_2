import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890

 public static void mobileValidation(String s){
    String pattern="(\\d{3}(-?|\\s?)){2}\\d{4}";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(s);
     
    if (m.matches()) {
        System.out.println("Valid: " + s);
    } else {
        System.out.println("Invalid: " + s);
    }
 }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    mobileValidation(s1);
    sc.close();

   
}
}
