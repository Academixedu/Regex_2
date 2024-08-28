import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void charValidation(String s){
    String pattern="^[^abc]";
    Pattern p=Pattern.compile(pattern);
    Matcher m=p.matcher(s);

    if(m.find()){
        System.out.println("Matches: "+s);
    }
    else{
        System.out.println("Does Not Match: "+s);
    }

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    charValidation(input);
    sc.close();
}
}
