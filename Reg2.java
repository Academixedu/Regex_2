import java.util.regex.*;
import java.util.Scanner;
public class Reg2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String regex="^[0-9]";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        if(m.matches()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
// Question: Write a regular expression that matches a string that starts with a digit (0-9).
// Example:
// Matches: "123abc", "4you"
// Does Not Match: "abc123", "you4"
}
