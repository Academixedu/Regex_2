import java.util.Scanner;

public class Reg1{
// Write a regular expression to validate a 10-digit phone number. The phone number may have optional dashes or spaces separating groups of digits.
// Valid: 123-456-7890, 123 456 7890, 1234567890
// Invalid: 12-3456-7890, 123-45-67890

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Expression:");
            String s = sc.nextLine();

            String regex = "[0-9]{3}-[0-9]{3}-[0-9]{4}|[0-9]{3} [0-9]{3} [0-9]{4}|[0-9]{10}";

            if(s.matches(regex)){
                System.out.println("Valid id");
            }

            else{
                System.out.println("Invalid id");
            }    
            }
        }

