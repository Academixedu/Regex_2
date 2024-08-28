import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg3{
// Write a regular expression to match strings that start with any character except "a", "b", or "c".
// Example:
// Matches: "def", "xyz", "123abc"
// Does Not Match: "apple", "bat", "cat"
public static void main(String[] args) {
    String pa="^[^abc]";
    String s="aadsfsff";
    Pattern p=Pattern.compile(pa);
    Matcher m=p.matcher(s);
    if(m.find()){
        System.out.println("valid");
    }
    else{
        System.out.println("invalid");
    }
}
}
