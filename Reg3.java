import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
    public static void Except(String Word){
        String pattern="^[^abc].*";
;
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(Word);
        if (m.matches()) {
            System.out.println("Matches: " + Word);
        } else {
            System.out.println("Does not match: " + Word);
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your word");
        String Word=sc.nextLine();
        
        Except(Word);
    }
}


