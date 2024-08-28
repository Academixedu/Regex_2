import java.util.regex.*;
import java.util.Scanner;
public class Reg3{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String pattern=sc.nextLine();
        String regex="^[^abcABC].*";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(pattern);
        if(m.matches())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
}
