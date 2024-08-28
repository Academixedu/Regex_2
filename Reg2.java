import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg2{
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
    public static void combination(String Num_Alph){
        String pattern="^[0-9].*";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(Num_Alph);
        if (m.matches()) {
            System.out.println("Matches: " + Num_Alph);
        } else {
            System.out.println("Does not match: " + Num_Alph);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your combination");
        String Num_Alph=sc.nextLine();
        
        combination(Num_Alph);
    }
}
